package codingbat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        List<Integer> result1, result2, result6, result7;
        List<String> result3, result4, result5, result8, result9;
        
        result1 = doubling(List.of(1, 2, 3 ,4, 5));
        System.out.println("Doubling: " + result1);

        result2 = square(List.of(5, 6, 7, 8, 9, 10));
        System.out.println("Square: " + result2);

        result3 = addStar(List.of("a", "bb", "ccc"));
        System.out.println("AddStar: " + result3);

        result4 = copies3(List.of("a", "bb", "ccc"));
        System.out.println("Copies: " + result4);
        
        result5 = moreY(List.of("a", "b", "c"));
        System.out.println("MoreY: " + result5);
        
        result6 = math1(List.of(1, 2, 3, 4, 5));
        System.out.println("Math1: " + result6);

        result7 = rightDigit(List.of(1, 22, 93));
        System.out.println("RightDigit: " + result7);
        
        result8 = lower(List.of("Hello", "Hi"));
        System.out.println("Lower: " + result8);

        result9 = noX(List.of("ax", "bb", "cx"));
        System.out.println("NoX: " + result9);
    }

    private static List<String> noX(List<String> strings) {
        return strings.stream().map(str -> str.replace("x", "")).collect(Collectors.toList());
    }

    private static List<String> lower(List<String> strings) {
        return strings.stream().map(String::toLowerCase).collect(Collectors.toList());
    }

    private static List<Integer> rightDigit(List<Integer> integers) {
        return integers.stream().map(
          num -> num % 10
        ).collect(Collectors.toList());
    }

    private static List<Integer> math1(List<Integer> integers) {
        return integers.stream().map(num -> (num + 1) * 10).collect(Collectors.toList());
    }

    private static List<String> moreY(List<String> a) {
        return a.stream().map(str -> "y" + str + "y").collect(Collectors.toList());
    }

    private static List<String> copies3(List<String> a) {
        return a.stream().map(str -> str + str + str).collect(Collectors.toList());
    }

    private static List<String> addStar(List<String> a) {
        return a.stream().map(str -> str + "*").collect(Collectors.toList());
    }

    private static List<Integer> square(List<Integer> integers) {
        return integers.stream().map(num -> num * num).collect(Collectors.toList());
    }

    private static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(num -> num * 2).collect(Collectors.toList());
    }

}
