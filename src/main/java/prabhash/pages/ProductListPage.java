package prabhash.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import prabhash.allLocators.Locators;

public class ProductListPage {

	private WebDriver driver;

	public ProductListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getProductNames() {
		return driver.findElements(Locators.productNames);
	}

	public List<WebElement> getProductPrices() {
		return driver.findElements(Locators.productPrices);
	}

	public void extractProductDetails(String fileName) throws IOException {
		List<String[]> productDetails = new ArrayList<>();
		List<WebElement> productNames = getProductNames();
		List<WebElement> productPrices = getProductPrices();

		for (int i = 0; i < productNames.size(); i++) {
			String productName = productNames.get(i).getText();
			String productPrice = productPrices.get(i).getText();
			String[] priceParts = productPrice.split("\n");
			String mrp = priceParts[0];
			String discountPrice = priceParts.length > 1 ? priceParts[1] : "";
			productDetails.add(new String[] { productName, mrp, discountPrice });
		}

		ExcelUtilFile.writeToExcelSheet(productDetails, fileName);
	}

	 public void clickFirstProduct() {
	        List<WebElement> products = driver.findElements(Locators.productNames); 
	        if (!products.isEmpty()) {
	            products.get(0).click();
	        } else {
	            throw new RuntimeException("No products found on the product list page.");
	        }
	    }
}
