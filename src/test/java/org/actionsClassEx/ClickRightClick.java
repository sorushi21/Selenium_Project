package org.actionsClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class ClickRightClick {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/links";
		WebDriver driver = bu.startUp("ch", url);
		Actions act = new Actions(driver);
		WebElement ele=driver.findElement(By.id("simpleLink"));
//		act.doubleClick(ele).perform();//double click
//		act.click(ele).perform();	//single click
		//open new tab
		act.keyDown(Keys.LEFT_CONTROL)
        .click(ele)
        .keyUp(Keys.LEFT_CONTROL)
        .build()
        .perform();
		System.out.println("** Program Ends **");
	}
}