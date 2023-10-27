package com.acc.lkm.UIcontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.jpademo.EmpEntity;

public class UIFind {

	public static void main(String[] args) {
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("JPADemo");	
	    EntityManager entityManager=entitymanagerfactory.createEntityManager();
	    EmpEntity empEntity=entityManager.find(EmpEntity.class,2);
	    if(empEntity!=null) {
	    	System.out.println("Employee ID is:"+empEntity.getEmpId()+"\n"+
	    	"Employee Name is:"+empEntity.getEmpName()+"\n"+
	    			"Employee Role is "+empEntity.getRole()+"\n"+
	    			"Employee Salary is:"+empEntity.getSalary());
	    }else {
	    	System.out.println("Employee doesn't exists");
	    }
	    entityManager.close();
	    entitymanagerfactory.close();


	}

}
