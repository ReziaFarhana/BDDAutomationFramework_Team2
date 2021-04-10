Feature: Verifying more tab inside features

  Background:
    Given I am navigated to tripadvisor Home page
    And click on the More tab from the Header
  @run
  Scenario: Verify Access my plan
    When when I clicked on Insurance link
    And I clicked on Access My Plan link
    Then I should have landed a new page "To get a quote, please enter your trip information."
  @run
  Scenario: Get a Quote for Travel Insurance
    When when I clicked on Insurance link
    And I clicked on Access My Plan link
    When I Select a State of Residence from the Choose a state box
    And I entered the Total Trip Cost
    And I Select Departure and Return Date
    When I identify an Initial Deposit Date
    And I entered the Traveler Ages
    And I clicked on Get Quote button
    Then I should have end at "This plan offers coverage for travel and medical emergencies--which can include pre-existing conditions."

#    And I selected Destination which is optional @ 17







#  Scenario: Verifying Single Trip Insurance Quote
#    And when I clicked on Insurance link
#    And I clicked on Single Tripe Get your Quote button
#    Then I should have a new window tab with a text "Single trip insurance can provide benefits for a single trip*."
#    And read iframe



