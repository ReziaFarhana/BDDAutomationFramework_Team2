Feature: Home Page Header Functionality

  Background:

    Given I am on Trip Advisor Home Page
    And I click on more


  Scenario: verify More Functionality (Add Place)
    And I click on add a place
    Then I verify that the title "List a Business on Tripadvisor" displaying properly


  Scenario: verify More Functionality (Airline)
    And I click on Airline
    Then I verify that the title "Browse all Airlines and Airline Reviews - Tripadvisor" title


  Scenario: verify More Functionality (Flights)
    And I click on Flights
    Then I verify the title "Cheap Flights from Boston, MA - from $43 - Tripadvisor" title


  Scenario: verify More Functionality (Cruises)
    And I click on Cruises
    Then I verify the title "Cruises - Cruise Vacations: 2021 Destinations & Ports | CHEAP Cruises - Tripadvisor"


  Scenario: verify More Functionality (Trip Advisor)
    And I click on Hire a Trip
    Then I verify the title "Reco Trip Designers | A new kind of travel agent experience from Tripadvisor" is displaying

  Scenario: verify More Functionality (Insurance)
    And I click on Insurance
    Then I verify the title "https://beta.subs.tripadvisor.com/insurance/" a title

  Scenario: verify More Functionality (Rental cars)
    And I click on rental cars
    Then I verify title "https://beta.subs.tripadvisor.com/insurance/" a title

  Scenario: verify More Functionality (Road Trip)
    And I click on road Trip
    Then I verify title "Book Cheap Rental Cars & Search Car Rental Deals - Tripadvisor" is a title

  Scenario: verify More Functionality (Travel Choice)
    And I click on road Travel Choice
    Then I verify title "Travelers' Choice - Tripadvisor - Best Airlines, Beaches, Family Vacations, Hotels & Destinations" is displaying

 Scenario: verify More Functionality (vacation Packaging)
    And I click on vacation Packaging
    Then I verify title "Vacation Packages & Deals 2021: Holidays & Vacations on Tripadvisor" is displaying

