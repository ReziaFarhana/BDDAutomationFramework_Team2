Feature: Check Member Support Functionality(The health guide)

  Background:
    Given I m on Aetna homePage
    And I click on member Support
    And I hover the health guide

  @maria
  Scenario:  health guide check functionality  (All health resources)
    When I click on all health resources
    Then I should see Your good health starts here

  @maria
  Scenario:  health guide check functionality ( living healthy)
    When I click living healthy
    Then I verify "Living Healthy: Articles & Tips | Aetna" is the Title

  @maria
  Scenario:  health guide check functionality ( Understanding health care)
    When I click Understanding health care
    Then I verify "Understanding Health Care | Aetna"  the Title

  @maria
  Scenario:  health guide check functionality ( Managing health)
    When I click Understanding managing Health
    Then I verify "Understanding Health Care | Aetna"  the Title