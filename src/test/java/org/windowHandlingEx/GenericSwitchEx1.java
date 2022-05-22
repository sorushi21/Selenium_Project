package org.windowHandlingEx;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class GenericSwitchEx1 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://demoqa.com/browser-windows";
		WebDriver driver = bu.startUp("ch", url);
		
		String parentId1=driver.getWindowHandle();
		System.out.println("parentId1 = "+parentId1);
		
		driver.findElement(By.id("windowButton")).click();
		
		Set<String> allWinIds = driver.getWindowHandles();
		Iterator<String> itr=allWinIds.iterator();
		String id="";
		while(itr.hasNext()) {
			id = itr.next();
			if(!id.equals(parentId1)) {
				driver.switchTo().window(id);
				try {
					String text=driver.findElement(By.id("sampleHeading")).getText();
					System.out.println("text = "+text);
					break;
				} catch(NoSuchElementException e) {
					//e.printStackTrace();
					System.out.println("Switching to next window!");
				}
			}
		}
		driver.quit();
	}
}