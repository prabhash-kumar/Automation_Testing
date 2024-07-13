package prabhash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import prabhash.allLocators.Locators;

public class DemoPage {

	private WebDriver driver;

	public DemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void storeFront() {

		driver.findElement(Locators.Store_Front).click();
	}
}
