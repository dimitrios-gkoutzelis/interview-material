package main.java.interview.threads;

public class ThreadCreationViaInheritance extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("My thread run is over");
    }

    public ThreadCreationViaInheritance() {
        super("my extending thread");
        System.out.println("my thread created" + this);
        start();
    }

    public static void main(String[] args) {
        ThreadCreationViaInheritance thread1 = new ThreadCreationViaInheritance();
        try {
            while (thread1.isAlive()) {
                System.out.println("Main thread will be alive while the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread's run is over");

    }
}