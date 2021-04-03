Feature: working on DESTINATION DEALS

  Background:
    Given I am on United Airlines Home page
    And   I click on the DEALS option

  @run
  Scenario:   Flights to popular destinations
    When I clicked on Flights to popular destinations
    Then I should land on a new tab "United Cheap Flights to 300+ Destinations Worldwide | United Airlines"

  @run
  Scenario:   Flights to national parks
    When I click on national parks
    Then I should land on a new page with "Flights to USA National Parks - Find the Best Fare for Your Next Trip - United Airlines"

  @run
  Scenario:   Flights to San Francisco
    When I clicked on Flights to San Francisco link
    Then I should have a new windows tab with a title "Flights to San Francisco"

  @run
  Scenario:   Flights to New York Newark
    When I clicked on the Flights to New York Newark link
    Then I should be found a new page with a bread cramp end with "Flights to New York/Newark"

  @run
  Scenario:   Flights to Houston
    When I clicked on the link on Flights to Houston
    Then I should land to a new windows tab with bread cramp end with  "Flights to Houston"

  @run
  Scenario:   Flights to Chicago
    When I clicked on Flights to Chicago link
    Then I should land to a new windows tab with bread cramp end with  "Flights to Chicago"

  @run
  Scenario:   Flights to Los Angeles
    When I clicked on Flights to Los Angeles link
    Then I should land to a new windows tab with bread cramp end with  "Flights to Los Angeles"

  @run
  Scenario:   Flights to Orlando
    When I clicked on Flights to Orlando link
    Then I should land to a new windows tab with bread cramp end with  "Flights to Orlando"

  @run
  Scenario: Book a Roundtrip flight with a promotion code
    When I clicked on Flights to Orlando link
    Then I should land to a new windows tab with bread cramp end with  "Flights to Orlando"
    When I enter a departure city and destination city
      | From | To  |
      | JFK  | SFO |
    And I selected the departure and return dates
    And I selected travel info class of travel and number of travelers
    When I entered the promotion code "1239865721"
    And I click on the Search Flights button
    Then I should see a text "We could not process your request. Please see the message below and make revisions."

  @run
  Scenario: Book a Roundtrip flight without a promotion code
    When I clicked on Flights to Orlando link
    Then I should land to a new windows tab with bread cramp end with  "Flights to Orlando"
    When I enter a departure city and destination city
      | From | To  |
      | JFK  | SFO |
    And I selected the departure and return dates
    And I selected travel info class of travel and number of travelers
    And I click on the Search Flights button
    Then I should land on a page displays a text "We could not process your request. Please see the message below and make revisions."

  @run
  Scenario: Book a Roundtrip flight with a mile and no promotion code
    When I clicked on Flights to popular destinations
    Then I should land on a new tab "United Cheap Flights to 300+ Destinations Worldwide | United Airlines"
    When I clicked on Book with miles checklist
    And I enter a departure city and destination city
      | From | To  |
      | JFK  | SFO |
    And I selected the departure and return dates
    And I selected travel info class of travel and number of travelers
    And I click on the Search Flights button
    Then I should expect to see the text "Sign in to your MileagePlus account to show the best award availability"

  @run
  Scenario: Changed bag rules
    When I clicked on Flights to popular destinations
    Then I should land on a new tab "United Cheap Flights to 300+ Destinations Worldwide | United Airlines"
    And clicked on Changed bag rules Link
    Then I should have a new page with a text "Changed bag rules and optional services"

  @pending
  Scenario: How much will it cost to check my bag?
    When I clicked on Flights to popular destinations
    Then I should land on a new tab "United Cheap Flights to 300+ Destinations Worldwide | United Airlines"
    And clicked on Changed bag rules Link
    Then I should have a new page with a text "Changed bag rules and optional services"
    And I clicked on Any Flights Tab
    And Update the From and To box with cities
      | From | New York      |
      | To   | Washington DC |
    Then I should have same page updated and a text "Standard checked bag price" will be displayed








