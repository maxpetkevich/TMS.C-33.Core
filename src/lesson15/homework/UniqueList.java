package lesson15.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueList {
    public static void getUniqueArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        String line = input.nextLine();
        String[] numbers = line.split(" ");
        Set<String> uniqueNumbers = new HashSet<>(Arrays.asList(numbers));
        System.out.println(uniqueNumbers);

    }
}
