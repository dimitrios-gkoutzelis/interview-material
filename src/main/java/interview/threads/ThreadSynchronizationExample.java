package main.java.interview.threads;

public class ThreadSynchronizationExample {

    public static void main(String[] args) {
        Counter count = new Counter();
        // in both threads we pass the same counter, if we didn't synchronize one could read while the other was writing
        // and get corrupt data
        CounterThread t1 = new CounterThread(count);
        CounterThread t2 = new CounterThread(count);

        t1.start();
        t2.start();
    }
}

class Counter {
    private long count = 0;

    public long getCount() {
        return count;
    }

    // Only 1 thread can access the setter here and change the value of the count
    public synchronized void setCount(long count) {
        this.count = count;
    }
}

class CounterThread extends Thread {

    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.setCount(counter.getCount() + 1);
        }
    }
}
