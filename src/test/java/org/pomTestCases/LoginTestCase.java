package org.pomTestCases;

import org.openqa.selenium.WebDriver;
import org.pomPages.LoginPage;
import org.propertiesOperations.ConfigReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.utilities.BaseUtility;

public class LoginTestCase {
	private WebDriver driver;
	private ConfigReader cr;
	private BaseUtility bu = new BaseUtility();
	
	@BeforeSuite
	public void intializeObjects() {
		cr = new ConfigReader();
	}
	@BeforeMethod
	public void initializeBrowser() {
		System.out.println("Open Browser");
		driver = bu.startUp(cr.getPropData("browserName"), cr.getPropData("url"));
	}
	@Test
	public void verifyLoginPage() {
		System.out.println("Verify Login Page");
		LoginPage lpObj = new LoginPage(driver);
//		lpObj.isUserNameFieldDisplayed();
//		lpObj.isPasswordFieldDisplayed();
//		lpObj.isKeepMeLoginChkBoxDisplayed();
//		lpObj.isLoginButtonDisplayed();
		
		lpObj.verifyLoginPageFields();
	}
	@Test
	public void login() {
		System.out.println("Login");
		LoginPage lpObj = new LoginPage(driver);
		lpObj.enterUserName(cr.getPropData("userName"));
		lpObj.enterPassword(cr.getPropData("password"));
		lpObj.clickLoginButton();
		bu.waitForVisibilityOfLocatedBy(driver, "xpath","//a[@id='logoutLink']", 10);
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}