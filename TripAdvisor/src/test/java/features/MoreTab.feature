Feature: Verifying More Tab of TripAdvisor Home page https://www.tripadvisor.com/

  Background:
    Given I am navigated to tripadvisor Home page
    And click on the More tab from the Header

  @run
  Scenario: verify click on Add a Place Link
    And  I clicked on Add a Place
    Then I should have seen a text "Add a place to Tripadvisor"

  @run
  Scenario: verify click on Airlines Link
    And I clicked on Airlines link
    Then I should have a new Airlines page with a text "Airlines"

  @run
  Scenario: verify click on Cruises Link
    And I clicked on Cruises link
    Then I should have a new Cruises page with a text "Cruises - Cruise Vacations: 2021 Destinations & Ports | CHEAP Cruises - Tripadvisor"

  @run
  Scenario: verify click on Flights Link
    And I clicked on Flights link
    Then I should have a new Flights page with a text "Cheap Flights from Boston, MA - from $153 - Tripadvisor"

  @run
  Scenario: verify click on Car Rental Link
    And I clicked on Rental Cars link
    Then I should have a new Rental Cars page with a text "Book Cheap Rental Cars & Search Car Rental Deals - Tripadvisor"

  @run
  Scenario: verify click on Hire a Trip Designer Link
    And I clicked on Hire a Trip Designer link
    Then I should have a new Hire a Trip Designer page with a text "Reco Trip Designers | A new kind of travel agent experience from Tripadvisor"




    # Add a Place
    #Airlines
    #Cruises
    #Flights
    #Help Center
    #Hire a Trip Designer
    #Insurance
    #Rental Cars
    #Road Trips
    #Travelers' Choice
    #Vacation Packages  #