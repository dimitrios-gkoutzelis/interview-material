package main.java.interview.collections.sorting.algorithms;

import java.util.List;

public class BinarySearch {

    public static boolean binarySearch(List<Integer> ints, Integer toFind) {
        if (ints == null || ints.size() == 0) {
            return false;
        }

        // As this is a sorted list, we can use that to our advantage to keep searching until we find it, but starting
        // from a place where it makes most sense such as the middle
        int mid = ints.size() /2;

        if (ints.get(mid).equals(toFind))
            return true;
        else {
            if (toFind.compareTo(ints.get(mid)) > 0)
                return binarySearch(ints.subList(mid+1, ints.size()), toFind);
            else
                return binarySearch(ints.subList(0, mid), toFind);
        }
    }
}
