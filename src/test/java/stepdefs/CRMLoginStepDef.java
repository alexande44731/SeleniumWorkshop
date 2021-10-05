package stepdefs;


import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.beust.jcommander.internal.Maps;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class CRMLoginStepDef extends TestBase {
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
//
	@Given("User is already in login page")
	public void user_is_already_in_login_page() {
		initialize();
	    
	}


	@When("User enters login credentials")
	public void user_enters_login_credentials() {
//		String strUser="";
//		String strPwd="";
		loginPage=new LoginPage();
		
		loginPage.login("tomsmith", "SuperSecretPassword!");
		
//		driver.findElement(By.name("username")).sendKeys("tomsmith");
//		driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.xpath("//button[@class='radius']")).click();
//		driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();	
		
	}
	
	
	@Then("User is on Home Page")
	public void user_is_on_home_page() {
		
		homePage=new HomePage();
		boolean isLoginSuccess=homePage.header();
		Assert.assertTrue(isLoginSuccess);
		homePage.logout();
	}
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}
}
