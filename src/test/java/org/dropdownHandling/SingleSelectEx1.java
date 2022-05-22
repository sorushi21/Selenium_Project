package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectEx1 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement singleDDL = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(singleDDL);
		sel.selectByVisibleText("Purple");
//		sel.selectByIndex(7);
//		sel.selectByValue("10");
		System.out.println("** Program Ends **");
	}
}