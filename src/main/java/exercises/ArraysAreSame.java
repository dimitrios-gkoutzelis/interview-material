package main.java.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAreSame {

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        if (a.length == 0 && b.length == 0) return true;
        if (a.length != b.length) return false;

        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));

        // For every element in the first Array. there is an element in the second array that is the "same"
        // regardless of order.
        Arrays.sort(b);
        List<Integer> integers = Arrays.stream(b).boxed().collect(Collectors.toList());

        for (int elem : a) {
            int sqrtOfElem = (int) Math.pow(elem, 2);
            int idx = Collections.binarySearch(integers, sqrtOfElem);
            if (idx < 0) return false;
            integers.remove(idx);
        }

        return true;
    }

    // Much more clever solution
    public static boolean comp2(int[] a, int[] b) {
        if ((a == null) || (b == null)) {
            return false;
        }
        int[] aa = Arrays.stream(a).map(n -> n * n).toArray();
        Arrays.sort(aa);
        Arrays.sort(b);
        return (Arrays.equals(aa, b));
    }
}
