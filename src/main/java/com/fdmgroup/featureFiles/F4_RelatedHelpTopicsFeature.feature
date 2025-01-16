#Date: 22-07-2022
#Author: gianluca.coletti@fdmgroup.com

@related_topics
Feature: eBay Related Help Topics

  Scenario: Related Help Topics are displayed and is clickable
    Given a user launches the browser
    And a user launches eBay web application
    When a user clicks on the Help & Contact link
    And a user enters text into the search input element
    And a user clicks on an specific help article
    Then a help article will be displayed
    And related help topics will be displayed
    And a user can browse related help topics with next slide button

  Scenario: Link back to help topic exists and is clickable
    Given a user launches the browser
    And a user launches eBay web application
    When a user clicks on the Help & Contact link
    And a user enters text into the search input element
    And a user clicks on an specific help article
    Then a help article contains a link back to the current help topic
    And a user can navigate back to the help topic by clicking the link text
