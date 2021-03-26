Feature: Working on United Airlines OFFERS section under Deals

  Background:
    Given I am on United Airlines Home page
    And   I click on the DEALS option

  Scenario: Current offers and promos
    And I click on the Current offers and promos link
    Then I should see Deals & offers on the front page

  Scenario: MileagePlus news and offers
    And I click on MileagePlus news and offers link
    Then I should see MileagePlus deals & offers on the front page

  Scenario: Discounts for 18 to 22 year olds
    When I click on Discounts for 18 to 22 year olds link
    Then I should see Discounts for 18 to 22 year olds on the front page

  Scenario: Veterans Advantage discount
    And I click on Veterans Advantage discount link
    Then I should see Veterans Advantage discount on the front page

  Scenario: Redeem eCertificate
    And I clicked On Redeem eCertificate link
    Then I should see Redeem eCertificate displayed on the front page

  Scenario: Getting Electronic travel certificate Under Redeem eCert
    When I clicked On Redeem eCertificate link
    And scroll to Electronic travel certificate Section
    And Select Year "2019" Under Year Issued
    And entered "1234567891" in PIN Options
    And enter "Selam" in the last name field
    When I clicked on confirm button
    Then I should have get "Please make sure you entered valid information." in return




