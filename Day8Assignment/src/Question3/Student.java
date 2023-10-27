package Question3;

public class Student {
	
    private String name;
    private int rollno;
    private int age;
    
    public Student(String name, int rollno, int age, double score) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
    
	private double score;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
    
    
    
}
