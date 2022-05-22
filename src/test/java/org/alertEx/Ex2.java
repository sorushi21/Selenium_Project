package org.alertEx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/alerts";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.id("timerAlertButton")).click();
		
		if(bu.isAlertPresent(driver, 10)) {
			Alert alt = driver.switchTo().alert();
			System.out.println("text: "+ alt.getText());
			alt.accept();
		} else {
			System.out.println("Alert is not displayed!!!");
		}
		System.out.println("** Program Ends **");
	}
}