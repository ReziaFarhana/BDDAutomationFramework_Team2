Feature: SearchBox Functionality check
  Background:

    Given I am on Trip Advisor homePage
    And I enter "Texas" in search box
    When I click on search button
    When I click on Hotels tab

  #    test-8-passed
  @Farhana
  Scenario: Trip Advisor searchBox functionality check

    Then I verify "Texas Hotels" properly appeared
#test-9-passed
  Scenario: Trip Advisor vacation test

  And I click on vacation rentals tab
  Then I verify "Texas Vacation Rentals" appeared

#    Test-10-passed
    @Farhana
  Scenario: Trip Advisor restaurant test

    When I click on Restaurants Tab
    And I click on Dallas Restaurant and navigate to new window
    And I click on takeout checkBox
    And I click on launch checkBox
    And I click on Maple Leaf Diner tab and navigate to new window
    Then I verify restaurant images is displayed

#Test-11 Passed
  Scenario: check Maple Leaf Diner photo gallery
    When I click on Restaurants Tab
    And I click on Dallas Restaurant and navigate to new window
    And I click on takeout checkBox
    And I click on launch checkBox
    And I click on Maple Leaf Diner tab and navigate to new window
    And I click on all photos
    Then I validate photo gallery visible
















