package main.test.collections.sorting;

import main.java.interview.collections.sorting.Author;
import main.java.interview.collections.sorting.AuthorComparator;
import main.java.interview.collections.sorting.Student;
import main.java.interview.collections.sorting.StudentCompareByName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class SortingTest {

    @Test
    public void testSortingAuthors() {
        ArrayList<Author> authors = new ArrayList<Author>();
        authors.add(new Author("JANE AUSTEN", 5));
        authors.add(new Author("RAY BRADBURY", 1));
        authors.add(new Author("GILLIAN FLYNN", 3));
        Collections.sort(authors); //sort using Comparable
        authors.sort(new AuthorComparator()); //sort using Comparator

        for (Author str : authors)
            System.out.println(str);


        /** Example using the Comparaable Interface */
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("George", 112, 25));
        students.add(new Student("Maria", 117, 23));
        students.add(new Student("Captain", 118, 29));

        Collections.sort(students);
        System.out.println("Students after being sorted asc: " + students);
        Collections.reverse(students);
        System.out.println("Students after being sorted desc: " + students);

        /** Why would I use a Comparator and not just go with Comparable?
         * Well, with Comparable you can select the natural ordering field to judge comparisons.
         * But you can also have a few comparators that use other fields to sort by, in special cases
         * @link: http://www.digizol.com/2008/07/java-sorting-comparator-vs-comparable.html
         */

        // Now let's sort again using a comparator and not the natural ordering
        Collections.sort(students, new StudentCompareByName());
        System.out.println("Students after being sorted by name using StudentCompareByName(): " + students);
    }
}
