package org.testNgEx3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class DataProviderEx2 {
	@Test(dataProvider="LoginCreds")
	public void login(String userName,String password) {
		System.out.println("username: "+userName);
		System.out.println("pwd: "+password);
		BaseUtility bu = new BaseUtility();
		String url="http://localhost/login.do";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginButton>div")).click();
	}
	@DataProvider(name="LoginCreds")
	public Object[][] loginCredentials() {
		Object[][] data = new Object[3][2];
		data[0][0] = "admin";
		data[0][1] = "manager";
		
		data[1][0] = "admin1";
		data[1][1] = "manager1";
		
		data[2][0] = "admin2";
		data[2][1] = "manager2";
		return data;
	}
}