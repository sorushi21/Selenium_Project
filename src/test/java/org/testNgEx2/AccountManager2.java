package org.testNgEx2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountManager2 {
	//global object
	@BeforeTest
	public void getDevEnvDetails() {
		System.out.println("Get Dev Env Details");
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
	@AfterTest
	public void flushAccTestDataObject() {
		System.out.println("Flush Dev Env obj");
	}
}
