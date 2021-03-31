Feature:

  Background:
    Given user is on Travel Forum page



  Scenario Outline: Search Box functionality check with Valid Product
    When user clicks on searchbox
    And user enters "<Data>" in searchbox
    Then user verifies "<PageURL>" appears properly
    Examples:
      | Data     | PageURL                                          |
      | Mexico   | https://www.tripadvisor.com/SearchForums?q=Mexico   |
      | Thailand | https://www.tripadvisor.com/SearchForums?q=Thailand |
      | Japan    | https://www.tripadvisor.com/SearchForums?q=Japan    |

  @sanityTest
  Scenario: Check all Tabs in Header
    Then user gets all links from Travel Page


  Scenario:Verify Browse by Destination
    When user right clicks and opens all Browse Destination links
    Then user verifies all Page Title prints


  Scenario: Browse by Theme of Traveling with Pets
    When user clicks on Traveling with Pets
    Then user verifies "Traveling with Pets Forum" appears on page


  Scenario: Browse by Theme of Outdoors / Adventure Travel
    When user clicks on Outdoors  Adventure Travel
    Then user verifies "Outdoors / Adventure Travel Forum" appears on page


  Scenario: Browse by Theme of Road Trips
    When user clicks on Road Trips
    Then user verifies "Road Trips Forum" appears on page


  Scenario: Browse by Theme of Travel Gadgets and Gear
    When user clicks on Travel Gadgets and Gear
    Then user verifies "Travel Gadgets and Gear Forum" appears on page


  Scenario: Browse by Theme of Honeymoons and Romance
    When user clicks on Honeymoons and Romance
    Then user verifies "Honeymoons and Romance Forum" appears on page

  @regressionTest
  Scenario: Browse by Theme of Family Travel
    When user clicks on Family Travel
    Then user verifies "Family Travel Forum" appears on page

  Scenario: Browse by Theme of Bargain Travel
    When user clicks on Bargain Travel
    Then user verifies "Bargain Travel Forum" appears on page

  Scenario: Browse by Theme of Train Travel
    When user clicks on Train Travel
    Then user verifies "Train Travel Forum" appears on page

  Scenario: Browse by Theme of Air Travel
    When user clicks on Air Travel
    Then user verifies "Air Travel Forum" appears on page

  Scenario: Browse by Theme of Solo Travel
    When user clicks on Solo Travel
    Then user verifies "Solo Travel Forum" appears on page







