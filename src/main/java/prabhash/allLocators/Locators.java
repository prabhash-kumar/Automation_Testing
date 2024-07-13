package prabhash.allLocators;

import org.openqa.selenium.By;

public class Locators {

	// HomePage Locators

	public static final By Register_button = By.xpath("//a[@class='btn btn-black navbar-btn']");
	public static final By DEMO = By.linkText("Demo");
	public static final By Login = By.linkText("Login");

	// RegistrationPage Locators

	public static final By UserName = By.id("input-username");
	public static final By FirstName = By.id("input-firstname");
	public static final By LastName = By.id("input-lastname");
	public static final By E_mailID = By.id("input-email");
	public static final By country = By.id("input-country");
	public static final By Password = By.id("input-password");
	public static final By RegisterationSubmit = By.xpath("//div[@id='button-register']/button");

	// Login Page locators
	public static final By userNameForLogin = By.id("input-email");
	public static final By passwordForLogin = By.id("input-password");
	public static final By loginButten = By.xpath("//div[@class='col-sm-6']/button");
	public static final By forgotPasswordButton = By.xpath("//a[contains(text(),'Forgot your password?')]");

	// Demo Page

	public static final By Store_Front = By.xpath("//span[contains(text(),'View Store Front')]");

	// ProductListPage

	public static final By productNames = By.xpath("//div[@class='product-thumb']//h4/a");
	public static final By productPrices = By.xpath("//div[@class='product-thumb'] //span[@class='price-new']");

	// PDP(Product Detail Page)

	public static By quantity = By.id("input-quantity");
	public static By addToCart = By.id("button-cart");

	// Cart Page
	public static final By cartIcon = By.xpath("//button[contains(@class, 'dropdown-toggle')]");
	public static final By ViewCart = By.linkText("View Cart");
	public static final By updateCart = By.name("quantity");
	public static final By updateButton = By.cssSelector("button[type='submit'].btn-primary");
	public static final By checkoutButton = By.linkText("Checkout");

	// Checkout page

	public static final By firstNameField = By.id("input-username");
	public static final By lastNameField = By.id("input-firstname");
	public static final By emailField = By.id("input-lastname");
	public static final By addressField = By.id("input-email");
	public static final By CityField = By.id("input-password");
	public static final By postCodeField = By.id("input-country");
	public static final By continueButton = By.id("button-register");
	public static final By GuestCheckout = By.id("input-guest");
	
	public static final By checkOut=By.id("button-confirm");
}
