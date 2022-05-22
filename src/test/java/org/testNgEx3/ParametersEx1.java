package org.testNgEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class ParametersEx1 {
	@Parameters({"browserName","userName","password"})
	@Test
	public void loginMethod(String bName, String uName, String pwd) {
		System.out.println("bName = "+bName);
		System.out.println("uName = "+uName);
		System.out.println("pwd = "+pwd);
		BaseUtility bu = new BaseUtility();
		String url = "http://localhost/login.do";
		WebDriver driver = bu.startUp(bName, url);
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
	}
}