
//NOT FINISHED
package GuessWord;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {
        // 1. Welcoming statement
        // 2. Instruction -> if you consider to play, enter y -> next step, if n -> leave
        // 2.1. if leave -> finish the game
        // 2.2. if move on ->
        // 3. Let's have a set of words and try to guess this words
        // 4. We need to offer a player to guess a word or a letter
        // 5. If one letter has been entered -> guess a letter
        // 5.1. if more than one letter has been entered -> guess the word
        // 6. If you have guessed a word, check, YOU WON
        // 6.1. Ask would you like to play again and repeat the whole game
        // 6.2. If not, continue
        // 7. If you have guessed a letter, move on until all letters are opened
        // 7.1. If you have not guessed a letter ask to repeat
        // Проверка на повторы - если у меня в массиве две Р, три А, они все должны быть показаны
        // Открыты и больше он не должен на них реагировать или же сказать, что вы уже эту букву открыли
        startGame();
    }
        public static void startGame (){
            welcome();
            char[] hiddenWord = getHiddenWord().toCharArray();
            char[] openWord = new char[hiddenWord.length];
            Arrays.fill(openWord, 0, openWord.length, '*');
            while(true) {
                playOrNot();
                if (getInput().nextLine().equals("y")) {
                    int attempt = 20;
                    getMessagePlay();
                    printWord(openWord);
                    System.out.println();
                    getInputMsg();
                    while (attempt > 0 && attempt <= 20) {
                        String input = getInput().nextLine();
                        if (input.length() == 0) {
                            System.out.print("You have entered no value. Please, re-enter: ");
                            continue;
                        } else if (input.length() == 1) {
                            attempt--;
                            if (checkLetter(input, hiddenWord, openWord)) {
                                break;
                            }
                            System.out.println("You have " + attempt + " attempts left to guess the word");

                        } else if (input.length() > 1) {
                            attempt--;
                            if (checkWord(input, hiddenWord)) {
                                break;
                            }
                            System.out.println("You have " + attempt + " attempts left to guess the word");

                        }
                        if (attempt == 0) {
                            getLossMessage(hiddenWord);
                            break;
                        }

                    }

                } else {
                    System.out.println("\u001B[35m" + "You have decided to leave a game... GOODBYE!" + "\u001B[0m");
                    return;
                }
            }
    }

        public static void welcome () {
            System.out.println("\u001B[34m");
            System.out.println("------------------------------------------------------------------");
            System.out.println("Welcome to Guess a Word Game by TMS.");
            System.out.println("The instructions are the following.");
            System.out.println("If you enter a letter, we will check if there is a match.");
            System.out.println("If there is, we open it on the table and game moves on.");
            System.out.println("If not, repeat and try to guess a letter.");
            System.out.println("\u001B[4m" + "You have only 20 attempts to guess the word in full or by letter" +
                               "\u001B[0m");
            System.out.println("\u001B[34m" + "If you have guessed all letters, you HAVE WON.");
            System.out.println("If you enter two or more characters than we check a word fully.");
            System.out.println("If you guessed the word, you HAVE WON.");
            System.out.println("If not, you continue the game.");

            System.out.println("------------------------------------------------------------------" + "\u001B[0m");
        }

        public static String[] getArrayOfWords () {
            return new String[]{
                    "Apple",
                    "Banana",
                    "Flat",
                    "House",
                    "Pineapple",
                    "Belarus",
                    "Georgia",
                    "Infrastructure",
                    "Housewife",
                    "Feminist",
                    "Universe",
                    "Galaxy",
                    "Stars",
                    "Mexico",
                    "Watermelon",
                    "Housekeeper"
            };
        }

        public static String getHiddenWord () {
            String[] hiddenWord = getArrayOfWords();

            return hiddenWord[new Random().nextInt(0, hiddenWord.length)];
        }

        public static void printWord ( char[] word){
            for (char element : word) {
                System.out.print("'" + element + "'  ");
            }
        }

        public static void playOrNot () {
            System.out.println("\u001B[31m" + "------------------------------------------------------------------");
            System.out.print("If you want to play, enter y or any other value to leave: " + "\u001B[0m");
        }

        public static Scanner getInput () {
            return new Scanner(System.in);
        }

        public static void getMessagePlay () {
            System.out.println("Hidden word has been set. We can start a game now...");
        }

        public static void getInputMsg () {
            System.out.print("You see a hidden word on your screen. Please, enter a letter or a whole word: ");
        }

        public static boolean checkLetter (String input,char[] hiddenWord, char[] openWord){
            char guessedLetter = input.charAt(0);
            boolean letterIsCorrect = false;
            boolean alreadyGuessed = false;
            for (int i = 0; i < hiddenWord.length; i++) {
                if (openWord[i] == guessedLetter) {
                    alreadyGuessed = true;

                }
            }
            if (alreadyGuessed) {
                System.out.println("You already open this letter. Re-enter");
                return false;
            } else {
                for (int i = 0; i < hiddenWord.length; i++) {
                    if (hiddenWord[i] == guessedLetter) {
                        openWord[i] = hiddenWord[i];
                        letterIsCorrect = true;
                    }
                }
            }
            if (letterIsCorrect) {
                System.out.println("\u001B[32m" + "You entered the correct letter: " + new String(openWord) +
                                   " " + "\u001B[0m");
                if (Arrays.equals(hiddenWord, openWord)) {
                    getWonMessage();
                    return true;
                }
            } else {
                System.out.println("\u001B[31m" + "You have entered a wrong letter" + "\u001B[0m");
            }
            return false;
        }


        public static boolean checkWord (String input,char[] hiddenWord){
            if (!Arrays.equals(input.toCharArray(), hiddenWord)) {
                System.out.println("You have entered a wrong word.");
            } else {
                getWonMessage();

                return true;
            }
            return false;
        }

        public static void getWonMessage () {
            System.out.println("\u001B[33m\t" + "Congratulations! YOU HAVE WON!" + "\u001B[0m");
        }
        public static void getLossMessage(char[] hiddenWord){
            System.out.println("\u001B[41m"+ "GAME IS OVER!!!!" + "\u001B[0m");
            System.out.println("\u001B[32m" + "Your hidden word was : " + Arrays.toString(hiddenWord)+"\u001B[0m");

        }
    }

