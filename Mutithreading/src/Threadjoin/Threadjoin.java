package Threadjoin;

public class Threadjoin extends Thread{

	public static void main(String[] args) throws InterruptedException {
	   
		Threadjoin t = new Threadjoin();
		t.start();
		t.join();
		System.out.println("Exiting main");
	}
	
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Running Thread Exiting");
	}

}
