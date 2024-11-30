package lesson3.homework;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Task 1");
        getTaskOne();
        System.out.println("Task 2");
        getTaskTwo();
        System.out.println("Task 3");
        getTaskThree();
        System.out.println("Task 4");
        getTaskFour();
        System.out.println("Task 5");
        getTaskFive();
    }

    public static void getTaskOne() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter value: ");
        int value = input.nextInt();
        if (value % 2 == 0) {
            System.out.println("Value is even\n");
        } else
            System.out.println("Value is odd\n");
    }

    public static void getTaskTwo() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter temperature value: ");
        int temperature = input.nextInt();
        if (temperature > -5) {
            System.out.println("Warm\n");
        } else if (temperature > -20) {
            System.out.println("Normal\n");
        } else {
            System.out.println("Cold\n");
        }
    }

    public static void getTaskThree() {
        for (int value = 10; value <= 20; value++) {
            System.out.print(value * value + " ");
        }
        System.out.println("\n");
    }

    public static void getTaskFour() {
        int value = 7;
        while (value <= 98) {
            System.out.print(value + " ");
            value += 7;
        }
        System.out.println("\n");
    }

    public static void getTaskFive() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter value A: ");
        int enterValue = input.nextInt();
        while (enterValue < 0) {
            System.out.println("Value must be > 0");
            enterValue = input.nextInt();
        }
        int result = 0;
        for (int value = 1; value <= enterValue; value++) {
            result += value;
        }
        System.out.println(result);
    }
}
