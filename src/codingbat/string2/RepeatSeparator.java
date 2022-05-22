package codingbat.string2;

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
* */

public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Hello", ".", 3));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder sB = new StringBuilder();

        for(int i=0 ; i<count; i++) {
            if (i<count -1)
                sB.append(word).append(sep);
            else
                sB.append(word);
        }

        return sB.toString();
    }

}
