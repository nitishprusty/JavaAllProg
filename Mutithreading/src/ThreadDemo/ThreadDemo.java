package ThreadDemo;

public class ThreadDemo extends Thread{
	
	public void run() {
		System.out.println("Thread Name: " + Thread.currentThread().getName());
	}

}
