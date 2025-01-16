package com.fdmgroup.stepDefinitionFiles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.pageObjectModels.ContactUsFormPage;
import com.fdmgroup.pageObjectModels.HelpArticlePage;
import com.fdmgroup.pageObjectModels.SignInPage;
import com.fdmgroup.utilities.DriverUtilities;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ContactUsStepDef {
	private DriverUtilities driverUtilities;
	private static WebDriver driver;
	private WebElement contactUsButton;
	
	@Given("a contact us button is displayed")
	public void a_contact_us_button_is_displayed() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		// Get the contact us button Web Element and assert that it is displayed
		contactUsButton = HelpArticlePage.contactUsButton(driver);
	    assertTrue(contactUsButton.isDisplayed());
	}
	
	@Then("a user can navigate to the Sign in page by clicking the button")
	public void a_user_can_navigate_to_the_contact_form_by_clicking_the_button() {
	    // Navigate to sign in page by clicking contact us button
		contactUsButton.click();
		assertEquals("Hello", SignInPage.greetingMessage(driver).getText());
	}
	
	@Then("a user can continue as a guest by clicking continue button")
	public void a_user_can_continue_as_a_guest_by_clicking_continue_button() {
		// Continue to contact form by clicking continue as guest button
		SignInPage.continueAsGuestButton(driver).click();
		String headerText = ContactUsFormPage.headerText(driver).getText();
		assertEquals("Contact us", headerText);
	}
	
	@Then("a user can fill out their {string}, {string}, and {int}")
	public void a_user_can_fill_out_their_and(String name, String email, int orderNumber) {
		   ContactUsFormPage.nameInput(driver).sendKeys(name);
		   ContactUsFormPage.emailInput(driver).sendKeys(email);
		   ContactUsFormPage.orderNumberInput(driver).sendKeys(String.valueOf(orderNumber));
	}
	
	@Then("a user can submit the form")
	public void a_user_can_submit_the_form() {
		// Click the submit button
		ContactUsFormPage.submitBtn(driver).click();
	}

	@Then("the user will be redirected to the chat with us page")
	public void the_user_will_be_redirected_to_the_chat_with_us_page() {
		// Assert that user is redirected to chat with us page
		assertTrue(ContactUsFormPage.chatWithUsBtn(driver).isDisplayed());
	}
	
//	@AfterAll
//	public static void teardown() {
//		driver.quit();
//	}
	
}
