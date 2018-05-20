package main.java.interview.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortingExample {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(15);
        numbers.add(7);
        numbers.add(29);
        numbers.add(-1);

        System.out.println("Numbers before calling sort(): " + numbers);
        Collections.sort(numbers);
        System.out.println("Numbers after being sorted: " + numbers);

        // Reverse sorting order
        Collections.reverse(numbers);
        System.out.println("Numbers sorted in reverse: " + numbers);

        // Word of advice: sorting using Collections only works with Java supported types like Integer, String etc
        // If you have custom made Classes you need them to implement the Comparable or Comparator interfaces.
    }
}
