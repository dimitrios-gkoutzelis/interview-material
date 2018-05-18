package main.java.interview.strings;

import java.util.StringJoiner;

public class Java8StringJoiner {

    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner("-"); // First one is the delimiter, then prefix and then the suffix

        joiner.add("Lugano");
        joiner.add("Bellinzona");
        joiner.add("Milano");

        System.out.println(joiner.toString());

        joiner = new StringJoiner("-", "(", ")");
        joiner.add("Lugano");
        joiner.add("Bellinzona");
        joiner.add("Milano");

        System.out.println(joiner.toString());
    }
}
