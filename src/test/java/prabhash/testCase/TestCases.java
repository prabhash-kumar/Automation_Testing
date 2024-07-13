package prabhash.testCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import prabhash.pages.BaseTestClass;
import prabhash.pages.CartPage;
import prabhash.pages.CheckOutPage;
import prabhash.pages.DemoPage;
import prabhash.pages.HomePage;
import prabhash.pages.ProductDetailPage;
import prabhash.pages.ProductListPage;
import prabhash.pages.RegistrationPage;
import prabhash.pages.LoginPage;

public class TestCases extends BaseTestClass {

	@Test
	public void testRegistration() {
		HomePage homePage = new HomePage(driver);
		homePage.clickRegisterButton();

		RegistrationPage registration = new RegistrationPage(driver);
		registration.registrationFormFill("PrabhashKumar", "Prabhash", "Kumar", "kumar@gmail.com", "India",
				"password@123");

		// Here Captcha step is handled manually

		registration.submitForm();
		Assert.assertTrue(driver.getTitle().contains("Your Account Has Been Created!"), "Registration failed!");
	}

	@Test
	public void testLogin() {
		HomePage homePage = new HomePage(driver);
		homePage.clickForLogin();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginAccount("kumar@gmail.com", "password@123");
		// Set PIN are handled manually
		// if password is invalid than
		loginPage.forgotPassword();
		// reset password and set PIN are handled
		Assert.assertTrue(driver.getTitle().contains("Welcome"), "Login failed!");
	}

	@Test
	public void testProductListing() throws IOException {
		HomePage homePage = new HomePage(driver);
		homePage.clickForDemo();

		DemoPage demoPage = new DemoPage(driver);
		demoPage.storeFront();

		ProductListPage productListPage = new ProductListPage(driver);
		productListPage.extractProductDetails("products.xlsx");

		Assert.assertTrue(productListPage.getProductNames().size() > 0, "No products found!");
	}

	@Test
	public void testAddToCart() {
		HomePage homePage = new HomePage(driver);
		homePage.clickForDemo();

		DemoPage demoPage = new DemoPage(driver);
		demoPage.storeFront();

		ProductListPage productListPage = new ProductListPage(driver);
		productListPage.clickFirstProduct();
		ProductDetailPage productDetailPage = new ProductDetailPage(driver);
		productDetailPage.quantityChange(6);
		productDetailPage.addToCart();

		CartPage cartPage = new CartPage(driver);
		cartPage.viewCartItem();

		Assert.assertTrue(driver.getTitle().contains("Shopping Cart"), "Cart is empty!");
	}

	@Test
	public void testCheckout() {
		HomePage homePage = new HomePage(driver);
		homePage.clickForDemo();

		DemoPage demoPage = new DemoPage(driver);
		demoPage.storeFront();

		ProductDetailPage productDetailPage = new ProductDetailPage(driver);
		productDetailPage.quantityChange(6);
		productDetailPage.addToCart();

		CartPage cartPage = new CartPage(driver);
		cartPage.clickOnCheckOut();

		CheckOutPage checkoutPage = new CheckOutPage(driver);
		checkoutPage.checkoutProcess("Prabhash", "Kumar", "pkumar@gmail.com", "SilkBoard", "Bengaluru", 560085);
		checkoutPage.continueButton();
		checkoutPage.checkout();
		Assert.assertTrue(driver.getTitle().contains("Your Order Has Been Placed!"), "Checkout failed!");
	}
}
