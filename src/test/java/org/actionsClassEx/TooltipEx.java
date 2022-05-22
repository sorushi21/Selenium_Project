package org.actionsClassEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class TooltipEx {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/tool-tips";
		WebDriver driver = bu.startUp("ch", url);
		Thread.sleep(2000);
		WebElement btn=driver.findElement(By.cssSelector(".btn.btn-success"));
		Actions act = new Actions(driver);
		act.moveToElement(btn).perform();
		String tooltip=driver.findElement(By.className("tooltip-inner")).getText();
		System.out.println("tooltip : "+tooltip);
		Thread.sleep(2000);
		
		WebElement txtField=driver.findElement(By.id("toolTipTextField"));
		act.moveToElement(txtField).perform();
		Thread.sleep(2000);
		WebElement textField=driver.findElement(By.className("tooltip-inner"));
		String tooltip2 = textField.getText();
		System.out.println("tooltip2 : "+tooltip2);
		System.out.println("** Program Ends **");
	}
}