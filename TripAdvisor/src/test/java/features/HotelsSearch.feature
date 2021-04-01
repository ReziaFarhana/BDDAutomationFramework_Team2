Feature: Check the Hotels search page

  Background:
    Given I am on the Trip Advisor homepage
    And I click on Hotels

  Scenario: Check the hotels search page
    And I click on the whereTo searchBox
    When I select Los Angeles from the popular destinations suggestion
    Then I verify the title "Los Angeles Hotels"


  Scenario: Check the functionality of CheckIn and CheckOut of the hotel
    And I click on the whereTo searchBox
    When I select Los Angeles from the popular destinations suggestion
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    When I click update on the Guests box
    Then I verify the page title as "THE 10 BEST Hotels in Los Angeles, CA for 2021 (from $52) - Tripadvisor"

  Scenario: Check the functionality of the sort by option
    And I click on the whereTo searchBox
    When I select Los Angeles from the popular destinations suggestion
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    And I click update on the Guests box


  Scenario: Filter the price from 0 to 300
    And I click on the whereTo searchBox
    When I select Los Angeles from the popular destinations suggestion
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    And I click update on the Guests box
    When I filter the price by xdataOffset 40 and ydataOffset 0
    Then I verify the price "$195 - $294 +"

  Scenario: Update the Guests section to 3 Rooms and 5 adults
    And I click on the whereTo searchBox
    When I select Los Angeles from the popular destinations suggestion
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    And I click on the plus sign to add 3 Rooms
    And I click on the plus sign to add 5 Adults
    When I click update on the Guests box
    Then I should see "3 rooms" in the guestsBox
    And I should also see "5 adults" in the guestBox

  Scenario: Update the Children count on the guest section to 2
    And I click on the whereTo searchBox
    When I select Los Angeles from the popular destinations suggestion
    And I click on the checkIn box
    And I click on the right angle bracket on the calendar to go next and I select a date
    And I select a checkOut date
    And I click on the plus sign to add 3 Rooms
    And I click on the plus sign to add 5 Adults
    And I click on the plus sign to add 3 Children
    And I select 3 on the Age dropdown for the first child
    And I select 8 on the age dropdown for the second child
    When I click update on the Guests box
    Then I should see "2 children"




