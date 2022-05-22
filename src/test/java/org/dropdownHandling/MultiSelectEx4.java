package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectEx4 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		WebElement multiDDL = driver.findElement(By.id("cars"));
		Select sel = new Select(multiDDL);
		for(int i=0; i<sel.getOptions().size(); i++) {
			sel.selectByIndex(i);
		}
		sel.deselectAll();
//		sel.deselectByIndex(1);
//		sel.deselectByValue("opel");
//		sel.deselectByVisibleText("Audi");
		System.out.println("** Program Ends **");
	}

}