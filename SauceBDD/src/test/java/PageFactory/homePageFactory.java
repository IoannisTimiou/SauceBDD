package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {
	WebDriver driver;

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement lbl_cart;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement btn_sidemenu;
	@FindBy(xpath="//a[@id='inventory_sidebar_link']")
	WebElement btn_allitems;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement btn_addfirstitem;
	
	public void isCartDisplayed() {
		lbl_cart.isDisplayed();
	}
	
	public void clickCart() {
		lbl_cart.click();
	}
	public void clickMenu() {
		btn_sidemenu.click();
	}
	
	public void isSideMenuDisplayed() {
		btn_allitems.isDisplayed();
	}
	
	public void clickAddFirstItem() {
		btn_addfirstitem.click();
	}
	
	public homePageFactory (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
