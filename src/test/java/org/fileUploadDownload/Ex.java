package org.fileUploadDownload;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/automation-practice-form";
		WebDriver driver = bu.startUp("ch", url);
		WebElement uploadBtn=driver.findElement(By.id("uploadPicture"));
		//bu.scrollTillElementByJS(uploadBtn, driver);
		driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		bu.clickByJS(uploadBtn, driver);
		try {
			Thread.sleep(2000);
			Runtime.getRuntime().exec("./AutoItFiles/ChromeUpload.exe");
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("** Program Ends **");
	}
}