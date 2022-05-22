package org.frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/frames";
		WebDriver driver = bu.startUp("ch", url);
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text = "+text);
		driver.switchTo().defaultContent();
//		WebElement frame2 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame("frame2");
		String text2=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text2 = "+text2);
		System.out.println("** Program Ends **");
	}
}