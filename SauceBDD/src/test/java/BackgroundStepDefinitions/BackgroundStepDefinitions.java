package BackgroundStepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.cartPageFactory;
import PageFactory.homePageFactory;
import PageFactory.loginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundStepDefinitions {
	static WebDriver driver;
	loginPageFactory login;
	homePageFactory home;
	cartPageFactory cart;
	String username = "standard_user";
	String password = "secret_sauce";
	
	@Given("User accesses app login page")
	public void user_accesses_app_login_page() {
		driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com");
	}
	
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		login = new loginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		login.clickLogin();
	}

	@Then("User should be able to navigate to Home page")
	public void user_should_be_able_to_navigate_to_home_page() {
	    home = new homePageFactory(driver);
	    home.isCartDisplayed();
	}

	@And("clicks on breadcrumb icon")
	public void clicks_on_breadcrumb_icon() {
	    home.clickMenu();
	}

	@Then("User should be able to see the side menu")
	public void user_should_be_able_to_see_the_side_menu() {
	    home.isSideMenuDisplayed();
	}
	
	@And("close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	
	@And("clicks on Add to button")
	public void clicks_on_add_to_button() {
	    home.clickAddFirstItem();
	}

	@Then("Item should be added to cart")
	public void item_should_be_added_to_cart() {
	    home.clickCart();
	    cart = new cartPageFactory(driver);
	    cart.isDescriptionDisplayed();
	}
	
	
}
