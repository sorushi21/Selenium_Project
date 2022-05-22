package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class WithoutSelectSingleEx {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/radio-button";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement noBtn = driver.findElement(By.id("noRadio"));
		System.out.println("enabled = "+noBtn.isEnabled());
		
		WebElement yesLabel=driver.findElement(By.cssSelector("label[for='yesRadio']"));
		System.out.println("displayed = "+yesLabel.isDisplayed());
		yesLabel.click();
		
		WebElement yesBtn=driver.findElement(By.id("yesRadio"));
		System.out.println("selected = "+yesBtn.isSelected());
		
		System.out.println("** Program Ends **");
	}
}