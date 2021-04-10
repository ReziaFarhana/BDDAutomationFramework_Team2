Feature: TDBank SiteMap

  Background:
    Given I am on TDBank Homepage2
    And I click on SiteMap


  Scenario: Check TDBank Sitemap Student Banking Functionality
    When I click on Student Banking
    Then I Verify "Student Checking & Other Services" in Student Banking displays


  Scenario: Check on TDBank Foreign Currency Functionality
    Then I click on Travel Tips
    And I click on Order foreign currency
    Then I enter amount in currency calculator
    When I click on Start My Order
    Then  I verify my Order is added to shopping cart

#      Scenario:







