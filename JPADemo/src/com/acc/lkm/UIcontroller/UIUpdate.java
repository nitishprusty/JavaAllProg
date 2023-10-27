package com.acc.lkm.UIcontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.jpademo.EmpEntity;

public class UIUpdate {

	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("JPADemo");	
	    EntityManager entityManager=entitymanagerfactory.createEntityManager();
	    EmpEntity empentity = entityManager.find(EmpEntity.class,3);
	    
	    if(empentity != null) {
	    	empentity.setRole("Analyst");
	    	empentity.setSalary(56000.45);
	    	entityManager.getTransaction().begin();
	    	entityManager.getTransaction().commit();
	    	System.out.println("Updated Successfully");
	    	
	    }else {
	    	System.out.println("Not Able to update");
	    }
	    entityManager.close();
	    entitymanagerfactory.close();
	    

	}

}
