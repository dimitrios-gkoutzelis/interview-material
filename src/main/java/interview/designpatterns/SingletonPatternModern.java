package main.java.interview.designpatterns;

/**
 * This is by far the best approach to create Singletons after java 1.5
 */
public enum SingletonPatternModern {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void displayValue() {
        System.out.println("Value is " + value);
    }
}
