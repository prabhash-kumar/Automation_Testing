package prabhash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import prabhash.allLocators.Locators;

public class ProductDetailPage {

	private WebDriver driver;

	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void quantityChange(int quantity) {

		driver.findElement(Locators.quantity).clear();
		driver.findElement(Locators.quantity).sendKeys(String.valueOf(quantity));
	}

	public void addToCart() {
		driver.findElement(Locators.addToCart).click();
	}
}
