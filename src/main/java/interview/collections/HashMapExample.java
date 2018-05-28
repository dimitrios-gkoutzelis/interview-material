package main.java.interview.collections;

import java.util.*;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>(100, 0.75f);
        map.put("Mary", "NewYork");
        map.put("Tomas", "London");
        map.put("Jan", "Rome");

        System.out.println(map.get("Mary")); //get value for a specific key
        System.out.println("keys:" + map.keySet()); //print all keys
        System.out.println("values:" + map.values()); //print all values
        System.out.println("entries:" + map.entrySet()); //print all entries
        System.out.println("Our map contains an entry with key Mary: " + map.containsKey("Mary")); //true

        Set setMap = map.entrySet();

        //print all elements of Map using iterator
        Iterator iterator = setMap.iterator();
        while (iterator.hasNext()) {
            Map.Entry mEntry = (Map.Entry) iterator.next();
            System.out.println(mEntry.getKey() + "\n" + mEntry.getValue());
        }

        //print all elements of Map using for loop
        for (Object aSetMap : setMap) {
            Map.Entry mEntry = (Map.Entry) aSetMap;
            System.out.println(mEntry.getKey() + "\n" + mEntry.getValue());
        }
    }
}
