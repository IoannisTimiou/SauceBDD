package StepDefinitions;
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class LoginStepsDefinitions {
//	static WebDriver driver;
//	@Given("User is on login page")
//	public void user_is_on_login() {
//		driver = new ChromeDriver(); 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.saucedemo.com");
//		
//	}
//	
//	@When("User enters valid {string} and {string}")
//	public void user_enters_valid_and(String username, String password) {
//		
//		driver.findElement(By.id("user-name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//	
//	@And("Click on Login Button")
//	public void click_on_login_button() {
//		driver.findElement(By.id("login-button")).click();
//	}
//	
//	@Then("User is navigated to Home page")
//	public void user_is_navigated_to_home_page() {
//	    Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size() > 0,"User is navigated to Home page");
//	}
//
//	
//	@And("close the browser")
//	public void close_the_browser() {
//	    driver.close();
//	}
//}
