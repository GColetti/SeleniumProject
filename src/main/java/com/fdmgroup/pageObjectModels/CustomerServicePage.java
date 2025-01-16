package com.fdmgroup.pageObjectModels;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomerServicePage {
	
	public static WebElement titleElement(WebDriver driver) {
		return driver.findElement(By.id("gh-title"));
	}
	
	public static WebElement searchInputElement(WebDriver driver) {
		return driver.findElement(By.id("search_input_element"));
	}
	
	public static WebElement searchLink(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(10))
				// Explicit wait until results are clickable
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href*='HELP1002']")));
	}
	
}
