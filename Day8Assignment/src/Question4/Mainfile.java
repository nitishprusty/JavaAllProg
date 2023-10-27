package Question4;

import java.util.Scanner;

public class Mainfile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		String choice = sc.next();
		Processor obj = null;
		if(choice.equalsIgnoreCase("factorial")) {
			obj = new Factorial();
		}else if(choice.equalsIgnoreCase("circle")) {
			obj = new Circle();
		}else {
			System.out.println("Invalid Choice");
		}
		
		System.out.println("Enter the data");
		
		int d = sc.nextInt();
		obj.data = d;
		
		obj.process();
		obj.showdata();
		
		

	}

}
