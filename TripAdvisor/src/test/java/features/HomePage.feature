Feature: HomePage excel

  Background:
    Given I am on the Trip Advisor main homepage


  @Test
  Scenario: SearchBox Functionality Check using Excel
    And user clicks on the searchbox
    When user types data into search box from excel
    Then user verifies "USA" is displayed properly

