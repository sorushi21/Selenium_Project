package org.basicPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex2 {
	WebDriver driver;	//null
	String path=System.getProperty("user.dir");
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		
		
		
		System.out.println("** Program Ends **");
	}
	public WebDriver openBrowser(String bName) {
		switch(bName) {
			case "ch":
			case "CH":
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						path+"\\drivers\\chromedriver.exe");
	//			ChromeDriver objCH = new ChromeDriver();
				driver = new ChromeDriver();//upcasting
				break;
			case "ff":
			case "FF":
			case "firefox":
				System.setProperty("webdriver.gecko.driver",
						path+"\\drivers\\geckodriver.exe");
	//			FirefoxDriver objFF = new FirefoxDriver();
				driver = new FirefoxDriver();//upcasting
				break;
			case "edge":
			case "EDGE":
				System.setProperty("webdriver.edge.driver",
						path+"\\drivers\\msedgedriver.exe");
	//			EdgeDriver objEdge = new EdgeDriver();
				driver = new EdgeDriver();//upcasting
				break;
			default: System.out.println("Invalid Browser!!!");
		}
		return driver;
	}
}