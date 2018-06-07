package main.java.exercises;


//  You are given a list/array which contains only integers (positive and negative). Your job is to sum only the
//  numbers that are the same and consecutive. The result should be one list.
//
//  Extra credit if you solve it in one line. You can asume there is never an empty list/array and there
//  will always be an integer.
//
//   [1,1,7,7,3] # should return [2,14,3]
//   [-5,-5,7,7,12,0] # should return [-10,14,12,0]

import java.util.ArrayList;
import java.util.List;

public class Consecutives {

    public static List<Integer> sumConsecutives(List<Integer> s) {

        List<Integer> finalList = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < s.size(); i++) {
            if (i < s.size() -1 && s.get(i + 1).equals(s.get(i))) {
                if (sum == 0)
                    sum = s.get(i) + s.get(i + 1);
                else
                    sum += s.get(i + 1);

            } else {
                if (sum != 0) {
                    finalList.add(sum);
                } else
                    finalList.add(s.get(i));
                sum = 0;
            }
        }
        return finalList;
    }
}
