package prabhash.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import prabhash.allLocators.Locators;

public class RegistrationPage {

	private WebDriver driver;
	private WebDriverWait wait;

	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	public void registrationFormFill(String userName, String firstName, String lastName, String email_ID,
			String country, String password) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.UserName)).sendKeys(userName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.FirstName)).sendKeys(firstName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LastName)).sendKeys(lastName);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.E_mailID)).sendKeys(email_ID);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.country)).sendKeys(country);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Password)).sendKeys(password);
	}

	public void submitForm() {
		 
		// Here Captcha step is handled manually 
		wait.until(ExpectedConditions.elementToBeClickable(Locators.RegisterationSubmit)).click();
	}
}
