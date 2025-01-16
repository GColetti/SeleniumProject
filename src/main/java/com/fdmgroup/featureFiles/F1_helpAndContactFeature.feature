#Date: 22-07-2022
#Author: gianluca.coletti@fdmgroup.com

@help
Feature: eBay Help & Contact Link
	

  Scenario: Search input element exists
    Given a user launches the browser
		And a user launches eBay web application 
		When a user clicks on the Help & Contact link
		Then the Customer Service page should be displayed
