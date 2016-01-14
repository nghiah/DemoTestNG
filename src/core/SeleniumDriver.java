package core;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDriver {

	private static FirefoxDriver driver = new FirefoxDriver();
	
	private SeleniumDriver(){}
	
	public static FirefoxDriver getDriver()
	{
		return driver;
	}
}
