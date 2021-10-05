package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='radius']")
	WebElement loginBtn;
	
	public LoginPage() {
	PageFactory.initElements(driver,this);	
	}

	public void login(String strUser,String strPwd)
	{
		username.sendKeys(strUser);
		password.sendKeys(strPwd);
		loginBtn.click();
	}
	
}
