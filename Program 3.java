// Java program to set and get thread name and priority

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running with name: " + getName());
        System.out.println("Thread priority: " + getPriority());
    }
}

public class SetGetThread {
    public static void main(String[] args) {
        Thread myThread = new MyThread();

       
        myThread.setName("MyThreadNm");
        myThread.setPriority(Thread.MAX_PRIORITY);

        myThread.start();

        // Main thread
        System.out.println("Main thread name: " + Thread.currentThread().getName());
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());
    }
}
