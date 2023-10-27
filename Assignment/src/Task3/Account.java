package Task3;

public class Account {
	
    private long accNumber;
    private String name;
    private double balance;
    private String Branch;
    
	public long getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public Account(long accNumber, String name, double balance, String branch) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
		Branch = branch;
	}
    
    public void displayAccountDetails() {
    	System.out.println("Account Number: " + accNumber);
    	System.out.println("Name: " + name);
    	System.out.println("Balance : " + balance);
    	System.out.println("Branch: " + Branch);
    }
    
    public void deposit(double amount) {
    	balance += amount;
    	System.out.println("Deposited " + amount);
    }
    
    public boolean withdraw(double amount) {
    	if(balance - amount >= getMinimumBalance()) {
    		balance -= amount;
    		System.out.println("Withdrawn " + amount);
    		return true;
    	}else {
    		System.out.println("Invalid Balance");
    		return false;
    	}
    }
    
    public double getMinimumBalance() {
    	return Branch.equals("Saving" ) ? 5000.0 : 1000.0;
    }
    
}
