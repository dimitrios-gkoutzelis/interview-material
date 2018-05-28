package main.java.interview.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorsJava8Style {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("A");
        strings.add("little fox");
        strings.add("went to the forest");
        strings.add(" to hunt");
        strings.add(" but got hunted instead.");

        // The non-iterator way
        strings.forEach(System.out::println);

        // with Iterator
        strings.iterator().forEachRemaining(System.out::println);

        // Another Java8 special: using ListIterator and telling it where to start
        ListIterator<String> listIter = strings.listIterator(strings.size() - 1); // iterator to start from end

        while (listIter.hasPrevious()) {
            System.out.println(listIter.previous());
        }

        // Same as before but iterates from the start
        ListIterator<String> listIterFromBeginning = strings.listIterator();
        listIterFromBeginning.forEachRemaining(System.out::println);

        // The Iterator interface allows us to modify a collection while traversing it, which is more difficult with a simple for/while statement.
    }
}
