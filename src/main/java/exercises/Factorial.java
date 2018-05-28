package main.java.exercises;

public class Factorial {

    public static long calculateFactorial(int factor) {
        if (factor < 0)
            throw new IllegalArgumentException("Factor must be > 0");
        if (factor == 0)
            return 0;
        if (factor == 1)
            return 1;

        return calculateFactorial(factor - 1) * factor;
    }
}
