package org.basicPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",
				path+"\\drivers\\chromedriver.exe");
//		WebDriverManager.chromedriver().setup();
		@SuppressWarnings("unused")
		ChromeDriver obj = new ChromeDriver();	//opens browser
//		Ex1 obj = new Ex1();
//		obj.testFF();
//		obj.testEdge();
		System.out.println("** Program Ends **");
	}
	public void testFF() {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",
				path+"\\drivers\\geckodriver.exe");
//		WebDriverManager.firefoxdriver().setup();
		@SuppressWarnings("unused")
		FirefoxDriver obj = new FirefoxDriver();//opens browser
	}
	public void testEdge() {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.edge.driver",
				path+"\\drivers\\msedgedriver.exe");
//		WebDriverManager.edgedriver().setup();
		@SuppressWarnings("unused")
		EdgeDriver obj = new EdgeDriver();	//opens browser
	}
}