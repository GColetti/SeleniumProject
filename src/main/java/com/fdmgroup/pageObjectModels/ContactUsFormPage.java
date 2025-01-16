package com.fdmgroup.pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsFormPage {
	public static WebElement headerText(WebDriver driver)
	{
		return driver.findElement(By.tagName("h1"));
	}
	
	public static WebElement nameInput(WebDriver driver)
	{
		return driver.findElement(By.name("name"));
	}
	
	public static WebElement emailInput(WebDriver driver)
	{
		return driver.findElement(By.name("email"));
	}
	
	public static WebElement orderNumberInput(WebDriver driver)
	{
		return driver.findElement(By.tagName("orderNumber"));
	}
	
	public static WebElement submitBtn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"gId\"]/button"));
	}
	
	public static WebElement chatWithUsBtn(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@id=\"channels\"]/div/div/button"));
	}
	
}
