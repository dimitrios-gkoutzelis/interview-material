package main.java.interview.collections.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Author implements Comparable<Author> {
    String name;
    int id;

    public Author(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + "\n" + id;
    }

    @Override
    public int compareTo(Author author) {
        return this.name.compareTo(author.name);
    }
}
