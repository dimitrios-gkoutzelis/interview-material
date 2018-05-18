package main.java.interview.strings;

public class StringPoolExample {

    public static void main(String[] args) {

        // 2 ways to create String, literal and new keyword
        String str1 = "string";
        String str2 = new String("string");

        // To understand the difference read about what a String Pool is here: https://www.journaldev.com/797/what-is-java-string-pool

        // When we use double quotes to create a String, it first looks for String with same value in the String pool,
        // if found it just returns the reference else it creates a new String in the pool and then returns the reference.

        // However using new operator, we force String class to create a new String object in heap space. We can use intern()
        // method to put it into the pool or refer to other String object from string pool having same value.

        // We should avoid using new String() as it creates unnecessary String objects in the heap even though they
        // might already exist in the StringPool
    }
}
