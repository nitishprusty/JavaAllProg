package campus.academics;

import campus.data.Person;

public class Student extends Person{
	
	
	protected String rollno;
	protected String branch;
	protected int semester;
	
	public Student(String name, int age, String address,String rollno,String branch,int semester) {
		super(name, age, address);
		this.rollno = rollno;
		this.branch = branch;
		this.semester = semester;
	} 
}
