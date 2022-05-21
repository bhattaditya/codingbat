package codingbat.map2;

/*
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.

firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([]) → {}
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstChar {
    public static void main(String[] args) {
        String[] strings = new String[4];
        strings[0] = "ab";
        strings[1] = "bc";
        strings[2] = "cd";
        strings[3] = "bcd";

        System.out.println(firstChar(strings));
        System.out.println("----------------------");
    }

    public static Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        String start;

        for (String value : strings) {
            start = String.valueOf(value.charAt(0));

            for (String s : strings) {
                String finalStart = start;
                List<String> list = Arrays.stream(strings).filter(string -> string.startsWith(finalStart)).collect(Collectors.toList());
                map.put(start, String.join("", list));
            }
        }
        return map;
    }

}
