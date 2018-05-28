package main.java.exercises;

import java.util.LinkedList;
import java.util.List;

public class ReverseLinkedList {

    public static List<String> reverseList(List<String> originalList) {
        if (originalList == null)
            throw new IllegalArgumentException("List is null");

        if (originalList.isEmpty() || originalList.size() == 1)
            return originalList;

        List<String> reversedList = new LinkedList<String>();
        int cnt = 0;

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(cnt, originalList.get(i));
            cnt++;
        }

        System.out.println("Original List: " + originalList);
        System.out.println("Reversed list: " + reversedList);

        return reversedList;
    }
}
