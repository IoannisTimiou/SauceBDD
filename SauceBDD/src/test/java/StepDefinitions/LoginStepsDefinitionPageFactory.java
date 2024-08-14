package StepDefinitions;
import java.time.Duration;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import PageFactory.homePageFactory;
import PageFactory.loginPageFactory;
//import PageObjects.loginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepsDefinitionPageFactory {
	static WebDriver driver;
	loginPageFactory login;
	homePageFactory home;
	
	@Given("User is on login page")
	public void user_is_on_login() {
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com");
		
	}
	
	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) throws InterruptedException {
		
		login = new loginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}
	
	@And("Click on Login Button")
	public void click_on_login_button() {
		login.clickLogin();
	}
	
	@Then("User is navigated to Home page")
	public void user_is_navigated_to_home_page() {
		home = new homePageFactory(driver);
		home.isCartDisplayed();
		//login.isLogoDisplayed();
	    //Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size() > 0,"User is navigated to Home page");
	}

	
	@And("close the browser")
	public void close_the_browser() {
	    //driver.close();
		driver.quit();
	}
}
