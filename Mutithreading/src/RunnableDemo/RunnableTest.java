package RunnableDemo;

public class RunnableTest {

	public static void main(String[] args) {
		
		System.out.println("Runnable Thread Name:- " + Thread.currentThread().getName());
		
		Thread th1 = new Thread(new RunnableDemo());
		Thread th2 = new Thread(new RunnableDemo());
		
		th1.start();
		th2.start();

	}

}
