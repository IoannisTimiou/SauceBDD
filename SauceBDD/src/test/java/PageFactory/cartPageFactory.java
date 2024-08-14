package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPageFactory {
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='inventory_item_desc']")
	WebElement lbl_desc;
	
	public void isDescriptionDisplayed() {
		lbl_desc.isDisplayed();
	}
	
	public cartPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
