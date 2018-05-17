package main.java.interview.inheritance;

// An interface can extend as many other interfaces as it wants. All it does is make a new interface that has all those
// abstract methods included. A class that extends Orchestrable must now implement the methods of all 3 of them.
public interface Orchestrable extends ZurichInsurable, Weigheable {
    boolean isEligibleForOrchestra();
}
