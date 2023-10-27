package Task3;

import java.util.*;

public class Bank {

	public static void main(String[] args) {
		 
		Bank b = new Bank();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Bank Menu");
			System.out.println("1. Create Account");
			System.out.println("2. Display Account Details");
			System.out.println("3. Diposit Money");
			System.out.println("4. Withdraw Money");
			System.out.println("5. Display Total Money Deposited");
			System.out.println("6. Exit");
			System.out.println("Select an option: ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Account Number");
				long accNumber = sc.nextLong();
				System.out.println("Enter Name");
				String name = sc.nextLine();
				System.out.println("Enter Balance");
				double balance = sc.nextDouble();
				System.out.println("Enter Branch (Saving/Current)");
				String branch = sc.next();
				b.createAccount(accNumber, name, balance, branch);
				break;
			case 2:
				System.out.println("Enter the Account Number you want to search");
				long searchAccNum = sc.nextLong();
				Account acc = b.findAccount(searchAccNum);
				if(acc != null) {
					acc.displayAccountDetails();
				}else {
					System.out.println("Account Doesn't Exist");
				}
			case 3:
				System.out.println("Enter the Account Number to Deposit Money : ");
				long AccountNumberToDeposit = sc.nextLong();
				Account acctoDeposit = b.findAccount(AccountNumberToDeposit);
				
				if(acctoDeposit != null) {
					double depositAmount = sc.nextDouble();
					acctoDeposit.deposit(depositAmount);
				}else {
					System.out.println("Account Not Found");
				}
				break;
			case 4:
				System.out.println("Enter the Account Number to withdraw Money : ");
				long AccountNumberToWithdraw = sc.nextLong();
				Account acctowithdraw = b.findAccount(AccountNumberToWithdraw);
				
				if(acctowithdraw != null) {
					double withdrawAmount = sc.nextDouble();
					acctowithdraw.withdraw(withdrawAmount);
				}else {
					System.out.println("Account Not Found");
				}
				break;
			case 5:
				b.displayTotalMoneyDeposited();
				break;
			case 6 :
				System.out.println("Exiting the Program");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
 			}
		}

	}
	
	private ArrayList<Account> accountlist = new ArrayList<>();
	
	public void createAccount(long AccountNumber,String name,double balance,String Branch) {
		if(Branch.equals("Saving") && balance < 5000) {
			System.out.println("Minimum Balance for Saving Account is 5000");
		}else if(Branch.equals("Current") && balance < 1000) {
			System.out.println("Minimum Balace for Current Account is 1000");
		}else {
			accountlist.add(new Account(AccountNumber,name,balance,Branch));
		}
	}
	
	public void displayTotalMoneyDeposited() {
		double totalBalance = 0.0;
		for(Account acc : accountlist) {
			totalBalance += acc.getMinimumBalance();
		}
		System.out.println("Total Money Deposited in Bank is " + totalBalance);
	}
	
	public Account findAccount(long AccountNumber) {
		for(Account acc : accountlist) {
			if(acc.getAccNumber() == AccountNumber) {
				return acc;
			}
		}
		return null;
	}

}
