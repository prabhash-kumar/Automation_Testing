package prabhash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import prabhash.allLocators.*;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickRegisterButton() {
		driver.findElement(Locators.Register_button).click();
	}

	public void clickForLogin() {
		driver.findElement(Locators.Login).click();
	}

	public void clickForDemo() {
		driver.findElement(Locators.DEMO).click();
	}
	
	

}
