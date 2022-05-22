package org.windowHandlingEx;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GenericSwitchEx2 {
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
				List<WebElement> listEle=driver.findElements(By.id("sampleHeading"));
				if(!listEle.isEmpty()) {
					String text= listEle.get(0).getText();
					System.out.println("text = "+text);
					break;
				}
				System.out.println("Switching to next window!");
			}
		}
		driver.quit();
	}
}