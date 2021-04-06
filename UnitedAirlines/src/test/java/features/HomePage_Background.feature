Feature: Amazon HomePage Header

  #Background: common steps by sync way will work with your scenario

  Background:
    Given I am on United Airlines homePage

  @maria
  Scenario: United Airlines searchBox functionality check with valid research
    And I enter "Covid 19 Information" in searchBox
    When I click on search Button
    Then I should see "COVID 19 Information" is properly displaying
    But I should not see "tickets" is appear
    And I verify "Search United.Com - Find Pages on Our Website & FAQs" in product title

  @maria
  Scenario: United Airlines searchBox functionality check with valid research
    And I enter "Covid 19 Information" in searchBox
    When I click on search Button
    Then I should see "COVID 19 Information" is properly displaying
    But I should not see "tickets" is appear
    And I verify "Search United.Com - Find Pages on Our Website & FAQs" in product title

  @maria
  Scenario: United Airlines Travel Info is working properly
    And I click on Travel Info TAb
    Then I should see "Travel Info" is properly displaying
    But I should not see "Book" is appearing
    And I verify "" in product title

  @maria
  Scenario: United Airlines Book a ticket Info is working properly
    And I enter {new york} in searchBox Info TAb
    And I enter {chicago} in searchBox
    And I select a date
    And i click on find a flight
    Then I should see {trip} is properly displaying
    And i verify "United Airlines Reservations - Book a Flight on More Than 80 Airlines" the product title



