package Task1;

import java.util.*;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Details");
		System.out.println("Enter Employeeid");
		int empid = sc.nextInt();
		System.out.println("Enter Employee Name");
		String empName = sc.nextLine();
		System.out.println("Enter the Salary");
		double Salary = sc.nextDouble();
		
		Employee emp = new Employee(empid,empName,Salary);
		
		System.out.println("Enter the Product Details");
		System.out.println("Enter the product id");
		int pid = sc.nextInt();
		System.out.println("Enter the price of the product");
		double price = sc.nextDouble();
		System.out.println("Enter the quantity");
		int quantity = sc.nextInt();
		
		Product p = new Product(pid,price,quantity);
		
		System.out.println("Employee id is " + emp.getEmpid());
		System.out.println("Employee Name is " + emp.getEname());
		System.out.println("Employee Salary is " + emp.getSalary());
		System.out.println("Employee Yearly income Tax is " + emp.calcTax());
		
		System.out.println("\n");
		
		System.out.println("Product id is " + p.getPid());
		System.out.println("Product price is " + p.getPrice());
		System.out.println("Product quantity is " + p.getQuantity());
		System.out.println("SalesTax Rate is " + p.calcTax());

	}

}
