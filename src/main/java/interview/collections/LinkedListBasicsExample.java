package main.java.interview.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListBasicsExample {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("John");
        list.add("Maria");
        list.add("Jack");

        list.addFirst("Captain");

        System.out.println(list);

        System.out.println("Print second item in linked list: " + list.get(1));

        // Like ArrayLists, to update use set()
        list.set(0, "CaptainIgloo");

        System.out.println("New list after update: " + list);

        list.remove(1);
        System.out.println("New list after removal of 2nd: " + list);

        // Looping
        for (String str: list) {
            System.out.println(str);
        }

        // Convert linkedList to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(list);

        for (String str: arrayList) {
            System.out.println(str);
        }
    }
}
