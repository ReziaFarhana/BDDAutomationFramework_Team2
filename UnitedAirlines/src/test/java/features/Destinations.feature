Feature: working on DESTINATION DEALS

  Background:
    Given I am on United Airlines Home page
    And   I click on the DEALS option

  Scenario:   Flights to popular destinations
    When I clicked on Flights to popular destinations
    Then I should land on a new tab "United Cheap Flights to 300+ Destinations Worldwide | United Airlines"

  Scenario:   Flights to national parks
    When I click on national parks
    Then I should land on a new page with "Flights to USA National Parks - Find the Best Fare for Your Next Trip - United Airlines"

  Scenario:   Flights to San Francisco
    When I clicked on Flights to San Francisco link
    Then I should have a new windows tab with a title "Flights to San Francisco"

  Scenario:   Flights to New York Newark
    When I clicked on the Flights to New York Newark link
    Then I should be found a new page with a bread cramp end with "Flights to New York/Newark"


  Scenario:   Flights to Houston
    When I clicked on the link on Flights to Houston
    Then I should land to a new windows tab with bread cramp end with  "Flights to Houston"

  Scenario:   Flights to Chicago
    When I clicked on Flights to Chicago link
    Then I should land to a new windows tab with bread cramp end with  "Flights to Chicago"

  Scenario:   Flights to Los Angeles
    When I clicked on Flights to Los Angeles link
    Then I should land to a new windows tab with bread cramp end with  "Flights to Los Angeles"

  Scenario:   Flights to Orlando
    When I clicked on Flights to Orlando link
    Then I should land to a new windows tab with bread cramp end with  "Flights to Orlando"


