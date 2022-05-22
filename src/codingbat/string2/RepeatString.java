package codingbat.string2;

/*
Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on.
You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
* */

public class RepeatString {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4));
    }

    public static String repeatFront(String str, int n) {
        StringBuilder s = new StringBuilder();

        for(int i=n-1; i>=0; i--) {
            s.append(str, 0, i + 1);
        }
        return s.toString();
    }
}
