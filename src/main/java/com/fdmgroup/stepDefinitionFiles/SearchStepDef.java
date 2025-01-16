package com.fdmgroup.stepDefinitionFiles; 

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.fdmgroup.pageObjectModels.CustomerServicePage;

import com.fdmgroup.utilities.DriverUtilities;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef {
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	WebElement searchInputElement, searchLink;
	
	@Given("a search input element should be displayed")
	public void a_search_input_element_should_be_displayed() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		// Get the Web Element corresponding to the search input element
		searchInputElement = CustomerServicePage.searchInputElement(driver);
		assertTrue(searchInputElement.isDisplayed());
	}

	@When("a user enters text into the search input element")
	public void a_user_enters_text_into_the_search_input_element() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		searchInputElement = CustomerServicePage.searchInputElement(driver);
		// Send string "Buying" into search input
		searchInputElement.sendKeys("Buying");
	}

	@Then("search results will appear corresponding to the search input")
	public void search_results_will_appear_corresponding_to_the_search_input() {
		// Get the Web Element corresponding to the search result link
		searchLink = CustomerServicePage.searchLink(driver);
		// Naviagte to link from search results
		searchLink.click();
	}
}
