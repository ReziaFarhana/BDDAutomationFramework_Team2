Feature: Trip Advisor flight booking functionality test

  Background:
    Given I am on the Trip Advisor Travel Forum page
#Test-1 passed
@Farhana @Ignore
  Scenario: Check COVID-19 Policies check on flight booking

    When I click on Flights
    And I enter Where from and To field
    And I enter departure and arrival date
#     And I enter person field and close person field
     And I click on find flight button
     Then I verify "COVID-19 Policies" is displayed properly
  #Test-2 passed
@Farhana @Ignore
  Scenario: Trip Advisor things to do in Dhaka check
    When I click on Flights
     And I enter Where from and To field
    And I enter departure and arrival date
    And I click on find flight button
    When I click on Things to Do
    And I click on Monuments & Statues
#    And I click on Shahid Minar
#    And I click on Full view
#   And I click on Gallery
   Then I verify "THE 5 BEST Dhaka City Monuments & Statues (with Photos) - Tripadvisor" visible

#Test-3 passed
  @Farhana
  Scenario: Check all Tabs in Header
    Then I gets all links from Travel Forum Page
#Test-4 passed
    @Farhana
  Scenario:Verify Browse by Destination
    When I right clicks and opens all Browse Destination links
    Then I verifies all Page Title prints
#Test-5 passed
      @Farhana
      Scenario: Trip Advisor find flight functionality test
      When I click on Flights
      And I click on One way tab
      And I enter "New York" Where from and "Zurich" To field
      And I enter departure date
      And I click on find flight btn
      Then I validate "Cheap flights to Zurich (ZRH) - Tripadvisor" as page Title






