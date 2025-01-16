package com.fdmgroup.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverUtilities {
	private static DriverUtilities driverUtilities; // 1. Private static instance of the class
	private WebDriver driver;

	private DriverUtilities() { // 2. Private constructor

	}

	public static DriverUtilities getInstance() // 3. Public static getInstance() method
	{
		if (driverUtilities == null) {
			driverUtilities = new DriverUtilities();
		}
		return driverUtilities;
	}
	
	public WebDriver getDriver()
	{
		if(driver == null)
		{
		createDriver();
		}
		return driver;
	}

	private void createDriver() {
		String driverName = getDriverName();

		switch (driverName) {
		case "google chrome":
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
			this.driver = new ChromeDriver();
			break;

		case "firefox":

			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
			break;
		default:
			System.out.println("Brower name in Invalid!");
			break;
		}
	}

	private String getDriverName() {
		// TODO Auto-generated method stub
		Properties config = new Properties();
		String driverName = "";
		try {
			config.load(new FileInputStream("src/test/resources/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String key : config.stringPropertyNames()) {

			if (key.equals("Browser")) {
				driverName = config.getProperty(key);
			}

		}

		return driverName;
	}

	public static void main(String[] args) {
		
	}

}
