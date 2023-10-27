package RunnableDemo;

public class RunnableDemo implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Runnable Thread Name: - " + Thread.currentThread().getName());
	}

}
