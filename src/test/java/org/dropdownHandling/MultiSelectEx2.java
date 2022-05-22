package org.dropdownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectEx2 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		
		WebElement multiDDL = driver.findElement(By.id("cars"));
		
		Select sel = new Select(multiDDL);
		sel.selectByVisibleText("Volvo");
		sel.selectByIndex(3);
		sel.selectByValue("opel");
		
		List<WebElement> allselOption=sel.getAllSelectedOptions();
		WebElement colorEle=null;
		String color=null;
		for(int i=0; i<allselOption.size(); i++) {
			colorEle = allselOption.get(i);
			color = colorEle.getText();
			System.out.println(color);
			//System.out.println(allselOption.get(i).getText());
		}
		
		System.out.println("** Program Ends **");
	}
}