package lesson17.homework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("---------Task 1---------");
        getBirthDayThroughHundred();
        System.out.println("---------Task 2---------");
        getPositiveNumbers();
        System.out.println("---------Task 3---------");
        changeMoneyWithFunction();
        System.out.println("---------Task 4---------");
        changeMoneyWithConsumer();
        System.out.println("---------Task 5---------");
        getBackwardsString();
    }

    public static void getBirthDayThroughHundred() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your date of birth(yyyy/MM/dd): ");
        String birthDay = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.parse(birthDay, formatter);
        LocalDate birthDayThroughHundred = localDate.plusYears(100);
        System.out.println("Date when you turn 100 years old: " + birthDayThroughHundred);
    }

    public static void getPositiveNumbers() {
        int[] numbers = new int[]{1, 2, 3, -4, 5, -6, 7, 9, -10};
        Predicate<Integer> isPositive = numbersPositive -> numbersPositive > 0;
        System.out.print("Positive elements of array: ");
        for (int el : numbers) {
            if (isPositive.test(el)) {
                System.out.print(el + " ");
            }
        }
        System.out.println();
    }

    public static void changeMoneyWithFunction() {
        String valueBYN = "350 BYN";
        double course = 3.5;
        Function<String, Double> parse = value -> {
            String[] parts = value.split(" ");
            double BYN = Double.parseDouble(parts[0]);
            return BYN / course;
        };
        double valueUSD = parse.apply(valueBYN);
        System.out.println(valueBYN + " = " + valueUSD + " USD");
    }
    public static void changeMoneyWithConsumer() {
        String valueBYN = "350 BYN";
        double course = 3.5;
        Consumer<String> formatter = value ->{
          String[]parts= value.split(" ");
          double BYN = Double.parseDouble(parts[0]);
          double valueUSD = BYN/course;
            System.out.println(valueBYN + " = " + valueUSD + " USD");
        };
        formatter.accept(valueBYN);
    }
    public static void getBackwardsString(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = input.nextLine();
        Supplier<String> supplier = () -> {
          StringBuilder reversedStr = new StringBuilder(str).reverse();
          return reversedStr.toString();
        };
        System.out.println("Backwards string: "+ supplier.get());
    }
}
