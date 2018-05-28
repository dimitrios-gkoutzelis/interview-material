package main.java.interview.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Author> authors = new ArrayList<Author>();
        authors.add(new Author("JANE AUSTEN", 5));
        authors.add(new Author("RAY BRADBURY", 1));
        authors.add(new Author("GILLIAN FLYNN", 3));
        Collections.sort(authors); //sort using Comparable
        authors.sort(new AuthorComparator()); //sort using Comparator

        for (Author str : authors)
            System.out.println(str);



    }
}