Feature: United Airlines Home page functionality check

  Background:
    Given I am in United Airlines home page
# passed-1
  @Test
  Scenario: Flight status functionality test
    When I click on flight status tab
    And I enter "New York" from field and "Dhaka" To field field
    And I enter I enter "DHK 1234" in Flight number and "April 10, 2021" in date field
    And I click search box
    Then I verify DEPARTURE is properly appeared


# passed-2
  @Test @Ignore
  Scenario:United Airlines flight status functionality test
    When I click on CheckIn tab
    And I enter ticket number in confirmation field
    And I enter last name in Last name field
    And I click search box
    Then I verify "We couldn't find a reservation with the provided information" appear

# passed-3
  @Test @Ignore
  Scenario:United Airlines flight status functionality test
    When I click on My trips tab
    And I enter invalid "confirmation number" in confirmation field
    And I type last name in Last name field
    And I click search box tab
    Then I verify search button is not enabled

# passed-4
  @Test @Ignore
  Scenario:United Airlines search button functionality test
    When I click on search button
    And I click on "covid-19" update
    And I click on request a refund
    Then I validate Refund policies is appeared properly
# passed-5
  @Test @Ignore
  Scenario:United Airlines search button functionality test
    When I click on search button
    And I click on get a flight receipt
#    And I enter traveler first name
#    And I enter traveler last name
#    And I enter Last 4 digits of card
    And I click searchButton box
    Then I validate We couldn't find your receipt is appeared properly

# passed-6
  @Test @Ignore
  Scenario: United Airlines Book Button Check
    When I click on Book Button
    And I click on Hotels Button
    And I enter "Miami Beach" in where to search box and submit
    Then I validate Miami Beach landing properly

