import java.io.Serializable;

public class Employee implements Serializable{
	
    int empid;
    String empName;
    
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}
  
}
