Feature: Registering for an Account

  Background:
    Given I am on the Trip Advisor homepage

    Scenario: Verify the registration page
      And I click on the signIn button
      And I click on the continue with email button
      When I click on the become a member button
      Then I verify the text "Become a member." as the title