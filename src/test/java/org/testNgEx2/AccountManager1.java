package org.testNgEx2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountManager1 {
	//global object
	@BeforeClass
	public void getAccountTestData() {
		System.out.println("Get Account Test Data Object");
	}
	@Test
	public void createAccount() {
		System.out.println("Create Account");
	}
	@Test
	public void updateAccount() {
		System.out.println("Update Account");
	}
	@Test
	public void deleteAccount() {
		System.out.println("Delete Account");
	}
	@AfterClass
	public void flushAccTestDataObject() {
		System.out.println("Clear Account Test Data Object");
	}
}
