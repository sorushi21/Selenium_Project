package org.testNgEx2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParallelEx {
	BaseUtility bu = new BaseUtility();
	@Test
	public void createCustomerCH() {
		String url="http://localhost/login.do";
		WebDriver driver = bu.startUp("CH",url);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
	}
	@Test
	public void createCustomerEdge() {
		String url="http://localhost/login.do";
		WebDriver driver = bu.startUp("edge",url);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
	}
}
