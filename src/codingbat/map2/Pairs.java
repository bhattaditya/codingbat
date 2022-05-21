package codingbat.map2;

/*
Given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first
character as a key with its last character as the value.

pairs(["code", "bug"]) → {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
*/

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public static void main(String[] args) {
        String[] strings = new String[4];
        strings[0] = "abc";
        strings[1] = "bcd";
        strings[2] = "cde";
        strings[3] = "efg";

        System.out.println(pairs(strings));
        System.out.println("----------------------");
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        String start;
        String last;

        for(String s: strings){
            start = String.valueOf(s.charAt(0));
            last = String.valueOf(s.charAt(s.length()-1));
            map.put(start, last);
        }

        return map;
    }

}
