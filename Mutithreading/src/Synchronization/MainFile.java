package Synchronization;

public class MainFile extends Thread{
	
	double amount;
	Account acc;
	
	public MainFile(double amount,Account acc) {
		this.amount = amount;
		this.acc = acc;
	}
	
	public void run() {
		
		acc.withdraw(amount);
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		Account acc = new Account();
		acc.deposit(2000);
		
		MainFile obj1 = new MainFile(400,acc);
		MainFile obj2 = new MainFile(600,acc);
		
		obj1.start();
		obj2.start();
		
		obj1.join();
		obj2.join();
		
		System.out.println("Final Balance is " + acc.balance);
		
		

	}

}
