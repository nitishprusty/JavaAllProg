package com.acc.lkm.UIcontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.jpademo.EmpEntity;

public class Uidelete {

	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("JPADemo");	
	    EntityManager entityManager=entitymanagerfactory.createEntityManager();
	    EmpEntity empentity = entityManager.find(EmpEntity.class, 4);
	    
	    if(empentity != null) {
	    	entityManager.getTransaction().begin();
	    	entityManager.remove(empentity);
	    	entityManager.getTransaction().commit();
	    	System.out.println("Data Deleted Successfully");
	    }else {
	    	System.out.println("Data doesn't exist");
	    }
	    
	    entityManager.close();
	    entitymanagerfactory.close();

	}

}
