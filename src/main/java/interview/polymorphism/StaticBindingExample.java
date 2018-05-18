package main.java.interview.polymorphism;

public class StaticBindingExample {

    public static void main(String args[]) {
        /* Reference is of Human type and object is
         * Boy type
         */
        Human obj = new Boy();
        /* Reference is of Human type and object is
         * of Human type.
         */
        Human obj2 = new Human();
        obj.walk();
        obj2.walk();

        // Static methods are class methods and we don't even look at the objects. They will always have the same implementation
        // Even if you have a subclass with the identical static method as the parent, it doesn't matter. It won't kick in as it does
        // not look into the objects itself, just the class definitions. Nice question for interviews.
    }
}

class Human {
    public static void walk() {
        System.out.println("Human walks");
    }
}

class Boy extends Human {
    public static void walk() {
        System.out.println("Boy walks");
    }

}