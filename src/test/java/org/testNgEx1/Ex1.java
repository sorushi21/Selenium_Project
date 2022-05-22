package org.testNgEx1;

import org.testng.annotations.Test;

public class Ex1 {
	@Test
	public void testMethod1() {
		System.out.println("Test Method 1");
		testMethod2();
	}
	public void testMethod2() {
		System.out.println("Test Method 2");
	}
	@Test
	public void testMethod3() {
		System.out.println("Test Method 3");
		testMethod4();
	}
	public void testMethod4() {
		System.out.println("Test Method 4");
	}
}
