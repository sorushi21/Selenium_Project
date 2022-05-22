package org.testNgEx3;

import org.testng.annotations.Test;

public class EnabledEx {
	@Test(priority=1,enabled=true)
	public void login() {
		System.out.println("Login");
	}
	@Test(priority=5, enabled=true)
	public void logout() {
		System.out.println("Logout");
	}
	@Test(priority=2)
	public void createCust() {
		System.out.println("create Cust");
	}
	@Test(priority=3)
	public void updateCust() {
		System.out.println("update Cust");
	}
	@Test(priority=4, enabled=false)
	public void deleteCust() {
		System.out.println("delete Cust");
	}
}
