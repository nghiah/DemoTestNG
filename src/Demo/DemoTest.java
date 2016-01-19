package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import core.SeleniumDriver;


public class DemoTest {

	WebDriver driver;

	@Test
	public void tc001() {

		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("User1");
		driver.findElement(By.name("lastName")).sendKeys("Surname1");
		driver.findElement(By.name("phone")).sendKeys("123456789");
		driver.findElement(By.name("userName")).sendKeys("user1@test.com");
		driver.findElement(By.name("address1")).sendKeys("Test Address");
		driver.findElement(By.name("city")).sendKeys("Test City");
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("ANGOLA");
		driver.findElement(By.name("email")).sendKeys("user1@test.com");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("confirmPassword")).sendKeys("user1");
		driver.findElement(By.name("register")).click();
		
		Assert.assertEquals("http://newtours.demoaut.com/create_account_success.php", driver.getCurrentUrl());
	
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass
	public void beforeClass() {

		driver = SeleniumDriver.getDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@AfterClass
	public void afterClass() {

		driver.close();
		driver.quit();

	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

	@BeforeSuite
	public void beforeSuite() {
	}

	@AfterSuite
	public void afterSuite() {
	}

}
