package prabhash.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import prabhash.allLocators.Locators;

public class CheckOutPage {

	private WebDriver driver;

	public CheckOutPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void checkoutProcess(String firstName, String lastName, String EmailID, String address, String city,
			int postCode) {

		driver.findElement(Locators.GuestCheckout).click();
		driver.findElement(Locators.firstNameField).sendKeys(firstName);
		driver.findElement(Locators.lastNameField).sendKeys(lastName);
		driver.findElement(Locators.emailField).sendKeys(EmailID);
		driver.findElement(Locators.addressField).sendKeys(address);
		driver.findElement(Locators.CityField).sendKeys(city);
		driver.findElement(Locators.postCodeField).sendKeys(String.valueOf(postCode));
		
	}
	public void continueButton() {
		driver.findElement(Locators.continueButton).click();
	}

	public void checkout() {
		driver.findElement(Locators.checkOut).click();
	}

}
