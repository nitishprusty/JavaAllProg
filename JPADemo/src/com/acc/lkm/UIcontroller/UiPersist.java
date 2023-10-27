package com.acc.lkm.UIcontroller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.acc.lkm.jpademo.EmpEntity;

public class UiPersist {

	public static void main(String[] args) {
		
		EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("JPADemo");	
	    EntityManager entityManager=entitymanagerfactory.createEntityManager();
	    EmpEntity empEntity=new EmpEntity();
//	    empEntity.setEmpId();
	    empEntity.setEmpName("Harsh");
	    empEntity.setRole("AASE");
	    empEntity.setSalary(37000.00);
	    entityManager.getTransaction().begin();
	    entityManager.persist(empEntity);
	   // entityManager.persist(empEntity);
	    entityManager.getTransaction().commit();
	    System.out.println("Employee registered successfully");
	    entityManager.close();
	    entitymanagerfactory.close();

	}

}
