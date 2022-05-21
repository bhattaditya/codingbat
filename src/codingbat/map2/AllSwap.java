package codingbat.map2;

/*
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array,
swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything. Using a map,
this can be solved making just one pass over the array. More difficult than it looks.

allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public static void main(String[] args) {
        String[] s = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(Arrays.toString(allSwap(s)));
        System.out.println("----------------------");
    }

    public static String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i< strings.length; i++){
            String start = String.valueOf(strings[i].charAt(0));

            if(!map.containsKey(start)){
                map.put(start, i);
            }else {
                int index =  map.get(start);
                String tmp = strings[i];
                strings[i] = strings[index];
                strings[index] = tmp;

                map.remove(start);
            }
        }
        return strings;
    }
}
