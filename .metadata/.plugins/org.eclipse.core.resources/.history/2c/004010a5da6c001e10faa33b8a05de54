package Comparabledemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeUi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeSalary emp1 = new EmployeeSalary(1,"Nitish",56987.90);
		EmployeeSalary emp2 = new EmployeeSalary(2,"Alex",46987.90);
		EmployeeSalary emp3 = new EmployeeSalary(3,"Tom",36987.90);
		
		List<EmployeeSalary> emplist = new ArrayList<>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		
		Collections.sort(emplist);
		
		System.out.println("Sorted salary list - ");
		
		for(EmployeeSalary es : emplist) {
			System.out.println("Eid is - " + es.Eid);
			System.out.println("Employee Name - " + es.name);
			System.out.println("Employee Salary is - " + es.Salary);
			System.out.println();
		}

	}

}
