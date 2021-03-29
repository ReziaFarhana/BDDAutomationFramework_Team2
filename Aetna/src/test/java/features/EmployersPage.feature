Feature: Employers Page Header Functionality

  Scenario: Toggle Drop Down Menu
    Given user is on employers page
    When user clicks on Explore Aetna Sites
    And user clicks on About Us
    Then user verify "Wherever you are" appears properly
