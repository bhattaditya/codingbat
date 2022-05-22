package codingbat.string2;

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
* */

public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
    }

    public static String mixString(String a, String b) {
        StringBuilder str = new StringBuilder();
        int max = Math.max(a.length(), b.length());

        for (int i = 0; i < max; i++) {
            if (i < a.length())
                str.append(a.charAt(i));
            if (i < b.length())
                str.append(b.charAt(i));
        }
        return str.toString();
    }
}
