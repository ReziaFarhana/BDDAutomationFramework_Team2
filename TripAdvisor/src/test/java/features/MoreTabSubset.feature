Feature: Verifying more tab inside features

  Background:
    Given I am navigated to tripadvisor Home page
    And click on the More tab from the Header

  Scenario: Search for Cruise
#    Given I clicked on Cruises link
#    And I clicked on Where to? box and select
    And I Clicked on Departure Month and select May 2021
    When I clicked on Search box
    Then I should see



#    Scenario: Add a place to Tripadvisor
#      And  I clicked on Add a Place
#      And I entered Official place name "Virginia"
#      When I Select a Category Hotel
#      And I entered a Country "United States"
#      And I entered a City "Fairfax, Virginia"
#      And I entered a Street Address " 11191 Waples Mill Road"
#      When I clicked on a submit buttonksl
#      Then I should get a "Does everything look correct?" windows
#      And when I clicked on Yes, confirm button
#      Then "Sign in to unlock the best of Tripadvisor." should appear
#      When I click the close button