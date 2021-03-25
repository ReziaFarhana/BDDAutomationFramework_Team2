Feature: Test United Airlines deals features on https://www.united.com/en/us/

  Scenario: Current offers and promos
    Given I am on United Airlines Home page
    And   I click on the DEALS option
    Then  I should see the OFFERS option