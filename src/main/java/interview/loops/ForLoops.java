package main.java.interview.loops;

public class ForLoops {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Basic loop, i = " + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Counting down from 10, i = " + i);
        }

        // Example of Array Creation and subsequent looping through it
        String[] strings = new String[5];
        strings[0] = "Lorem";
        strings[1] = "ipsum";
        strings[2] = "as";
        strings[3] = "an";
        strings[4] = "example";

        for (int i = 0; i < 5; i++) {
            System.out.print(strings[i] + " ");
        }

        System.out.print( "\n");

        // The same but using the enhanced For loop
        for (String x: strings) {
            System.out.print(x + " ");
        }


    }
}
