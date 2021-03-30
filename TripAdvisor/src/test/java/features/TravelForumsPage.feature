Feature:

  Background:
    Given user is on Travel Forum page

#   Scenario: Search Box functionality check with Valid Product
#     When user clicks on searchbox
#     And user enters "Mexico" in searchbox
#     Then user should see "Mexico" appear properly
#
#  Scenario: Search Box functionality check with Valid Product
#    When user clicks on searchbox
#    And user enters "Thailand" in searchbox
#    Then user should see <"Thailand"> appear properly
#
#  Scenario: Search Box functionality check with Valid Product
#    When user clicks on searchbox
#    And user enters "Japan" in searchbox
#    Then user should see "Japan" appear properly

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


