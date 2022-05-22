package org.assertionsPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	@Test
	public void hardAssertEx1() {
		System.out.println("Hard Assert 1");
		int a=10;
		Assert.assertEquals(a, 100);
		System.out.println("after int");
		String actStr = "Pune";
		String expStr = "Pune";
		Assert.assertEquals(actStr, expStr);
		System.out.println("after String");
	}
	@Test
	public void testMethod() {
		System.out.println("TestMethod");
	}
}