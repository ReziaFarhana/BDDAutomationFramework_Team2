Feature: Verify Find Medicine and Costs

  Background:
    Given I am on Aetna's home page
    When  I click on the  Member support Menu bar link
    Then  I should get a drop down option for further slection

  @run
  Scenario: Verify Find Medicine and Costs Link
    When I click on find Medicine and costs link
    Then I should have land to a page "Prescription Drug List (Formulary), Coverage & Costs - Aetna | Find a Medication"

  @run
  Scenario: verify medicare option plan in Prescription Drug List ... | Find a Medication page
    When I click on find Medicine and costs link
    And  I click on explore medicare option button
    Then I should have get medicare Aetna logo page

  @run
  Scenario Outline: Email subscription
    When I click on find Medicine and costs link
    And  I click on explore medicare option button
    When I enter "<First Name>" "<Last Name>" and "<Email Address>"
    And I click on a signUp button
    Then I should have a text response of "Thanks! Be sure to check your email for periodic u"
    Examples:
      | First Name | Last Name | Email Address |
      | Maria      | Bolton    | ma@aetna.com  |
      | Martha     | Daniel    | tha@aetna.com |
      | Caleb      | John      | ca@aetna.com  |
