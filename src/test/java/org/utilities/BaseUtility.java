package org.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {
	public WebDriver startUp(String bName, String url) {
		String path=System.getProperty("user.dir");
		WebDriver driver=null;
		if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
						path+"\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
		} else if(bName.equalsIgnoreCase("ff") || bName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						path+"\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
		} else if(bName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver",
						path+"\\drivers\\msedgedriver.exe");
				driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser!!!");
		}
		driver.manage().window().maximize();
		//selenium 4 onwards
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//upto selenium 3
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().minimize();	//Selenium 4
//		driver.manage().window().setSize(new Dimension(400, 400));
		driver.get(url);
		return driver;
	}
	public void waitForVisibilityOfWebElement(WebDriver driver, WebElement ele, int time) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
//		WebDriverWait wt = new WebDriverWait(driver,30);
		wt.until(ExpectedConditions.visibilityOf(ele));
	}
	public void waitForVisibilityOfLocatedBy(WebDriver driver,String locType, String locator, int time) {
		WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(time));
//		WebDriverWait wt = new WebDriverWait(driver,30);
		switch(locType) {
		case "xpath": wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
					  break;
		case "css": wt.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
					  break;
		case "id": wt.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
					  break;
		case "clss": wt.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
					  break;
		}
	}
	public boolean isAlertPresent(WebDriver driver, int time) {
		try {
			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
//			WebDriverWait wt = new WebDriverWait(driver,30);
			wt.until(ExpectedConditions.alertIsPresent());
			return true;
		} catch(Exception e) {
			return false;
		}
	}
	public void scrollTillElementByJS(WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	public void clickByJS(WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].click();", ele);
	}
}