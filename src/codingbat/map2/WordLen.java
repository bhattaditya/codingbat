package codingbat.map2;

/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
and the value is that string's length.

wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
*/

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public static void main(String[] args) {
        String[] strings = new String[4];
        strings[0] = "ab";
        strings[1] = "b";
        strings[2] = "cdee";
        strings[3] = "bcd";

        System.out.println(wordLen(strings));
        System.out.println("----------------------");
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, s.length());
            }
        }
        return map;
    }
}