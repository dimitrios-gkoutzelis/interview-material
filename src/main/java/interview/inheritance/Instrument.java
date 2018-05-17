package main.java.interview.inheritance;

public abstract class Instrument {
    String name;

    public void displayName() {
        System.out.println(name);
    }

    abstract public void printDetails();
}
