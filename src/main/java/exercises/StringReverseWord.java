package main.java.exercises;

public class StringReverseWord {

    public static void main(String[] args) {

        // Reverse each word of a string
        System.out.print(reverseWords("Reverse the word of this string"));
    }

    private static String reverseWords(String str) {

        String[] strArray = str.split(" ");
        StringBuilder strBuffer = new StringBuilder();

        for (String x : strArray) {
            char[] chars = x.toCharArray();

            for (int i = chars.length - 1; i >= 0; i--) {
                strBuffer.append(chars[i]);
            }
            strBuffer.append(" ");
        }

        return strBuffer.toString();
    }
}
