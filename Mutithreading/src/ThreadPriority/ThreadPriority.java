package ThreadPriority;

public class ThreadPriority extends Thread{
	
	public void run() {
		
		System.out.println("Entering methods: " + Thread.currentThread().getName());
		System.out.println("inside methods: " + Thread.currentThread().getName() + " having priority " + Thread.currentThread().getPriority());
		System.out.println("Exiting methods: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		
		ThreadPriority th1 = new ThreadPriority();
		th1.setName("ThreadX");
		th1.setPriority(MIN_PRIORITY);
		
		ThreadPriority th2 = new ThreadPriority();
		th2.setName("ThreadY");
		th2.setPriority(MAX_PRIORITY);
		
		ThreadPriority th3 = new ThreadPriority();
		th3.setName("ThreadZ");
		th3.setPriority(6);
		
		th1.start();
		th2.start();
		th3.start();
		
		
		

	}

}
