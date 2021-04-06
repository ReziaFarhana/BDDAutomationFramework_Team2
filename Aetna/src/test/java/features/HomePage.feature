Feature: Homepage Tabs Check

  @maria
  Scenario: Atena shop for a plan tab is working
    Given I am Atena homePage
    And I click on shop for a plan
    Then I verify title "Health Insurance Plans | Aetna" is working

  @maria
  Scenario: Atena shop for a plan tab is working
    Given I am Atena homePage
    And I click on shop for a plan
    And I click on Medicare
    And I click on Find a doctor
    Then i will verify that the page Aetna is working properly


  @maria
  Scenario: Atena Individual tab is working
    Given I am Atena homePage
    And I click on Individual tab
    Then i will verify that the Individual tab is working properly


  @maria
  Scenario: Explore Aetna tab is working properly
    Given I am Atena homePage
    And I click on Individual tab
    Then i will verify that the Individual tab is working properly



