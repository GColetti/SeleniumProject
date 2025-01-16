package com.fdmgroup.pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	public static WebElement greetingMessage(WebDriver driver) {
		return driver.findElement(By.id("greeting-msg"));
	}
	
	public static WebElement continueAsGuestButton(WebDriver driver) {
		return driver.findElement(By.id("ocs-btn"));
	}
}
