package main.java.exercises;

public class DuplicateEncoder {
    public static String encode(String word) {
        StringBuilder sb1 = new StringBuilder(word.length());

        for (String s : word.toLowerCase().split("")) {
            int occurences = word.length() - word.toLowerCase().replace(s.toLowerCase(), "").length();
            if (occurences == 1)
                sb1.append("(");
            else
                sb1.append(")");
        }

        return sb1.toString();
    }
}
