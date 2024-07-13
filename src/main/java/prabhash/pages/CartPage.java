package prabhash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import prabhash.allLocators.Locators;

public class CartPage {

	private WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void viewCartItem() {
		driver.findElement(Locators.cartIcon).click();
		driver.findElement(Locators.ViewCart).click();
	}

	public void changeQuantity(int quantity) {
		driver.findElement(Locators.updateCart).clear();
		driver.findElement(Locators.updateCart).sendKeys(String.valueOf(quantity));
		driver.findElement(Locators.updateButton).click();
	}

	public void clickOnCheckOut() {
		driver.findElement(Locators.checkoutButton).click();
	}

}
