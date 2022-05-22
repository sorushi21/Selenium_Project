package org.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class LoginPage {
	@SuppressWarnings("unused")
	private WebDriver driver;
	//WebElements
	//WebElement uName=driver.findElement(By.xpath(""));	//old
	
//	@FindBy(xpath="")		//e.g.
//	private List<WebElement> multipleElementsEx;
	
//	By uNameTxtField1 = By.id("");
//	By pwdTxtField1 = By.cssSelector("");
//	By loginBtn1 = By.xpath("");
	
	@FindBy(id="username")
	private WebElement uNameTxtField;
	
	@FindBy(css="input[name='pwd']")
	private WebElement pwdTxtField;
	
	@FindBy(xpath="//a[@id='loginButton']/div")
	private WebElement loginBtn;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoginChkBox;
	
	//Constructor
	public LoginPage(WebDriver driver) {	//initialize the WebElements
		//PageFactory.initElements(driver,LoginPage.class);
				//OR
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	//Page action methods
	public boolean isUserNameFieldDisplayed() {
		return uNameTxtField.isDisplayed();
	}
	public boolean isPasswordFieldDisplayed() {
		return pwdTxtField.isDisplayed();
	}
	public boolean isLoginButtonDisplayed() {
		return loginBtn.isDisplayed();
	}
	public boolean isKeepMeLoginChkBoxDisplayed() {
		return keepMeLoginChkBox.isDisplayed();
	}
	public void verifyLoginPageFields() {
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(isUserNameFieldDisplayed(), "'User Name' is not displayed.");
		sa.assertTrue(isPasswordFieldDisplayed(), "'Password' is not displayed.");
		sa.assertTrue(isKeepMeLoginChkBoxDisplayed(), "'Keep Me Login check box' is not displayed.");
		sa.assertTrue(isLoginButtonDisplayed(), "'Login Button' is not displayed.");
		sa.assertAll();
	}
	
	public void enterUserName(String uName) {
		uNameTxtField.sendKeys(uName);
	}
	public void enterPassword(String pwd) {
		pwdTxtField.sendKeys(pwd);
	}
	public void clickLoginButton() {
		loginBtn.click();
	}
	public void doLogin(String uName,String pwd) {
		uNameTxtField.sendKeys(uName);
		pwdTxtField.sendKeys(pwd);
		loginBtn.click();
	}
	public void doLogin2(String uName,String pwd) {
		enterUserName(uName);
		enterPassword(pwd);
		clickLoginButton();
	}
}