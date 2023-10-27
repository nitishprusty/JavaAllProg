package Question3;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentScoreGrouping {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<>();
		
		for(int i =1;i<=10;i++) {
			System.out.println("Enter the details for Student " + i + " : ");
			System.out.println("Name: ");
			String name = sc.next();
			System.out.println("Roll no: ");
			int rollno = sc.nextInt();
			System.out.println("Age: ");
			int age = sc.nextInt();
			System.out.println("Score: ");
			double score = sc.nextDouble();
			
			students.add(new Student(name,rollno,age,score));
			
		}
		
		
		List<Student> scoreGroup0to50 = new ArrayList<>();
		List<Student> scoreGroup50to65 = new ArrayList<>();
		List<Student> scoreGroup65to80 = new ArrayList<>();
		List<Student> scoreGroup80to100 = new ArrayList<>();
		
		
		for(Student stu: students) {
			double score = stu.getScore();
			
			if(score >= 0 && score <= 50) {
				scoreGroup0to50.add(stu);
			}else if(score > 50 && score <=65) {
				scoreGroup50to65.add(stu);
			}else if(score > 65 && score <= 80) {
				scoreGroup65to80.add(stu);
			}else if(score > 80 && score <= 100) {
				scoreGroup80to100.add(stu);
			}
		}
		
		System.out.println("Student list between 0 to 50");
		StudentScoreGrouping.displayStudents(scoreGroup0to50);
		
		System.out.println("Student list between 50 to 65");
		StudentScoreGrouping.displayStudents(scoreGroup50to65);
		
		System.out.println("Student list between 65 to 80");
		StudentScoreGrouping.displayStudents(scoreGroup65to80);
		
		System.out.println("Student list between 80 to 100");
		StudentScoreGrouping.displayStudents(scoreGroup80to100);
		

	}
	static void displayStudents(List<Student> studentlist) {
		for(Student st : studentlist) {
			System.out.println("Name : " + st.getName() + " Age : " + st.getAge() + " Roll no : " + st.getRollno() + " Score : " + st.getScore() + "\n");
		}
	}

}
