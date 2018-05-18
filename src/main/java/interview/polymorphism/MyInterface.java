package main.java.interview.polymorphism;

// IMPORTANT: an interface extends another Interface, but classes implement Interfaces
public interface MyInterface extends Runnable {

    // All interface variables are public, static and final by default
    public static final int MAX_WORDS = 300;

    void showName();
    // public and abstract are implied, not needed
    public abstract void showAddress();
}