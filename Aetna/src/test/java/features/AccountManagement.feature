Feature: Verifying Account management option

  Background:
    Given I am on Aetna's home page
    When  I click on the  Member support Menu bar link
    Then  I should get a drop down option for further slection
    And   I hover over on account management Link

  @run
  Scenario: Log in to your member website -- this is a dummy trial
    When I click on Log in to your member website link
    Then I should have land on a page with a text "Secure Member Log-in"

  @run
  Scenario: Find a doctor  -->
    When I click on Find a doctor link
    Then I should have land on a Find a doctor with a text "Find Doctor, Dentist or Hospital"

  @run
  Scenario: Find a pharmacy under the Find doctor link section
    When I click on Find a doctor link
    And  I click on a Find a pharmacy link
    Then I should have land on a Pharmacy Home with a text "Aetna Pharmacy Home"

  @run
  Scenario: Search Pharmacy by Location ZIP
    When I click on Find a doctor link
    And  I click on a Find a pharmacy link
    And  I select Retail Pharmacy Locations
    And  I click on a Radio button named ZIP CODE
    And  I entered a zip cod "10001"
    And  I select Distance 20 miles
    And  I select a Plan Aetna Rx Value Network
    When I click on the search box
    Then I should find a text "Aetna Rx Value Network"

  @run
  Scenario: Search Pharmacy by Location City
    When I click on Find a doctor link
    And  I click on a Find a pharmacy link
    And  I select Retail Pharmacy Locations
    And  I click on a Radio button named CITY CODE
    And  I entered a City "Alexandria"
    And  I select State
    And  I select a Plan Aetna Rx Value Network
    When I click on the search box
    Then I should find a text "Aetna Rx Value Network"

  @run
  Scenario: Search by Name using a ZIP Code
    When I click on Find a doctor link
    And  I click on a Find a pharmacy link
    And  I click on a Search by Name tab
    And  I enter the Pharmacy Name "CVS"
    And  I verify ZIP Code is selected
    And  I entered a zip cod "10001"
    And  I select Distance 30 miles
    And  I select a Plan Aetna Rx Value Network
    When I click on the search box of Search By Name tab
    Then I should find Search by Name ends with a page that has a text"Pharmacy Name:"

  @run
  Scenario: Search by Name using a City
    When I click on Find a doctor link
    And  I click on a Find a pharmacy link
    And  I click on a Search by Name tab
    And  I enter the Pharmacy Name "cvs"
    And  I click on a Radio button named CITY CODE
    And  I entered a City "Alexandria"
    And  I select State
    And  I select a Plan Aetna Rx Value Network
    When I click on the search box of Search By Name tab
    Then I should find Search by Name ends with a page that has a text"Pharmacy Name:"

  @run
  Scenario: Advance Search using a ZIP Code
    When I click on Find a doctor link
    And  I click on a Find a pharmacy link
    And  I click on a Advance Search tab
    And  I select Retail Pharmacy Locations
    And  I select a Plan Aetna Rx Value Network
    And  I click on a Radio button named ZIP CODE
    And  I entered a zip cod "10001"
    And  I select Distance 20 miles
    And  I enter the Pharmacy Name "CVS"
    When I click on the search box of Search By Name tab
    Then I should land on a page with a text "Search Settings"

  @run
  Scenario: Advance Search using a City
    When I click on Find a doctor link
    And  I click on a Find a pharmacy link
    And  I click on a Advance Search tab
    And  I select Retail Pharmacy Locations
    And  I select a Plan Aetna Rx Value Network
    And  I click on a Radio button named CITY CODE
    And  I entered a City "Alexandria"
    And  I select State
    And  I enter the Pharmacy Name "CVS"
    When I click on the search box of Search By Name tab
    Then I should land on a page with a text "Search Settings"

#  Scenario: Find medicine and costs
#
#  Scenario: Find a form
#
#  Scenario: Pay your premium

