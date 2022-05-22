package org.testNgEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class InvocationCountEx {
	@Test(invocationCount=3,threadPoolSize=2)
	public void login() {
		BaseUtility bu = new BaseUtility();
		String url="http://localhost/login.do";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		bu.waitForVisibilityOfLocatedBy(driver, "xpath","//a[@id='logoutLink']", 10);
	}
}