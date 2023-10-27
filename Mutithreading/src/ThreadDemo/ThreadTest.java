package ThreadDemo;

public class ThreadTest {
     public static void main(String [] args) {
    	 System.out.println("Thread Name " + Thread.currentThread().getName());
    	 
    	 ThreadDemo th1 = new ThreadDemo();
    	 ThreadDemo th2 = new ThreadDemo();
    	 
    	 th1.start();
    	 th2.start();
     }
}
