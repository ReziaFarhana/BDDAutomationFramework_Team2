Feature: TDBank HomePage Header Product Feature

  Background:
    Given I am on  TDBank homePage
    When I hover on Product

  Scenario: TD Bank Product Functionality (Checking)
    And I click on Checking account tab
    Then I should see Checking comes jam-packed with perks — and a bonus.


  Scenario: TD Bank Product Functionality (saving)
    When I click on saving
    Then I verify page title as "Open A Personal Savings Or Money Market Account | TD Bank" is a Title


  Scenario: TD Bank Product Functionality (CD's)
    When I click on CD'S
    Then I verify page title as "Open A Personal Savings Or Money Market Account | TD Bank" is Title


  Scenario: TD Bank Product Functionality (credit card)
    When I click on credit card
    Then I should see TD Bank Credit Cards


  Scenario: TD Bank Product Functionality (Mortgage)
    When I click on Mortgage
    Then I verify page title as "TD Bank Mortgages and New Home Loan Rates and Quotes" Title

