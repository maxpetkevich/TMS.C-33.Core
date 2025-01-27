package lesson11.homework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class StringProcessing {
    public static void main(String[] args) {
        String[] strings = createString();
        System.out.println("----------------------------");
        printShortAndLongString(strings);
        System.out.println("----------------------------");
        sortStrings(strings);
        System.out.println("----------------------------");
        printShorterThanAverageString(strings);
        System.out.println("----------------------------");
        printUniqueWord(strings);
        System.out.println("----------------------------");
        duplicate();
        System.out.println("----------------------------");
        findPalindrome();
    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }

    public static String[] createString() {
        System.out.println("Please, enter 3 strings");
        String[] strings = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("String " + (i+1) + ": ");
            strings[i] = getInput().nextLine();

        }
        System.out.println("Entered strings: ");
        System.out.println("1. " + strings[0]);
        System.out.println("2. " + strings[1]);
        System.out.println("3. " + strings[2]);
        return strings;
    }

    public static void printShortAndLongString(String[] strings) {
        String shorString = strings[0];
        String longString = strings[0];
        for (String string : strings) {
            if (string.length() < shorString.length()) {
                shorString = string;
            }
            if (string.length() > longString.length()) {
                longString = string;
            }
        }
        System.out.println("The shortest string: " + shorString);
        System.out.println("The longest string: " + longString);

    }

    public static void sortStrings(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length));
        System.out.println("Sorted strings by length: ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static void printShorterThanAverageString(String[] strings) {
        double stringLength = 0;
        for (String string : strings) {
            stringLength += string.length();
        }
        double averageLength = stringLength / strings.length;
        System.out.println("Average length: " + averageLength);
        System.out.println("Strings with shorter length than average: ");
        for (String string : strings) {
            if (string.length() < averageLength) {
                System.out.println(string + "\nlength: " + string.length() + "\n");
            }
        }

    }

    public static void printUniqueWord(String[] strings) {
        boolean flag;
        String word = "";
        HashSet<Character> hashSet = new HashSet<>();
        for (String string : strings) {
            flag = true;
            for (Character character : string.toCharArray()) {
                if (hashSet.contains(character)) {
                    flag = false;
                    break;
                } else {
                    hashSet.add(character);
                }
            }
            if (flag) {
                word = string;
                System.out.println("Unique word: " + word);
                break;
            }
            else{
                System.out.println("No unique word");
                break;

            }
        }

    }

    public static void duplicate() {
        System.out.println("Enter string: ");
        String[] strings = getInput().nextLine().split(" ");
        System.out.print("Duplicating letters of words in a string: ");
        for (String string : strings) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Character character : string.toCharArray()) {
                stringBuilder.append(character).append(character);
            }
            System.out.print(stringBuilder + " ");
        }
        System.out.println();
    }

    public static void findPalindrome() {
        System.out.print("Enter string: ");
        String[] string = getInput().nextLine().split(" ");
        System.out.print("Enter number of word which you want to check of palindrome: ");
        int number = getInput().nextInt();
        boolean flag = true;
        String word;
        if (number >= 1 && number <= string.length) {
            word = string[number - 1];
            char[] wr = word.toCharArray();
            for (int i = 0; i < wr.length / 2 - 1; i++) {
                if (wr[i] != wr[wr.length - i - 1]) {
                    flag = false;
                    System.out.println(word + " isn't palindrome");
                    break;
                }
            }
            if (flag) {
                System.out.println(word + " is palindrome" );
            }
        }


    }
}
