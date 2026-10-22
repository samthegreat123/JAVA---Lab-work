//43. Write a java program to join two threads which perform loop operations.

class LoopThread extends Thread {
    private String threadName;

    public LoopThread(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " -> Count: " + i);
            try {
                // Sleep for 300ms to simulate some processing time
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println(threadName + " was interrupted.");
            }
        }
        System.out.println(threadName + " has finished.");
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started.");

        // Create two threads
        LoopThread t1 = new LoopThread("Thread-1");
        LoopThread t2 = new LoopThread("Thread-2");

        // Start both threads
        t1.start();
        t2.start();

        try {
            // join() causes the current (main) thread to wait until t1 and t2 die
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // This message will only print AFTER both threads have completely finished their loops
        System.out.println("Both threads have completed. Main thread resumes and terminates.");
    }
}