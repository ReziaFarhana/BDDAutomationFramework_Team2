Feature: United Airlines Home page Search functionality check

  Background:
    Given I am in United Airlines Homepage
# passed-7
  @TestExcel
  Scenario: United Airlines searchBox Functionality Check using Excel
    And I click on the search Button
    When I type data into search box from excel
    Then I verify "People commonly ask..." is  displayed properly

# passed-8
  @TestExcel
  Scenario: United Airlines searchBox Functionality Check-2 using Excel
  And I click on the search Button
  When I type data into search box from excel
  And I click on the search Button
  Then I verify "People commonly ask..." is  displayed properly

# passed-9

@TestDB
Scenario: United Airlines searchBox Functionality Check using DataBase
And I click on the search Button
When I type data into search box from database
Then I verify "People commonly ask..." is  displayed properly
