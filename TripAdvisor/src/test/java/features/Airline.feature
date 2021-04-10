Feature: Verifying the feature of Airlines Link

  Background:
#    Given I am navigated to tripadvisor Home page
#    And click on the More tab from the Header
#    And I clicked on Airlines link

  @run
  Scenario Outline:  Searching multiple airlines
    When I enter the airlines name "<Airlines>"
    Then I should found a some "<Information>" of the airlines in search
    Examples:
      | Airlines     | Information               |
      | Ethiopian    | Ethiopian Airlines        |
      | American     | American Airlines         |
      | United       | United Airlines           |
      | Bangladesh   | Biman Bangladesh Airlines |
      | Lufthansa    | Lufthansa                 |
      | British      | British Airways           |
      | South Africa | South African Airways     |

  Scenario: Verifying Flights Link
    And I clicked on Flights Link from the Header Menu
    Then I should have landed on "Find the best flight for the right price" new page

  Scenario: Book a flight using Flight page
    When I clicked on Flights Link from the Header Menu
    And   I entered the City "Addis Ababa" in the From Edit box
    And   I entered the City "New York City" int To where? Edit box
    *     I selected the Departure and Return date form the given calender
    *     I clicked on th Find Flights button
    Then  I should have "popp"
