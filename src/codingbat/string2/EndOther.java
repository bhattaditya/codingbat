package codingbat.string2;

/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
* */

public class EndOther {
    public static void main(String[] args) {
        System.out.println(endOther("abc", "pqrAbC"));
    }

    public static boolean endOther(String a, String b) {
        int aL = a.length();
        int bL = b.length();

        if (aL > bL)
            return a.substring(aL - bL).equalsIgnoreCase(b);

        return b.substring(bL - aL).equalsIgnoreCase(a);
    }

}
