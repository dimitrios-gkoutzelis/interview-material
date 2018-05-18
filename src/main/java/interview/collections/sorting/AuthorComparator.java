package main.java.interview.collections.sorting;

import java.util.Comparator;


public class AuthorComparator implements Comparator<Author> {
    @Override
    public int compare(Author o1, Author o2) {
        return o1.name.compareTo(o2.name);
    }
}
