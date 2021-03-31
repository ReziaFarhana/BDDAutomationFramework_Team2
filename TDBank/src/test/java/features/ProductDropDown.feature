Feature: Products Drop Down Functionalities


  Scenario : Check Learn More Button Functionality
    Given user is on Checking page
    When user clicks on Learn More
    Then user verifies URL is "https://www.td.com/us/en/personal-banking/checking-accounts/"

@sanity
  Scenario Outline: Search box functionality
    Given user is on Special Offers page
    When user clicks on search box
    And enters "<search data>"
    Then user verifies url is "https://www.tdbank.com/CustomerService/search-results.aspx?q=credit+"
    Examples:
      | search data |
      | credit |
      | loan |

  Scenario: Check Calculate My Rate Button functionality
    Given user am on Mortgage Page
    When user clicks on Calculate My Rate button
    And user verifies "Find a Loan" is displayed
