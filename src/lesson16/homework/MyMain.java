package lesson16.homework;

import java.util.HashMap;
import java.util.Map;

public class MyMain {
    public static void main(String[] args) {
        getTaskOne();
        System.out.println("---------------------------");
        getTaskTwo();
    }

    public static void getTaskOne() {
        String[] words1 = {"a", "b", "a", "c", "b"};
        String[] words2 = {"c", "b", "a"};
        String[] words3 = {"c", "c", "c", "c"};
        System.out.println(wordMultiple(words1));
        System.out.println(wordMultiple(words2));
        System.out.println(wordMultiple(words3));
    }

    public static void getTaskTwo() {
        String[] string1 = {"code", "bug"};
        String[] string2 = {"man", "moon", "main"};
        String[] string3 = {"man", "moon", "good", "night"};

        System.out.println(firstAndLastChar(string1));
        System.out.println(firstAndLastChar(string2));
        System.out.println(firstAndLastChar(string3));
    }


    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Boolean> result = new HashMap<>();
        Map<String, Boolean> seenOnce = new HashMap<>();

        for (String word : words) {
            if (seenOnce.containsKey(word)) {
                result.put(word, true);
            } else {
                seenOnce.put(word, false);
                result.put(word, false);
            }
        }
        for (String word : words) {
            if (!seenOnce.get(word)) {
                seenOnce.put(word, true);
                result.put(word, false);
            } else if (seenOnce.get(word) && !result.get(word)) {
                result.put(word, true);
            }
        }

        return result;
    }

    public static Map<String, String> firstAndLastChar(String[] strings) {
        Map<String, String> result = new HashMap<>();
        for (String str : strings) {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            result.put(String.valueOf(firstChar), String.valueOf(lastChar));
        }
        return result;

    }
}
