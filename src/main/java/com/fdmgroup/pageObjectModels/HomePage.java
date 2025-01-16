package com.fdmgroup.pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement helpAndContactButton(WebDriver driver)
	{
		return driver.findElement(By.linkText("Help & Contact"));
	}

}
