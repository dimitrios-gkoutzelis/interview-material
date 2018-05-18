package main.java.interview.strings;

public class StringFunctions {

    public static void main(String[] args) {

        String str = "This is a very long string to play with";

        // Convert String to Int and vice versa. The same for all major classes like DOuble, Float
        int x = Integer.parseInt("54");  // Converts String to int
        System.out.println(x);

        String y = Integer.toString(54);
        System.out.println(y);


        // Remove trailing spaces from String
        String trimmedString = "Trim these   ".trim();
        System.out.println(trimmedString);

    }
}
