Feature: Sign In Functionality check

  Background:
    Given I am on TripAdvisor homepage

  Scenario:
    And user clicks on Travel Forums
    And user clicks on the Sign in Button
    And user clicks on Continue With Email Button
    And user enters Email and Password from Table
      | Email Address         | Password  |
      | eashakhanam@gmail.com | random123 |
    When user clicks on Sign in button
    Then user verifies "Welcome back, Demo" appears




