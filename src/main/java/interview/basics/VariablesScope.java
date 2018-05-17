package main.java.interview.basics;

public class VariablesScope {

    // This is a static or class variable, all objects can access or modify it
    private static String classString = "staticVar";

    // This is an instance variable, each object has a unique one
    private String name;

    public VariablesScope(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // This is a local variable, it only exists within this method
        String name = "Madrid";
        System.out.println("Hello");

        // Notice how static variables do not require an object reference to be used
        System.out.println("Static variable is " + classString);

        VariablesScope b = new VariablesScope("Barcelona");
        System.out.println("Object's name is " + b.getName());
        System.out.println("Local name is " + name);
    }
}
