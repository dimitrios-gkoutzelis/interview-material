package main.java.exercises;

/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces. Spaces will be included only
 * when more than one word is present.
 */
public class SpinWords {

    public static String spinWords(String sentence) {

        // Always first, exit case
        if (sentence.length() == 0) return sentence;

        // Split to words
        String[] strArray = sentence.split(" ");

        StringBuilder sb = new StringBuilder(sentence.length());

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > 4)
                sb.append(reverseWord(strArray[i]));
            else
                sb.append(strArray[i]);

            if ( strArray.length > 1 && i != strArray.length - 1) sb.append(" ");
        }

        return sb.toString();
    }

    private static String reverseWord(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
