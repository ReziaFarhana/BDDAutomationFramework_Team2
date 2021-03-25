Feature: Check the commercial page

  Background:
    Given I am on the TD Bank homePage
    When I close the Ads Choices & Personalization popUp
    Then I click on the Commercial tab

  Scenario: Verify the commercial page
    And I hover over the Lending button and I select Commercial Lending option
    Then I verify "TD Bank Commercial & Corporate Loans, Lending & Financing" in the product title

  Scenario: Verify the functionality of the Request a call button
    And I hover over the Lending button and I select Commercial Lending option
    And I scrolled down to click on the Request a call button
    And I enter all the personal information to schedule an appointment
      | FirstName    | Akash                |
      | LastName     | Batash               |
      | BusinessName | PNT                  |
      | Phone        | 579-522-6742         |
      | Email        | akashb@iamfrombd.com |
    When I clicked on the Are you a TD customer radioButton
    Then I verify the "Schedule an Appointment" header on the page

    Scenario:




