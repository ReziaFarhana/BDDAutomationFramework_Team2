Feature: HomePage Header Functionalities
  Background:
    Given user am on TD Bank homepage
    When user hovers over Products Drop down

    @sanityTest
    Scenario: Check Checking Link
      And user clicks on Checking
      Then user verifies "Open A Checking Account Online In Minutes | TD Bank Checking Accounts" is the title

  Scenario: Check Saving Link
    And user clicks on Saving
    Then user verifies "Open A Personal Savings Or Money Market Account | TD Bank" is the title

  Scenario: Check CD Link
    And user clicks on CD
    Then user verifies "Certificate of Deposit Offers & Interest Rate Bumps | TD Bank" is the title

  Scenario: Check Credit Cards Link
    And user clicks on Credit Cards
    Then user verifies "Apply for a Credit Card Online | TD Bank Rewards Credit Cards " is the title

  Scenario: Check Home Equity Loans & Lines Link
    And user clicks on Home Equity Loans and Lines
    Then user verifies "Home Equity Lines of Credit and Loans | TD Bank" is the title

  Scenario: Check Home Mortgage Link
    And user clicks on Mortgage
    Then user verifies "TD Bank Mortgages and New Home Loan Rates and Quotes" is the title

  Scenario: Check Home Personal Loans Link
    And user clicks on Personal Loans
    Then user verifies "Personal Loans, No Fee, Unsecured, Fixed Rate | TD Bank Fit Loan" is the title

  Scenario: Check Home IRA Link
    And user clicks on IRA
    Then user verifies "TD Bank Personal IRAs" is the title

  Scenario: Check Home Debit Cards Link
    And user clicks on Debit Cards
    Then user verifies "Debit Cards – Benefits of Personal Visa Debit Card | TD Bank" is the title


  Scenario: Check Home Prepaid Cards Link
    And user clicks on Prepaid Cards
    Then user verifies "Reloadable Prepaid Debit Cards For Kids & Businesses | TD Bank" is the title

  Scenario: Check Home Special Offers Link
    And user clicks on Special Offers
    Then user verifies "TD Bank Offers, Promotions And Sign Up Bonuses" is the title

