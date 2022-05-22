package org.testNgEx1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class LoginActitimeEx {
	private WebDriver driver;
	BaseUtility bu = new BaseUtility();
	@Test(priority=2)
	public void doLogin() {
		System.out.println("Login");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfLocatedBy(driver, "xpath","//a[@id='logoutLink']", 10);
	}
	@Test(priority=3)
	public void doLogout() {
		System.out.println("Logout");
		driver.findElement(By.id("logoutLink")).click();
	}
	@Test(priority=1)
	public void openBrowser() {
		System.out.println("Open Browser");
		String url="http://localhost/login.do";
		driver = bu.startUp("ch", url);
	}
}