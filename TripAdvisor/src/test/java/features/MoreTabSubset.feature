Feature: Verifying more tab inside features

  Background:
    Given I am navigated to tripadvisor Home page
    And click on the More tab from the Header

    Scenario: Verify Access my plan
      When when I clicked on Insurance link
      And I clickec on Acccess My Plan link
      Then I should have landed a new page "Travel Insurance - Allianz Global Assistance"







#  Scenario: Verifying Single Trip Insurance Quote
#    And when I clicked on Insurance link
#    And I clicked on Single Tripe Get your Quote button
#    Then I should have a new window tab with a text "Single trip insurance can provide benefits for a single trip*."
#    And read iframe



