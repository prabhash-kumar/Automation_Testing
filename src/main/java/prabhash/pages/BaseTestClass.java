package prabhash.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseTestClass {

	protected static WebDriver driver;
	protected ExtentReports extent;
	protected ExtentTest test;

	@BeforeMethod
	public void initConfiguration() {

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/index.php?route=cms/demo");

	}

//	//@AfterMethod
//	public void driverTearDown() {
//		driver.quit();
//	}
}
