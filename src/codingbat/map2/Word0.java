package codingbat.map2;

/*
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
always with the value 0. For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later,
but for this problem the value is simply 0.

word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
*/

import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public static void main(String[] args) {
        String[] strings = new String[4];
        strings[0] = "ab";
        strings[1] = "bc";
        strings[2] = "cd";
        strings[3] = "bcd";

        System.out.println(word0(strings));
        System.out.println("----------------------");
    }
    public static Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!map.containsKey(strings[i]))
                map.put(strings[i], 0);
        }
        return map;
    }
}