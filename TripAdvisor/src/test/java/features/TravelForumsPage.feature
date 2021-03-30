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

  @smokeTest
  Scenario:Verify Browse by Destination
    When user right clicks and opens all Browse Destination links
    Then user verifies all Page Title prints





