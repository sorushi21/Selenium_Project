package org.dropdownHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectEx3 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/select-menu";
		WebDriver driver = bu.startUp("ch", url);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		WebElement multiDDL = driver.findElement(By.id("cars"));
		Select sel = new Select(multiDDL);
		List<WebElement> allOptions = sel.getOptions();
		String str="";
		for(int i=0; i<allOptions.size(); i++) {
			str = allOptions.get(i).getText();
			System.out.println(str);
			if(str.equals("Audi")) {
//				sel.selectByVisibleText("Audi");
				sel.selectByIndex(i);
			}
		}
		System.out.println("** Program Ends **");
	}
	public ArrayList<String> getAllTextFromDDL(WebElement ele) {
		Select sel = new Select(ele);
		ArrayList<String> ar = new ArrayList<String>();
		for(int i=0; i<sel.getOptions().size(); i++) {
			ar.add(sel.getOptions().get(i).getText());
		}
		return ar;
	}
//	public ArrayList<String> getAllTextFromDDL(WebElement ele) {
//		Select sel = new Select(ele);
//		ArrayList<String> ar = new ArrayList<String>();
//		List<WebElement> allOptions = sel.getOptions();
//		for(int i=0; i<allOptions.size(); i++) {
//			ar.add(allOptions.get(i).getText());
//		}
//		return ar;
//	}
}





