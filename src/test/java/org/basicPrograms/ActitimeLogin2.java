package org.basicPrograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class ActitimeLogin2 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="http://localhost/login.do";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
//		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
		
		bu.waitForVisibilityOfLocatedBy(driver, "xpath","//a[@id='logoutLink']", 10);
		
		driver.findElement(By.id("logoutLink")).click();
		System.out.println("** Program Ends **");
	}
}