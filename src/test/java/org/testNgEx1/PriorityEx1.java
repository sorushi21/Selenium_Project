package org.testNgEx1;

import org.testng.annotations.Test;

public class PriorityEx1 {
	@Test(priority=1)
	public void login() {
		System.out.println("Test Method 1");
	}
	@Test(priority=8)
	public void logout() {
		System.out.println("Test Method 2");
	}
	@Test(priority=2)
	public void createCust() {
		System.out.println("small Create Cust");
	}
	@Test(priority=5)
	public void CreateCust() {
		System.out.println("Capital Create Cust");
	}
	@Test(priority=3)
	public void updateCust() {
		System.out.println("small update Cust");
	}
	@Test(priority=6)
	public void UpdateeCust() {
		System.out.println("Capital update Cust");
	}
	@Test(priority=4)
	public void deleteCust() {
		System.out.println("small delete Cust");
	}
	@Test(priority=7)
	public void DeleteCust() {
		System.out.println("Capital Delete Cust");
	}
}
