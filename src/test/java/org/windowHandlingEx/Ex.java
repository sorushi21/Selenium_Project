package org.windowHandlingEx;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/browser-windows";
		WebDriver driver = bu.startUp("ch", url);
		String parentId1=driver.getWindowHandle();
		System.out.println("parentId1 = "+parentId1);
		
		driver.findElement(By.id("tabButton")).click();
		
		String parentId2=driver.getWindowHandle();
		System.out.println("parentId1 = "+parentId2);
		
		Set<String> allWinIds = driver.getWindowHandles();
		Iterator<String> itr=allWinIds.iterator();
		
		String id1 = itr.next();
		System.out.println("id1 = "+id1);
		
		String id2 = itr.next();
		System.out.println("id2 = "+id2);
		
		driver.switchTo().window(id2);
		
		String text=driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("text = "+text);
		
//		driver.quit();
		driver.close();
		driver.switchTo().window(parentId1);
		driver.close();
	}
}