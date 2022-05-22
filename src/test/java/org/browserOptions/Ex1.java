package org.browserOptions;

import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://www.google.com";
		WebDriver driver = bu.startUp("ch", url);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("** Program Ends **");
	}
}