package main.java.interview.inheritance;

public class ConstructorOverloading {
    String x;

    // We can have multiple Constructor signatures with different parameters. We can even have Constructor Chaining
    // where one calls the other
    public ConstructorOverloading() {

    }

    public ConstructorOverloading(String x) {
        this.x = x;
    }

    public ConstructorOverloading(char c) {
        this(Character.toString(c));
    }
}
