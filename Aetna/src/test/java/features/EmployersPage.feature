Feature: Employers Page Header Functionality

  Background:
    Given user is on employers page
#
#
#  Scenario: Toggle Drop Down Menu
#    When user clicks on Explore Aetna Sites
#    And user clicks on About Us
#    Then user verify "Wherever you are" appears properly
#
#
#  Scenario:Products and Services Options Checking All Health Plans
#    Then user clicks on Products and services
#    And user hovers over Health Plans
#    And user clicks All Health Plans
#    Then user verifies page title is "Group Medical, Medicare & Ancillary Insurance Plans | Aetna"

@monkeyTest
  Scenario:Products and Services Options Checking Medicare
    And user clicks on Products and services
    And user hovers over Health Plans
    When user clicks All Medicare
    Then user verifies page title is "Group Health Medicare Plans for Retirees from Aetna | Insurance Coverage & Benefits"

