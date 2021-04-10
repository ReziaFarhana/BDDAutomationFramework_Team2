Feature: SearchBox Functionality Check


  Background:
    Given I am on TDBank HomePage
    And I click on SearchBox
    And I enter "Loans" in the SearchBox and click enter

  @Test
  Scenario: Validate SearchBox functionality
    Then I should see "What type of loans to you offer"


  @Test
  Scenario: Check Mortgage Calculator with Credentials
    Then I click on Mortgage Loans
    Then I Click on Calculate My Mortgage Button
    And I Enter my credentials
    When I Click on "Get My Option"
    Then I Should See Mortgage per Month

  @Test
  Scenario: Validate Personal Mortgage
    When I click on Personal Loans Button
    Then I Verify "TDBank Personal Loans" Displays

  @Test
  Scenario:To Check TDBank Small Business Loan Functionality Monthly payment Calculator
    Then I click on Small Business Loans
    And I Enter valid State info
    When I calculate Monthly Payments
    Then I Should see "Based on what you entered your monthly payment could be" Statement

  @Test
  Scenario: Check Commercial Loan Functionality to schedule an appointment
    Then I click on Commercial Loans
    And  I click Request a Call
    When I enter the credentials
    And I click the Submit Button
    Then  I should see "Thank you for reaching out to us"

  @Test
  Scenario: Check Home Equity Calculator Functionality
    Then I click on Home Equity
#              Then I enter valid State and City
    And  I enter Valid Information to calculate Home equity rate
    When I click on Get Rates
    Then I verify "Your personalized Home Equity quote" Statement Displays








