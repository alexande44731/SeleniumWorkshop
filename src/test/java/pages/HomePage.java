package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[@class='button secondary radius']")
	WebElement logout;
	
	@FindBy(xpath="//div[@id='flash']")
	WebElement header;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean header() {
		return header.isDisplayed();
	}
	public void logout() {
		logout.click();
	}
}
