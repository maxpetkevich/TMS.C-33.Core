package lesson14.homework.task2;

import java.io.*;
import java.util.Scanner;

public class Documents {
    public static final String DOC_REGEX1 = "^docnum[A-Za-z0-9]{9}$";
    public static final String DOC_REGEX2 = "^contract[A-Za-z0-9]{7}$";

    public static void getDoc() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter address your document: ");
        try (BufferedReader br = new BufferedReader(new FileReader(input.nextLine()));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/lesson14/homework/task2/noValidDoc.txt"));
             BufferedWriter bw1 = new BufferedWriter(new FileWriter("src/lesson14/homework/task2/validDoc.txt"))) {
            String line = br.readLine();
            while (line != null) {
                if (line.matches(DOC_REGEX1)) {
                    bw1.write(line);
                    bw1.newLine();
                } else if (line.matches(DOC_REGEX2)) {
                    bw1.write(line);
                    bw1.newLine();
                } else {
                    bw.write(line +
                            " - this document number don't start with docnum or contract or haven't 15 characters");
                    bw.newLine();
                }
                line = br.readLine();

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
