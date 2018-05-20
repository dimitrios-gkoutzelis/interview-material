package main.java.interview.collections;

import java.util.ArrayList;

public class ArrayListBasicsExample {

    public static void main(String[] args) {

        ArrayList<String> stringsList = new ArrayList<String>();

        stringsList.add("John");
        stringsList.add("Mary");
        stringsList.add("George");

        System.out.println("The names in our list at the moment are: " + stringsList);

        // Adding new items on an index where data were there before pushes the existing ones further down
        stringsList.add(1, "Jose");

        System.out.println("The names in our list at the moment are: " + stringsList);

        // Same for removing
        stringsList.remove(2);

        System.out.println("The names in our list at the moment are: " + stringsList);

        // Updating an existing item
        stringsList.set(0, "Marlo");

        System.out.println("The names in our list at the moment are: " + stringsList);

        // Retrieving an item
        System.out.println("The first item in the list is " + stringsList.get(0));

        // Clear all items from the list
        stringsList.clear();

        System.out.println("The names in our list at the moment are: " + stringsList);

        /** Initialisation and looping  */

        stringsList.add("John");
        stringsList.add("Mary");
        stringsList.add("George");

        for (String str : stringsList) {
            System.out.println("Printing list item: " + str);
        }

        for (int i = 0; i < stringsList.size(); i++) {
            System.out.println("Printing item with traditional loop: " + stringsList.get(i));
        }

    }
}
