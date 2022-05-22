package org.testNgEx2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CustomerManager2 {
	@BeforeTest
	public void getQAEnvDetails() {
		System.out.println("Get QA Env Details");
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
	@AfterTest
	public void flushAccTestDataObject() {
		System.out.println("Flush QA Env obj");
	}
}