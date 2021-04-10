Feature: Check shop for plan functionality(Medicare)

  Background:
  @maria
    Given I m on Aetna homePage
    And I click on shop for plan
    And I hover on Dental vision and Supplemental

  @maria
  Scenario: Dental vision and Supplemental check functionality (Dental plans)
    When I click on Dental plans
    Then I verify "Aetna Dental Insurance Plans | Buy Individual & Family Dental Coverage & Shop Plan Options" as Title

  @maria
  Scenario: Dental vision and Supplemental check functionality (Find A dentist)
    When I click on Find a dentist
    Then I should see Directory of Health Care Professionals

  @maria
  Scenario: Dental vision and Supplemental check functionality (Vision plans )
    When I click on Vision plans
    Then I should see Vision insurance for individuals

  @maria
  Scenario: Dental vision and Supplemental check functionality (Find an eye doctor)
    When I click on Find an eye doctor
    Then I should see Directory of Health Care Professionals

  @maria
  Scenario: Dental vision and Supplemental check functionality (Supplemental plans)
    When I click on Supplemental plans
    Then I verify "Supplemental Health Insurance Plans from Aetna | Voluntary Benefits for Individuals & Families" as Title


