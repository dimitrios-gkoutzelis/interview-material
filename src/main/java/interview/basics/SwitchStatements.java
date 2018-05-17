package main.java.interview.basics;

public class SwitchStatements {

    public static void main(String[] args) {
        int x = 500;

        // Until Java 7 only integers can be used on switch statements. From Java 8 Strings are allowed as well.
        switch(x) {
            case 100:
                System.out.println("Received 100");
                break;
            case 200:
                System.out.println("Received 200");
                break;
            default:
                System.out.println("Default");
        }

        char ch = 'x';

        // Chars are also integers so they can be used inside a switch.
        switch(ch) {
            case 'x':
                System.out.println("Received x");
                break;
            case 'k':
                System.out.println("Received k");
                break;
            default:
                System.out.println("Default");
        }
    }
}
