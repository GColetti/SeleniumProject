package com.fdmgroup.stepDefinitionFiles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.pageObjectModels.CustomerServicePage;
import com.fdmgroup.pageObjectModels.HelpArticlePage;

import com.fdmgroup.utilities.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class HelpArticleStepDef {
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	WebElement thumbsUpButton, searchLink, articleTitle, contactUsButton;
	
	@Given("a user clicks on an specific help article")
	public void a_user_clicks_on_an_specific_help_article() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		// Get the Web Element corresponding to the search result link
		searchLink = CustomerServicePage.searchLink(driver);
		assertTrue(searchLink.isDisplayed());
		// Naviagte to link from search results
		searchLink.click();
	}

	@Then("a help article will be displayed")
	public void a_help_article_will_be_displayed() {
		// Get the String corresponding to the article title text
		articleTitle = HelpArticlePage.articleTitle(driver);
		String articleTitleText = articleTitle.getText();

		// Check if we were properly navigated to the link by asserting that the article
		// title equals as expected
		assertEquals("How buying works", articleTitleText);
	}

	@Then("a help article contain a thumbs up rating button")
	public void a_help_article_contain_a_thumbs_up_rating_button() {
		// Get the thumbs up button Web Element
		thumbsUpButton = HelpArticlePage.thumbsUpBtn(driver);
		assertTrue(thumbsUpButton.isDisplayed());
	}

	@Then("a feedback text is displayed after clicking")
	public void a_feedback_text_is_displayed_after_clicking() {
		// Click thumbs up button and get feedback text
		thumbsUpButton = HelpArticlePage.thumbsUpBtn(driver);
		thumbsUpButton.click();
		String feedbackText = HelpArticlePage.feedbackText(driver).getText();

		// Check if the button was successfully clicked by asserting that the feedback
		// text equals as expected
		assertEquals("Thanks for the feedback!\n"
				+ "Thank you for your feedback. If you have additional questions, we would be happy to help you.",
				feedbackText);
	}

}
