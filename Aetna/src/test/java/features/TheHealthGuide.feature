Feature: Working on The Health Guide Tab

  Background:
    Given I am on Aetna's home page
    When  I click on the  Member support Menu bar link
    Then  I should get a drop down option for further slection
  @run
  Scenario: To verify the All health resources  Link
    And I hover on The Health Guide Option and click on All health resources
    Then I should land on a new page with a Title "Your good health starts here"
  @run
  Scenario: verify HMO vs POS and more is selected
    When I hover on The Health Guide Option and click on All health resources
    And I click on HMO vs POS and more
    Then I should see the corresponding "HMO, POS, PPO, HDHP: Explained"
  @run
  Scenario: verify Helping families is selected
    When I hover on The Health Guide Option and click on All health resources
    And  I click on Helping families
    Then I should see the corresponding helping families text "Neighborhood health story"

@run
  Scenario: verify Healthy school year is selected
    When I hover on The Health Guide Option and click on All health resources
    And  I click on Healthy school year
    Then I should see the corresponding Healthy school year text "5 tips for a healthy school year"


