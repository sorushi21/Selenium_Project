package org.alertEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/alerts";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.id("promtButton")).click();
		
		Alert alt = driver.switchTo().alert();
		System.out.println("text: "+ alt.getText());
		
		alt.sendKeys("This is 09 Jan batch!!!");
		
		alt.accept();
//		alt.dismiss();
		System.out.println("** Program Ends **");
	}
}