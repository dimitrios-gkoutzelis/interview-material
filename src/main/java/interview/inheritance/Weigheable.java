package main.java.interview.inheritance;

public interface Weigheable {

    // Interfaces cannot have instance variables, the only way is to have constants and must be marked as static and final
    static final String MAX_WEIGHT = "100kg";

    //Interfaces can have constants or methods. The methods are always public and abstract so you don't have to specify
    void showMaxWeight();
}
