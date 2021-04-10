Feature: Working on United Airlines OFFERS section under Deals

  Background:
    Given I am on United Airlines Home page
    And   I click on the DEALS option

  @run
  Scenario: Current offers and promos
    And I click on the Current offers and promos link
    Then I should see Deals & offers on the front page

  @run
  Scenario: MileagePlus news and offers
    And I click on MileagePlus news and offers link
    Then I should see MileagePlus deals & offers on the front page

  @run
  Scenario: Discounts for 18 to 22 year olds
    When I click on Discounts for 18 to 22 year olds link
    Then I should see Discounts for 18 to 22 year olds on the front page

  @run
  Scenario: Veterans Advantage discount
    And I click on Veterans Advantage discount link
    Then I should see Veterans Advantage discount on the front page

  @run
  Scenario: Redeem eCertificate
    And I clicked On Redeem eCertificate link
    Then I should see Redeem eCertificate displayed on the front page

  @run
  Scenario: Getting Electronic travel certificate Under Redeem eCert
    When I clicked On Redeem eCertificate link
    And scroll to Electronic travel certificate Section
    And Select Year "2019" Under Year Issued
    And entered "1234567891" in PIN Options
    And enter "Selam" in the last name field
    When I clicked on confirm button
    Then I should have get "Please make sure you entered valid information." in return

    @run
    Scenario: Electronic travel certificate Look up
      And I clicked On Redeem eCertificate link
      And I Selected the Year issued "2019"
      And I entered the an invalid Pin "2356987542"
      And I entered unanimous  Recipient's last name "David"
      When I clicked on the confirm button
      Then I should have get a response "Please make sure you entered valid information."



