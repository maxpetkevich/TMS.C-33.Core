package lesson4.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        getTaskOne();
        //getTaskTwo();
        //getTaskThree();
        //getTaskThree();
        //getTaskFour();
        //getTaskFive();
    }

    public static int[] createArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int index = input.nextInt();
        int[] numbers = new int[index];
        System.out.println("Select the type of array filling:\n1)Random\n2)From keyboard");
        Random random = new Random();
        int typeFilling = input.nextInt();
        switch (typeFilling) {
            case 1:
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = random.nextInt(0, 100);
                }
                System.out.println(Arrays.toString(numbers));
                break;
            case 2:
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print("number[" + i + "] = ");
                    numbers[i] = input.nextInt();
                }
                System.out.println(Arrays.toString(numbers));

                break;
            default:
                System.out.print("Error. Choose only 1 or 2");
        }
        return numbers;
    }

    public static void getTaskOne() {
        System.out.println("Task 1:");
        int[] numbers = createArray();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void getTaskTwo() {
        System.out.println("Task 2:");
        int[] numbers = createArray();
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }
        System.out.println("Max value: " + maxValue);
        System.out.println("Min value: " + minValue);
    }

    public static void getTaskThree() {
        System.out.println("Task 3:");
        int[] numbers = createArray();
        int minValue = numbers[0];
        int maxValue = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
        }
        System.out.println("Maximum element index: " + maxIndex);
        System.out.println("Minimum element index: " + minIndex);
    }

    public static void getTaskFour() {
        System.out.println("Task 4:");
        int[] numbers = createArray();
        int quantityZeroElements = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                quantityZeroElements++;
            }
        }
        if (quantityZeroElements == 0)
            System.out.println("No null elements!");
        else {
            System.out.println("Number of zero elements: " + quantityZeroElements);

        }
    }

    public static void getTaskFive() {
        System.out.println("Task 5:");
        int[] numbers = createArray();
        for (int i = 0; i < numbers.length / 2; i++) {
            int value = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = value;
        }
        System.out.println("Modified array: ");
        for (int el : numbers) {
            System.out.print(el + " ");
        }
    }

    public static void getTaskSix() {
        System.out.println("Task 6:");
        int[] numbers = createArray();
        boolean isIncreases = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                isIncreases = false;
                break;
            }
        }
        if (isIncreases) {
            System.out.println("The array is an increasing sequence");
        } else {
            System.out.println("The array is not an increasing sequence");
        }
    }
}


