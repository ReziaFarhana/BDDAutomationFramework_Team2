Feature: Verifing Online Banking product features

  Background:
    Given I am navigated to TDBank Home page TDBank
    And I clicked on the Log In Header Option
    And I locate and clicked on Online Banking under Login
    Then I should land on a new Online Banking windows tab "Welcome to Online Banking"

    Scenario: Products Tab option
      When I clicked on Products tab
      Then I should have a Title page "Products and Services"

      Scenario: Cross Border Banking Solutions Tab Option
        And I hover on the Solutions Link
        And I clicked on Cross Border Banking
        Then I should land on a new Online Banking windows 2 "Cross-Border Banking | TD Canada Trust"

