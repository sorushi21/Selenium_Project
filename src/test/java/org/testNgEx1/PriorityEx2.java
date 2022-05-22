package org.testNgEx1;

import org.testng.annotations.Test;

public class PriorityEx2 {
	@Test(priority=-5)
	public void login() {
		System.out.println("Test Method 1");
	}
	@Test(priority=8)
	public void logout() {
		System.out.println("Test Method 2");
	}
	@Test(priority=0)
	public void createCust() {
		System.out.println("small create Cust");
	}
	@Test(priority=0)
	public void CreateCust() {
		System.out.println("Capital Create Cust");
	}
	@Test
	public void updateCust() {
		System.out.println("small update Cust");
	}
	@Test(priority=6)
	public void UpdateCust() {
		System.out.println("Capital update Cust");
	}
	@Test(priority=7)
	public void deleteCust() {
		System.out.println("small delete Cust");
	}
	@Test(priority=7)
	public void DeleteCust() {
		System.out.println("Capital Delete Cust");
	}
}
