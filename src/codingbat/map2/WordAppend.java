package codingbat.map2;

/*
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array,
append the string to the result. Return the empty string if no string appears a 2nd time.

wordAppend(["a", "b", "a"]) → "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
wordAppend(["a", "", "a"]) → "a"
*/

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public static void main(String[] args) {
        String[] s = {"a", "b", "a", "c"};

        System.out.println(wordAppend(s));
        System.out.println("----------------------");
    }

    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();

        for(String s: strings){
            if(!map.containsKey(s)){
                map.put(s, 1);
            } else{
                map.put(s, map.get(s) + 1);
            }
            if (map.get(s) == 2){
                map.remove(s);
                result.append(s);
            }
        }
        return result.toString();
    }

}
