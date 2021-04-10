Feature: Career SearchBox Functionality Check


  Background:
    Given I am on TDBank homepage
    And I click on the Career tab


  @Test #****************Help--the search button clicks but doesnt move to the next page-error;unable to locate the
  Scenario: TDBank Job Searchbox funtionality check with valid keywords
    Then I enter "Quality Assurance" keyword in Job SearchBox
    And  I enter "New York" in the location SearchBox
    When I click on search Button
    #Then I should see "Job Search Results" Title page should display
    Then I Verify the "live Results" Text should Appear

@Test #*****Help---Hover over is not working
  Scenario:TDBank validate Retail Opportunities
    And I hover over Job Opportunities DropDown and I select Call Center Opportunities
    Then I should see Call Center Opportunities







