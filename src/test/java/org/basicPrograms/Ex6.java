package org.basicPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex6 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="http://localhost/login.do";
		WebDriver driver = bu.startUp("ch", url);
		String expUrl = "http://localhost/login.do";
		String actUrl = driver.getCurrentUrl();
		if(expUrl.equals(actUrl)) {
			System.out.println("Login URL matched!");
		} else {
			System.out.println("Login URL NOT matched!");
		}
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
				
		bu.waitForVisibilityOfLocatedBy(driver, "xpath","//a[@id='logoutLink']", 10);
		
		expUrl = "http://localhost/user/submit_tt.do";
		actUrl = driver.getCurrentUrl();
		if(expUrl.equals(actUrl)) {
			System.out.println("DashBoard URL matched!");
		} else {
			System.out.println("Dashboarl URL NOT matched!");
		}
		System.out.println("** Program Ends **");
	}
}