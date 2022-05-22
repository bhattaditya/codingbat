package codingbat.string2;

/*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
* */

public class DoubleChar {
    public static void main(String[] args) {
        System.out.println(doubleChar("abc..s"));
    }

    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length() ; i++) {
            result.append(str.charAt(i)).append(str.charAt(i));
        }
        return result.toString();
    }

}
