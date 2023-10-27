package Synchronization;

public class Account {
	
	double balance;
	
	
	public synchronized void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Not Enough Balance");
		}else if(amount > 0 && amount <= balance) {
			balance -= amount;
		}
	}
	
	public synchronized void deposit(double amount) {
		if(amount < 0 ) {
			throw new IllegalArgumentException("Amount Cannot negative");
		}else {
			balance += amount;
		}
		
	}

}
