package main.java.interview.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorBasics {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();

        strings.add("A");
        strings.add("little fox");
        strings.add("went to the forest");
        strings.add(" to hunt");
        strings.add(" but got hunted instead.");

        Iterator<String> iter = strings.iterator();

        // Important point to make here is that there's no guaranteed Order with Iterators
        // In this case it works because String implements Comparable
        // We can also remove items from the collection if we want
        while(iter.hasNext()) {
            System.out.println(iter.next());
            iter.remove(); // Printing and removing all elements
        }

        // Be Careful: the Iterator has already reached its last element on previous loop. This will never run!!
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("Strings list after remove is: " + strings);
    }
}
