package Task2;

public class Mainclass {

	public static void main(String[] args) {
		
		Employee [] employee = new Employee[5];
		
		employee[0] = new Employee(101,"Alex",13404);
		employee[1] = new Employee(102,"Akash",12456);
		employee[2] = new Employee(103,"Rahul",19345);
		employee[3] = new Employee(104,"Ishaan",25678);
		employee[4] = new Employee(105,"Rashi",34567);
		
		
		int newEmpid = 104;
		boolean empExist = false;
		for(Employee emp : employee) {
			if(emp.equals(new Employee(newEmpid,"",0.0))) {
				empExist = true;
				break;
			}
		}
		
		for(Employee e : employee) {
			System.out.println(e.toString() + "\n");
		}
		

	}

}
