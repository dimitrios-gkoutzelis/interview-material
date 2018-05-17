package main.java.interview.loops;

public class FibonacciUsingLoops {

    public static void main(String[] args) {
        printFibonacci();
    }

    private static void printFibonacci() {
        // Fibonacci is a series of numbers where every new number is the addition of the previous 2
        // e.g. 1, 2, 3, 5, 8, 13, 21, 34 etc

        int[] fibs = new int[10];
        fibs[0] = 0;
        fibs[1] = 1;
        fibs[2] = 1;

        System.out.println(fibs[0]);
        System.out.println(fibs[1]);
        System.out.println(fibs[2]);

        for (int i = 3; i < fibs.length; i++) {
            fibs[i] = fibs[i - 1] + fibs[i - 2];
            System.out.println(fibs[i]);
        }
    }
}
