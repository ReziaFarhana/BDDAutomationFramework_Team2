Feature: HomePage Header Functionalities
  Background:
    Given user am on TD Bank homepage
    When user hovers over Products Drop down

    @sanityTest
    Scenario: Check Checking Link
      And user clicks on Checking
      Then user verifies "Open A Checking Account Online In Minutes | TD Bank Checking Accounts" is the title