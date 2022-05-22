package org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/nestedframes";
		WebDriver driver = bu.startUp("ch", url);
		
		driver.switchTo().frame("frame1");

		WebElement frame2 = driver.findElement(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame2);
		
		String text=driver.findElement(By.tagName("p")).getText();
		System.out.println("Text = "+text);
		System.out.println("** Program Ends **");
	}
}