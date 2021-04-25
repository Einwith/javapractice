package javapractice;

public class MyRunnable implements Runnable {
	public void run() {
		go();
	}
	public void go() {
		for(int i = 0; i < 25; i++) {
			System.out.println("Thread Name: " + Thread.currentThread().getName() + " is running");
		}
		System.out.println("myRunable thread stack");
	}
	
}

class Runnable2 implements Runnable {
	public void run () {
		go();
	}
	public void go() {
		try {
			Thread.sleep(2000);
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Runable2 thread stack");
	}
	
}
class ThreadTester {
	
	public static void main(String[] args) {
	Runnable threadJob = new MyRunnable();
	Runnable2 threadJob2 = new Runnable2();
	Thread myThread = new Thread(threadJob);
	Thread myThread3 = new Thread(threadJob);
	
	myThread.setName("Alpha");
	myThread3.setName("Beta");
	Thread myThread2 = new Thread(threadJob2);
	
	
	myThread2.start();
	myThread.start();
	myThread3.start();
	
	
	System.out.println("Back in main first thread.");
	System.out.println("Back in main first thread second.");
	
	}
	
}