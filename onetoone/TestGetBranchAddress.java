package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetBranchAddress {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Branch branch = entityManager.find(Branch.class, 2);
		if(branch != null) {
			System.out.println("Branch ID: "+branch.getId());
			System.out.println("Branch Name: "+branch.getName());
			System.out.println("Branch State: "+branch.getState());
			System.out.println("Branch Country: "+branch.getCountry());
			System.out.println("Branch Phone: "+branch.getPhone());
			System.out.println("--------------------------------------");
			
			Address address = branch.getAddress();
			if(address != null)
			{
				System.out.println("Address ID: "+address.getId());
				System.out.println("Address Name: "+address.getName());
				System.out.println("Address State: "+address.getState());
				System.out.println("Address country: "+address.getCountry());
				System.out.println("Address PinCode: "+address.getPincode());
			}
			else {
				System.out.println("No Address is found");
			}
		}
		else {
			System.out.println("Data you are looking for is not available");
		}
	}
}
