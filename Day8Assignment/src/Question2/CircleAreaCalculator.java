package Question2;

import java.util.Scanner;

public class CircleAreaCalculator {
	
	double radius;
	double area;
	
	public void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle: ");
		radius = sc.nextDouble();
		sc.close();
	}
	
	public void calc() {
		area = Math.PI * radius*radius;
	}
	
	public void display() {
		System.out.println("The area of the circle is " + area);
	}

	public static void main(String[] args) {
		
		CircleAreaCalculator obj = new CircleAreaCalculator();
		obj.init();
		obj.calc();
		obj.display();

	}

}
