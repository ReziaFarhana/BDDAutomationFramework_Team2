Feature:

  Background:
    Given user is on Travel Forum page


  @smokeTest
  Scenario Outline: Search Box functionality check with Valid Product
    When user clicks on searchbox
    And user enters "<Data>" in searchbox
    Then user should see "<ExpectedText>" appear properly
    Examples:
      | Data     | ExpectedText |
      | Mexico   | Mexico       |
      | Thailand | Thailand     |
      | Japan    | Japan        |

    @sanityTest
  Scenario: Check all Tabs in Header
    Then user gets all links from Travel Page


