package main.java.exercises;

public class SquareBoard {

    public static void main(String[] args) {

        int length = 5;

        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                    System.out.print(" # ");
            }
            System.out.println("");
        }
    }
}
