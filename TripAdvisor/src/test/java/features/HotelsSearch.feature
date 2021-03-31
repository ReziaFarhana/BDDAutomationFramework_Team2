Feature: Check the Hotels search page

  Background:
    Given I am on the Trip Advisor homepage
    And I click on Hotels
    When I click on  "California, United States" in the whereTo searchBox and hit enter


  Scenario: Check the functionality of CheckIn and CheckOut of the hotel
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    When I click update without changing the default Guests informations on the Guests box
    Then I verify the page title as "THE 10 BEST Hotels in California for 2021 (with Prices) - Tripadvisor"
