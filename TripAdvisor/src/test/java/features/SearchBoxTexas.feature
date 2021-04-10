Feature: SearchBox Functionality check
  Background:

    Given I am on Trip Advisor homePage
    And I enter "Texas" in search box
    When I click on search button
    When I click on Hotels tab

  #    test-1-passed
  @Farhana
  Scenario: Trip Advisor searchBox functionality check

    Then I verify "Texas Hotels" is appeared properly
#test-2-passed
  Scenario: Trip Advisor vacation test

  And I click on vacation rentals tab
  Then I verify "Texas Vacation Rentals" appeared properly

#    Test-3-passed
    @Farhana
  Scenario: Trip Advisor restaurant test

    When I click on Restaurants Tab
    And I click on Dallas Restaurant and navigate to new window
    And I click on takeout checkBox
    And I click on launch checkBox
    And I click on Maple Leaf Diner tab and navigate to new window
    Then I verify restaurant images appeared properly

#Test-4 Passed
  Scenario: check Maple Leaf Diner photo gallery
    When I click on Restaurants Tab
    And I click on Dallas Restaurant and navigate to new window
    And I click on takeout checkBox
    And I click on launch checkBox
    And I click on Maple Leaf Diner tab and navigate to new window
    And I click on all photos
    Then I verify photo gallery appeared properly
















