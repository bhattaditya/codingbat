package codingbat.map2;

/*
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different
string, with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
*/

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String[] strings = new String[4];
        strings[0] = "ab";
        strings[1] = "bc";
        strings[2] = "cd";
        strings[3] = "bc";

        System.out.println(wordCount(strings));
        System.out.println("----------------------");
    }

    public static Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s: strings) {
            if(!map.containsKey(s)){
                map.put(s, 1);
            }else{
                map.put(s, map.get(s) + 1);
            }
        }
        return map;
    }

}
