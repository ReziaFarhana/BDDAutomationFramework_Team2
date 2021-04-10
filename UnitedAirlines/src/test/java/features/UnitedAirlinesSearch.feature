Feature: United Airlines Home page Search functionality check

  Background:
    Given I am in United Airlines Homepage

  @TestExcel
  Scenario: United Airlines searchBox Functionality Check using Excel
    And I click on the search Button
    And I click on the search Button
    When I type data into search box from excel
    Then I verify "People commonly ask..." is  displayed properly

  @TestExcel
Scenario: United Airlines searchBox Functionality Check using Excel
And I click on the search Button
When I type data into search box from excel
Then I verify "People commonly ask..." is  displayed properly

@TestDB
Scenario: United Airlines searchBox Functionality Check using DataBase
And I click on the search Button
When I type data into search box from database
Then I verify "People commonly ask..." is  displayed properly
