package lesson14.homework;

import java.io.*;

public class LongestWordWrite {
    private static String longestWord = " ";
    public static void getLongestWord() {
        try(FileReader fr = new FileReader("src\\lesson14\\homework\\fileWithText.txt")) {
            StringBuilder text = new StringBuilder();
            int i;
            while ((i = fr.read()) != -1) {
                text.append((char) i);
            }
            String[] words = text.toString().split("\\W");
            for (String word : words) {
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
    public static void writeLongestWord(){
        try (FileWriter fw  = new FileWriter("src/lesson14/homework/fileWithLongestWord.txt")){
            fw.write(longestWord);
            System.out.println("Longest word written to file successfully");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

