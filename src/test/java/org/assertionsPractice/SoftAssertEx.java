package org.assertionsPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {
	@Test
	public void softAssertEx1() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Soft Assert 1");
		int a=10;
		sa.assertEquals(a, 100);
		System.out.println("after int");
		
		String actStr = "Pune";
		String expStr = "Pune";
		sa.assertEquals(actStr, expStr);
		System.out.println("after String");
		
		boolean flag = true;
		sa.assertTrue(flag);
		System.out.println("after boolean");

		sa.assertTrue(actStr.equals("Mumbai"));
		System.out.println("after String");
		
		sa.assertAll();
	}
	@Test
	public void testMethod() {
		System.out.println("TestMethod");
	}
}