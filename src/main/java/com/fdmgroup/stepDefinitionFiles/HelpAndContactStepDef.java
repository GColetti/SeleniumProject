package com.fdmgroup.stepDefinitionFiles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.fdmgroup.pageObjectModels.CustomerServicePage;
import com.fdmgroup.pageObjectModels.HomePage;
import com.fdmgroup.testData.DataFile;
import com.fdmgroup.utilities.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HelpAndContactStepDef {
	private DriverUtilities driverUtilities;
	private WebDriver driver;

	@Given("a user launches the browser")
	public void a_user_launches_the_browser() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		driver.manage().window().maximize();
	}

	@When("a user launches eBay web application")
	public void a_user_launches_e_bay_web_application() {
		driver.get(DataFile.HomePageURL);
	}

	@When("a user clicks on the Help & Contact link")
	public void a_user_clicks_on_the_help_contact_link() {
		// Find the Help & Contact link from the home page
		HomePage.helpAndContactButton(driver).click();
		assertTrue(HomePage.helpAndContactButton(driver).isDisplayed());
	}

	@Then("the Customer Service page should be displayed")
	public void the_customer_service_page_should_be_displayed() {
		// Get the text from the title on the customer service page
		String title = CustomerServicePage.titleElement(driver).getText();
		assertEquals("Customer Service", title);
	}

}
