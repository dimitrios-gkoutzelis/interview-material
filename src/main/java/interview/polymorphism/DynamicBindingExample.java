package main.java.interview.polymorphism;

public class DynamicBindingExample {

    public static void main(String args[]) {
        /* Reference is of Human type and object is
         * Boy type
         */
        Humanoid obj = new Demo();
        /* Reference is of HUman type and object is
         * of Human type.
         */
        Humanoid obj2 = new Humanoid();
        obj.walk();
        obj2.walk();

        // In this example, overriding is actually happening since these methods are not static, private and final.
        // In case of overriding the call to the overriden method is determined at runtime by the type of object
        // thus late binding happens
    }
}

class Humanoid {
    //Overridden Method
    public void walk() {
        System.out.println("Human walks");
    }
}

class Demo extends Humanoid {
    //Overriding Method
    public void walk() {
        System.out.println("Boy walks");
    }

}

