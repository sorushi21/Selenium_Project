package org.testNgEx3;

import org.testng.annotations.Test;

public class GroupingEx {
	@Test(groups={"smoke", "regression", "UAT"})
	public void test1() {
		System.out.println("Test 1");
	}
	@Test(groups={"smoke", "regression"})
	public void test2() {
		System.out.println("Test 2");
	}
	@Test(groups={"smoke", "UAT"})
	public void test8() {
		System.out.println("Test 8");
	}
	@Test(groups={"regression", "UAT"})
	public void test3() {
		System.out.println("Test 3");
	}
	@Test(groups={"smoke"})
	public void test4() {
		System.out.println("Test 4");
	}
	@Test(groups={"regression"})
	public void test5() {
		System.out.println("Test 5");
	}
	@Test(groups={"UAT"})
	public void test7() {
		System.out.println("Test 7");
	}
	@Test
	public void test6() {
		System.out.println("Test 6");
	}
}