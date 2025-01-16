package com.fdmgroup.pageObjectModels;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HelpArticlePage {

	public static WebElement contactUsButton(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[1]/div[4]/div[2]/div/div[2]/a"));
	} 

	public static WebElement articleTitle(WebDriver driver) {
		return driver.findElement(By.className("article_title"));
	}

	public static WebElement thumbsUpBtn(WebDriver driver) {
		return driver.findElement(By.id("thumbs_up"));
	}

	public static WebElement feedbackText(WebDriver driver) {
		return new WebDriverWait(driver, Duration.ofSeconds(15))
		// Explicit wait until results are clickable
		.until(ExpectedConditions.elementToBeClickable(By.className("feedback")));
	}

}
