package org.dropdownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectEx2 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		
		WebElement singleDDL = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(singleDDL);
		
		WebElement selectedOption = sel.getFirstSelectedOption();
		String selectedColor = selectedOption.getText();
		System.out.println("Default Color : "+selectedColor);
		
		sel.selectByVisibleText("Purple");
		
		selectedOption = sel.getFirstSelectedOption();
		selectedColor = selectedOption.getText();
		System.out.println("User Selected Color : "+selectedColor);
		
		System.out.println("** Program Ends **");
	}
}