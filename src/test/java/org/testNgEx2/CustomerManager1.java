package org.testNgEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomerManager1 {
	@BeforeClass
	public void getCustomerTestData() {
		System.out.println("Get Customer Test Data Object");
	}
	@Test
	public void createCustomer() {
		System.out.println("Create Customer");
	}
	@Test
	public void updateCustomer() {
		System.out.println("Update Customer");
	}
	@Test
	public void deleteCustomer() {
		System.out.println("Delete Customer");
	}
	@AfterClass
	public void flushCustTestDataObject() {
		System.out.println("Clear Customer Test Data Object");
	}
}