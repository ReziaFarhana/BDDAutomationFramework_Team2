#Feature: Online Banking Page features
#  Background:
#    Given I am on the TD Bank homePage
#    And I see the TD Bank logo
#    When I close the Ads Choices & Personalization popUp
#
##  passed-8
#  @Test @Farhana
#
#  Scenario: Verify TD Bank Online Banking page
#
#    When I clicks on the Login button under Online Banking
#    Then I can see the Online Banking Log In page is displayed
#
##  passed-9
#  @Test @Farhana
#  Scenario: Verify Small Business Online Banking
#
#    When I hover over the services button and I click Online Banking option
#    And I click on Learn more about Small Business Online Banking.
#    Then I verify "Small Business Online Banking" is appeared
#
##  passed-10
#  @Test @Farhana
#  Scenario: Verify Enroll in Online Banking
#
#    When I hover over the services button and I click Online Banking option
#    And I scroll down and I click on Enroll now
#    And I cancel the Ads Choices & Personalization popUp
#    Then I verify "Online Banking Enrollment" window pop up
#
##  passed-11
#  @Farhana
#  Scenario: Verify the Student Banking page
#
#    When I hover over the services button and I select Student Banking option
#    Then I verify "Smart and simple student banking" is displayed
#
##  passed-12
#  Scenario: TD Bank Find us Box functionality check
#    When I click FindUs Icon
#    And I enter "10463" and click on searchIcon
#    Then I validate TD bank locations appeared
#
##  passed-13
#  @Test
#  Scenario: Get Direction Button check
#    When I take necessary steps and landed on locations page
#    And I click on Get Direction Button
#    Then I validate google map page Title
#
#
##  passed-14
#  @Test
#  Scenario: TD Bank signUp functionality check
#    When I click on signUp button
#    And I do necessary steps to land on User info page
#    And I select account type
#    And I enter user information
#      | firstName | lastName | email                  | atmNumber         | SSN        | accountNumber  | userName     | reEnterUserName | password   | reEnterPassword  |
#      | Rezia      | Farhana  | 30294NY_fk@gmail.com  | 3334567890876543  | 553456789  | 3334526273848  | 30294NY_fk   | 30294NY_fk      | test@30294 | test@30294       |
#    And I click on continue button
#    Then I validate signUp message
##  passed-15
#    @test
#    Scenario Outline: TD Bank login functionality check with invalid credentials
#      When I click on logIn button in homePage
#      And I enter "<userName>" and "<password>"
#      And I click on login
#      Then I validate the error message
#      Examples:
#        | userName   | password   |
#        | 30294NY_fk | test@30294 |
#        | 30294_FK   | test2@1234 |
#        | RFK123     | test12345  |
#
##  passed-16
#      When I click on product
#      And I click on checking
#      Then I validate "Checking comes jam-packed with perks — and a bonus" displayed
#
#
