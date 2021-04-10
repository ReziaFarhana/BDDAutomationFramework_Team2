Feature: Trip Advisor flight booking functionality test
#Test-1 passed
  Background:
    Given I am on the Trip Advisor Travel Forum page


  Scenario: Check COVID-19 Policies check on flight booking

    When I click on Flights
    And I enter Where from and To field
    And I enter departure and arrival date
#     And I enter person field and close person field
     And I click on find flight button
     Then I verify "COVID-19 Policies" is displayed

  Scenario: Trip Advisor things to do in Dhaka check
    When I click on Flights
     And I enter Where from and To field
    And I enter departure and arrival date
    And I click on find flight button
    When I click on Things to Do
    And I click on Monuments & Statues
#    And I click on Shahid Minar
#    And I click on Full view
#    And I click on Gallery
   Then I verify "THE 5 BEST Dhaka City Monuments & Statues (with Photos) - Tripadvisor" is visible

  @Farhana
  Scenario: Check all Tabs in Header
    Then I gets all links from Travel Forum Page

    @Farhana
  Scenario:Verify Browse by Destination
    When user right clicks and opens all Browse Destination links
    Then user verifies all Page Title prints

      @Farhana
      Scenario: Trip Advisor find flight functionality test
        When I click on Flights
        And I click on One way tab
        And I enter "New York" Where from and "Zurich" To field
        And I enter departure date
        And I click on find flight btn
        Then I verify "Cheap flights to Zurich (ZRH) - Tripadvisor" as page Title






