Feature: TDBank Services Functionality
Background:
  Given I am on the TDBank HomePage


@Test1
  Scenario:Verify Online Banking
    When I Hover over Services and click on Online Banking
      #When I click on Online Banking
    Then  I Verify TDBank "Online Banking" Text

@Test2
  Scenario:Verify Student Banking
    When I hover over Services and click on the Student Banking
    Then I Verify "Student Checking & Other Services" Text in Student Banking

@Test3
  Scenario:verify TDBank Cross Border
    When I Hover over Services and I click on the Cross Border
    Then I verify "TD Cross-Border Banking" Text In Cross Border

@Test4
  Scenario: Verify TDBank Travel Tips
    When  I hover over Services and I click on the Travel Tips
    Then I Verify TD "International Travel Tips" Text

@Test5
  Scenario:verify TDBank Foreign Services
    When I hover over Services and I Click on the Foreign Exchange Services
    Then  I Verify "Foreign Exchange Services" Text in Services

  Scenario:Verify Currency Requested is displayed
    And I hover over Services and I Click on the Foreign Exchange Services
    And I Click on the Order Online button
    And I click on the Order Currency button
    #And  I enter the Destination in the Where are you going? Text Box
    When I Enter the Amount of currency to be exchanged
    Then I Verify the "Europe (EUR)" has been updated

  @Test7 #***********not able to find messge
  Scenario:Verify Item added to cart
    And I hover over Services and I Click on the Foreign Exchange Services
    And I Click on the Order Online button
    And I click on the Order Currency button
    And  I enter the Destination in the Where are you going? Text Box
    And I Enter the Amount of currency to be exchanged
    When  I click Add To Cart Button
    Then  I verify Add in cart "The item has been successfully added to your shopping cart." message

    @Test8
  Scenario: Verify Cart updated successfully
    And I hover over Services and I Click on the Foreign Exchange Services
    And I Click on the Order Online button
    And I click on the Order Currency button
    And  I enter the Destination in the Where are you going? Text Box
    And I Enter the Amount of currency to be exchanged
    And  I click Add To Cart Button
    And I click the Cart Icon Button
    And I change The USD Amount to 1500
    When I click the Foreign Amount Box
    When I click the Update Cart Button
    Then I Verify the Message "Your Cart Has Successfully been updated"


@Test9
  Scenario:Verifying the personal information form and the Verification button
    And I hover over Services and I Click on the Foreign Exchange Services
    And I Click on the Order Online button
    And I click on the Order Currency button
    And  I enter the Destination in the Where are you going? Text Box
    And I Enter the Amount of currency to be exchanged
    And  I click Add To Cart Button
    And I click the Cart Icon Button
    And I change The USD Amount to 1500
    When I click the Foreign Amount Box
    When I click the Update Cart Button
    And I click Checkout Button
    And I Click the prefix Drop Down and I select Attorney
    And I enter First Name in the text Box
    And  I enter Last Name in the Text Box
    And I enter Email in the Text Box
    When I click the Verification Button
    Then I Verify "Personal Verification" Text Displays










