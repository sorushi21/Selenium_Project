package org.basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class ActitimeLogin1 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="http://localhost/login.do";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement uNameField=driver.findElement(By.id("username"));
		uNameField.sendKeys("admin");
		
		WebElement pwdField=driver.findElement(By.cssSelector("input[name='pwd']"));
		pwdField.sendKeys("manager");
		
		WebElement loginBtn=driver.findElement(By.cssSelector("#loginButton>div"));
		loginBtn.click();
		
		driver.findElement(By.id("logoutLink")).click();
		
		System.out.println("** Program Ends **");
	}
	
}