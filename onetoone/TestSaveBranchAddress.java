package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.proxy.EntityNotFoundDelegate;

public class TestSaveBranchAddress {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Branch branch = new Branch();
		branch.setName("Appollo Hospital");
		branch.setState("Karnataka");
		branch.setCountry("India");
		branch.setPhone(9876543210l);
		
		Address address = new Address();
		address.setName("BTM Layout");
		address.setState("karnataka");
		address.setCountry("India");
		address.setPincode(586101);
		
		branch.setAddress(address);
		
		entityTransaction.begin();
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
	}
}
