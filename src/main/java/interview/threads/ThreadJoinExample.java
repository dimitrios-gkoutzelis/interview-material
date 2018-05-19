package main.java.interview.threads;

public class ThreadJoinExample extends Thread {

    @Override
    public void run() {
        System.out.println("Thread started: "+ this.getName());

    }

    public static void main(String[] args) {
        ThreadJoinExample t1 = new ThreadJoinExample();
        t1.start();

        ThreadJoinExample t2 = new ThreadJoinExample();
        t2.start();

        ThreadJoinExample t3 = new ThreadJoinExample();
        t3.start();


        // Because these run asynchronously, you get random results every time you run them, such as:
        //        Thread started: Thread-2
        //        Thread started: Thread-0
        //        Thread started: Thread-1

        ThreadJoinExample t4 = new ThreadJoinExample();
        t4.start();
        // Here we'll call join() on t4, so the current thread(main here) stops and waits for t4 to finish its execution
        // So basically once you join, everything halts until that thread finishes what it does.
        try {
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadJoinExample t5 = new ThreadJoinExample();
        t5.start();
        try {
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadJoinExample t6 = new ThreadJoinExample();
        t6.start();
        try {
            t6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // As you see threads 3,4,5 will always run at the right order, no matter what 0,1,2 do randomly
//        Thread started: Thread-0
//        Thread started: Thread-2
//        Thread started: Thread-3
//        Thread started: Thread-1
//        Thread started: Thread-4
//        Thread started: Thread-5
    }
}
