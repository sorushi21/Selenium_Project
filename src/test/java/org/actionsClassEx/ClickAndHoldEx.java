package org.actionsClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class ClickAndHoldEx {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/droppable";
		WebDriver driver = bu.startUp("ch", url);
		Actions act = new Actions(driver);
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement des=driver.findElement(By.id("droppable"));
		act.clickAndHold(src).moveToElement(des).release().build().perform();
		System.out.println("** Program Ends **");
	}
}