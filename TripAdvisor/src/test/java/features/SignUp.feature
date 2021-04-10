Feature: Signing up for an Account

  Background:
    Given I am on the Trip Advisor homepage


  @Test
  Scenario: Signup with valid details
    And I click on the login button
    When I click on the continue with email button
    And I enter user information from the table
      | Email    | n3wUs3r123@gmail.com |
      | Password | p@sswo0rd123         |
    Then I click on the join button

