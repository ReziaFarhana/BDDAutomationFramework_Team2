Feature:Check Member Support Functionality

  Background:

    Given I am on Aetna Home Page
    And I click on member Support
    And I hover on Account Management

@maria
  Scenario: Account Management Functionality (Log in to your member website)
    When I click on log in to your member website
    Then I should see Welcome to Aetna's member website
 @maria
  Scenario: Account Management Functionality (Find a doctor)
    When I click on Find doctor
    Then I verify "Find a Doctor, Dentist or Hospital | Aetna" is Title
@maria
  Scenario: 20.Account Management Functionality (Find medicine and costs)
    When I click on find medicine and costs
    Then I verify "Prescription Drug List (Formulary), Coverage & Costs - Aetna | Find a Medication"  Title

  @maria
  Scenario: Account Management Functionality (Find a Form)
    When I click on find a form
    Then I verify "Find a Form"  as Title

@maria
  Scenario: Account Management Functionality (Pay your premium)
    When I click Pay your premium
    Then I verify "Pay Your Monthly Premium Bill Online | Aetna"  Title

  @maria
  Scenario: Account Management Functionality (your ID card)
    When I click on your ID card
    Then I should see Welcome to Aetna's member website

  @maria
  Scenario: Account Management Functionality (Check a claim)
    When I click on Check a claim
    Then I should see Welcome to Aetna's member website

  @maria
  Scenario: Account Management Functionality (View Coverage )
    When I click on View Coverage
    Then I should see Welcome to Aetna's member website