package main.java.interview.polymorphism.innerclasses;

public class OuterClass {

    private int age = 32;

    class InnerClass {
        public void printAge() {
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        // Pay attention to the special syntax
        OuterClass.InnerClass inn = new OuterClass().new InnerClass();
        inn.printAge();

    }
}
