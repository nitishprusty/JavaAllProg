package campus.academics;

import campus.data.Person;
public class Faculty extends Person{

	public Faculty(String name, int age, String address,int facultyid,String branch,double salary) {
		super(name, age, address);
		this.facultyid = facultyid;
		this.branch = branch;
		this.salary = salary;
	}
	
	protected int facultyid;
	protected String branch;
	protected double salary;
	
	public int getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
