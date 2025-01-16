#Date: 22-07-2022
#Author: gianluca.coletti@fdmgroup.com

@help_article
Feature: eBay Help Article

  Scenario: Article title element exists
    Given a user launches the browser
    And a user launches eBay web application
    When a user clicks on the Help & Contact link
    And a user enters text into the search input element
    And a user clicks on an specific help article
    Then a help article will be displayed

  Scenario: Thumbs up element exists and is clickable
    Given a user launches the browser
    And a user launches eBay web application
    When a user clicks on the Help & Contact link
    When a user enters text into the search input element
    And a user clicks on an specific help article
    Then a help article contain a thumbs up rating button
    And a feedback text is displayed after clicking
