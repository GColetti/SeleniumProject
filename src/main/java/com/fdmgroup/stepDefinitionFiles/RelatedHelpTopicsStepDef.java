 package com.fdmgroup.stepDefinitionFiles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.fdmgroup.utilities.DriverUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class RelatedHelpTopicsStepDef {
	private DriverUtilities driverUtilities;
	private WebDriver driver;
	WebElement nextSlide;
	WebElement linkArrowLeftBlue;
	
	@Given("related help topics will be displayed")
	public void related_help_topics_will_be_displayed() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		// Get the Web Element corresponding to the next slide button
		nextSlide = driver.findElement(By.xpath("//*[@id=\"relatedLinks\"]/div/div[2]"));
		assertTrue(nextSlide.isDisplayed());
	}

	@Then("a user can browse related help topics with next slide button")
	public void a_user_can_browse_related_help_topics_with_next_slide_button() {
		// Click the next slide button (x2 Maximum)
		nextSlide.click();	
		nextSlide.click();
	}

	@Then("a help article contains a link back to the current help topic")
	public void a_help_article_contains_a_link_back_to_the_current_help_topic() {
		driverUtilities = DriverUtilities.getInstance();
		driver = driverUtilities.getDriver();
		linkArrowLeftBlue = driver.findElement(By.className("link_arrow_left_blue"));
		assertTrue(linkArrowLeftBlue.isDisplayed());
	}

	@Then("a user can navigate back to the help topic by clicking the link text")
	public void a_user_can_navigate_back_to_the_help_topic_by_clicking_the_link_text() {
		linkArrowLeftBlue.click();
		String heading = driver.findElement(By.tagName("h1")).getText();
		assertEquals("Buying", heading);
		
	}

}
