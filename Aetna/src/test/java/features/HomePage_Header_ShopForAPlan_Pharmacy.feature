Feature: Check shop for plan functionality(Pharmacy)

  Background:

    Given I m on Aetna homePage
    And I click on shop for plan
    And I hover on Pharmacy

  @maria
  Scenario:  Pharmacy check functionality (Get pharmacy plan information )
    When I click on Get pharmacy plan information
    Then I should see Pharmacy benefits and services

  @maria
  Scenario:  Pharmacy check functionality (Find a pharmacy)
    When I click on Find a pharmacy
    Then I verify "Search By Location : DocFind" as Title

  @maria
  Scenario:  Pharmacy check functionality (Find medicine and costs )
    When I click Find medicine and costs
    Then I verify "Medicaid Insurance Coverage from Aetna | Eligibility & Health Plans" as Title