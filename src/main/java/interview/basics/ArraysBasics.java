package main.java.interview.basics;

public class ArraysBasics {

    public static void main(String[] args) {
        // Creation of single dimension array in 2 ways

        // With the normal way of saying how big it is
        Integer[] integers = new Integer[3];
        integers[0] = 1;
        System.out.println("Array size for ints is " + integers.length);

        // With direct initialisation, size here is equivalent to number of initial values
        String[] strings = {"One", "Two", "Three"};
        System.out.println("Array size for strings is " + strings.length);

        // 2 dimension array
        String[][] chessBoard = new String[1][2];
        String[][] chessBoard2 = {{"1"}, {"2"}};


        // You can even have unequal arrays inside
        String[][] strArray = new String[3][];
        strArray[0] = new String[5];
        strArray[1] = new String[2];
        strArray[2] = new String[4];
    }
}
