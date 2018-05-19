package main.java.interview.threads;

public class ThreadCreationViaRunnable implements Runnable {

    Thread myThread;

    public ThreadCreationViaRunnable() {
        this.myThread = new Thread(this);
        System.out.println("my thread created" + myThread);
        myThread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("my thread interrupted");
        }
        System.out.println("mythread run is over");
    }


    public static void main(String[] args) {

        ThreadCreationViaRunnable thread1 = new ThreadCreationViaRunnable();
        try {
            while (thread1.myThread.isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");

    }
}
