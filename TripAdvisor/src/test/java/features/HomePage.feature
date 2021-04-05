Feature: Sign In Functionality check

  Background:
    Given I am on TripAdvisor homepage

  @regressionTest
  Scenario:
    And user clicks on Travel Forums
    And user clicks on the Sign in Button
    And user clicks on Continue With Email Button
    And user enters Email and Password from Table
      | Email Address       | Password  |
      | eashatest@gmail.com | random123 |
    When user clicks on Sign in button
    Then user verifies "Welcome back, Demo" appears

  @TestExcel
  Scenario: SearchBox Functionality Check using Excel
    And user clicks on the searchbox
    When user types data into search box from excel
    Then user verifies "Japan" is displayed properly

    @TestDB
  Scenario: SearchBox Functionality Check using DataBase
      And user clicks on the searchbox
    When user types data into search box from database
    Then user verifies "Bangladesh" is displayed properly




