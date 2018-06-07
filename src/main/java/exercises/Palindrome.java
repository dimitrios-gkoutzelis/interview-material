package main.java.exercises;

public class Palindrome {

    public static void main(String[] args) {

        String word = "Window";
        String palindrome = "racecar";
        String noon = "Noon";
        String topSpot = "Top spot";
        String misanthrope = "misanthrope";

        System.out.println("Is " + word + " a palindrome? " + isPalindrome(word));
        System.out.println("Is " + palindrome + " a palindrome? " + isPalindrome(palindrome));
        System.out.println("Is " + noon + " a palindrome? " + isPalindrome(noon));
        System.out.println("Is " + misanthrope + " a palindrome? " + isPalindrome(misanthrope));
    }

    private static boolean isPalindrome(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        int last = word.length() - 1;

        for (int i = 0; i < last / 2; i++) {
            if (chars[i] != chars[last]) {
                return false;
            }
            last--;

        }
        return true;
    }
}
