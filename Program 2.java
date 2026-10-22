

class MySyncThread extends Thread {
	private String threadName;
	private SharedResource sharedResource;
	
	//Constructor to initialize thread name and shared resource
	public MysyncThread(String threadName, SharedResource sharedResource){
		this.threadName = threadName;
		this.sharedResource = sharedResource;
		
	}
	
	@Override
	public void run(){
		SharedResource.printNumbers(threadName);
	}
	
}

//Define a class to represent a shared resource
class SharedResource
{
	 //synchronized
	 public synchronized void printNumbers(String threadName){
		 for(int i =1; i<=5; i++)
		 {
			 System.out.println(threadName + " : " + i);
			 try{
				 Thread sleep(100); // simulate some work
				 
			 }
			 
			 catch(InterruptedException e){
				 Thead currentThread(). Interrupt();
			 }
		 }
		 
		 System.out.println("Thread Complete...");
		 
	 }
	 
}

public class SyncThread
{
	public static void main(String[] args){
		//Create a shared resource
		SharedResource sharedResource = new SharedResource();
		
		//Create two thread
		MysyncThread thread1 = new MySyncThread("thread-1", sharedResource);
		mySyncThread thread2 = new MysyncThread("thread -2", sharedResource);
		
		//start the threads
		thread.start();
		thread.start();
	}
	
}
	 