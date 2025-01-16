#Date: 22-07-2022
#Author: gianluca.coletti@fdmgroup.com

@search
Feature: Search eBay Help
	

  Scenario: Search input element exists
    Given a user launches the browser
    And a user launches eBay web application
    When a user clicks on the Help & Contact link
    Then a search input element should be displayed


  Scenario: Search help topics with input
    Given a user launches the browser
    And a user launches eBay web application
    When a user clicks on the Help & Contact link
    And a user enters text into the search input element
    Then search results will appear corresponding to the search input
