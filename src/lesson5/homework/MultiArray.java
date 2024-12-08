package lesson5.homework;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        System.out.println("-------------------------------------");
        System.out.println("Task 1");
        getSumElementsArray();
        System.out.println("-------------------------------------");
        System.out.println("Task 2");
        createChessboard();
        System.out.println("-------------------------------------");
        System.out.println("Task 3");
        createArrayWithSnakeFilling();
        System.out.println("-------------------------------------");
    }

    public static Scanner getScanner() {
        return new Scanner(System.in);
    }

    public static void getSumElementsArray() {
        Random random = new Random();
        System.out.println("Source array: ");
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(0, 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Enter the number to be added to each element: ");
        int addNumber = getScanner().nextInt();
        int sumOfElements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += addNumber;
                sumOfElements += array[i][j];
            }
        }
        System.out.println("Sum of all elements = " + sumOfElements);
    }

    public static void createChessboard() {
        String[][] chessboard = new String[8][8];
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                if ((i + j) % 2 == 0)
                    chessboard[i][j] = "W";
                else
                    chessboard[i][j] = "B";
                System.out.print(chessboard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void createArrayWithSnakeFilling() {
        System.out.print("Enter a number of lines: ");
        int lines = getScanner().nextInt();
        System.out.print("Enter a number of rows: ");
        int rows = getScanner().nextInt();
        int[][] array = new int[lines][rows];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = count++;
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--) {
                    array[i][j] = count++;
                }
            }
        }
        for (int[] numbers : array) {
            for (int el : numbers) {
                System.out.print(String.format("%3d", el) + " ");
            }
            System.out.println();
        }
    }
}