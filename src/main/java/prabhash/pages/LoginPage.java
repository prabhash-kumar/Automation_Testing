package prabhash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import prabhash.allLocators.Locators;

public class LoginPage {

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginAccount(String userName, String password) {
		driver.findElement(Locators.userNameForLogin).sendKeys(userName);
		driver.findElement(Locators.passwordForLogin).sendKeys(password);
		driver.findElement(Locators.forgotPasswordButton).click();
	}

	public void forgotPassword() {
		driver.findElement(Locators.forgotPasswordButton).click();
	}
}
