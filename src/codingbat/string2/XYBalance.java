package codingbat.string2;

/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
* */

public class XYBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("abcxabcy"));
    }

    public static boolean xyBalance(String str) {
        return str.indexOf('x') == -1 || str.lastIndexOf('x') < str.lastIndexOf('y');
    }

}
