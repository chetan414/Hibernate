package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
 
public class TestSaveCompanyGst {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Company company = new Company();
		company.setName("TestYantra"); 
		company.setPhone("9876543210");
		company.setWeb("www.TestYanta.com");
		
		Gst gst = new Gst();
		gst.setCompany(company);
		gst.setCountry("India");
		gst.setGstNumber("IYGF75617");
		gst.setState("Karnataka");
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
	}
}
