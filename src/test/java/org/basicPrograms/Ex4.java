package org.basicPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex4 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="http://localhost/login.do";
		WebDriver driver = bu.startUp("ch", url);
		String expTitle = "actiTIME - Login";
		String actTitle = driver.getTitle();
		if(expTitle.equals(actTitle)) {
			System.out.println("Login Title matched!");
		} else {
			System.out.println("Login Title NOT matched!");
		}
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
				
		bu.waitForVisibilityOfLocatedBy(driver, "xpath","//a[@id='logoutLink']", 10);
		WebElement ele =null;
		String attribValue="";
		List<WebElement> tabList=driver.findElements(By.xpath("//table[@id='topnav']//td/a[contains(@class,'content')]"));
		for(int i=0; i<tabList.size(); i++) {
			ele = tabList.get(i);
			attribValue=ele.getAttribute("class");
			if(attribValue.contains("selected")) {
				System.out.println("selected ele : "+ele.getText());
			}
		}
//		driver.findElement(By.id("logoutLink")).click();
		System.out.println("** Program Ends **");
	}
}