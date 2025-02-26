package lesson18.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MyMain {
    public static void main(String[] args) {
        System.out.println("----------Task 1----------");
        getArrayList();
        System.out.println("----------Task 2----------");
        getName();
    }

    public static void getArrayList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int newList = list.stream().distinct().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Sum of sorted list: " + newList);
    }

    public static void getName() {
        Map<Integer, String> names = new HashMap<>();
        names.put(1, "Maxim");
        names.put(2, "Igor");
        names.put(3, "Andrey");
        names.put(5, "Angelina");
        names.put(6, "Sergey");
        names.put(7, "Dmitriy");
        names.put(8, "Alexandr");
        names.put(9, "Vadim");
        names.put(13, "Vlad");
        List<Integer> id = List.of(1, 2, 5, 8, 9, 13);
        List<String> result = names.entrySet().stream().
                filter(entry -> id.contains(entry.getKey()))
                .map(Map.Entry::getValue).
                filter(name -> name.length() % 2 != 0).
                map(name -> new StringBuilder(name).reverse().toString()).toList();
        System.out.println(result);
    }
}
