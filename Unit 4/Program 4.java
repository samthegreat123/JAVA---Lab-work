//42. Write a java program to create two threads and make them Synchronized (Thread Safe) 

class SharedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class ThreadSyncDemo {
    public static void main(String[] args) {
        // Create the shared resource instance
        SharedCounter counter = new SharedCounter();

        // Create Thread 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            }
        }, "Thread-1");

        // Create Thread 2 (using Lambda expression for brevity)
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }, "Thread-2");

        // Start both threads
        t1.start();
        t2.start();

        try {
            // Wait for both threads to finish execution
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Expected output will be exactly 2000 because of synchronization
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}
