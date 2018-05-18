package main.java.interview.polymorphism;

public class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
    public static void main(String args[]){
        // Which sound() method will be called is determined at runtime so the example we gave above is a runtime polymorphism example.
        Animal obj = new Cat();
        obj.sound();
    }
}
