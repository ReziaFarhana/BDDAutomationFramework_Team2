Feature: Online Banking Page features
  Background:
    Given I am on the TD Bank homePage
    And I see the TD Bank logo
    When I close the Ads Choices & Personalization popUp

#  passed-1
  @Test @Farhana @Ignore

  Scenario: Verify TD Bank Online Banking page

    When I clicks on the Login button under Online Banking
    Then I can see the Online Banking Log In page is displayed

#   passed-2
  @Test @Farhana @Ignore
  Scenario: Verify Small Business Online Banking

    When I hover over the services button and I click Online Banking option
    And I click on Learn more about Small Business Online Banking.
    Then I verify "Small Business Online Banking" is appeared

#  passed-3
  @Test @Farhana @Ignore
  Scenario: Verify Enroll in Online Banking

    When I hover over the services button and I click Online Banking option
    And I scroll down and I click on Enroll now
    And I cancel the questions On Stimulus Payments Pop up
    Then I verify "Online Banking Enrollment" window pop up
# passed-4
  @Farhana @Ignore
  Scenario: Verify the Student Banking page

    When I hover over the services button and I select Student Banking option
    Then I verify "Smart and simple student banking" is displayed

#  passed-3
  @Farhana @Ignore
  Scenario: TD Bank find us Box check
  When I click Find Us icon
  And I enter "10463" and I click on search icon
  Then I validate TD Bank locations appeared

#  passed-4
  @Test @Ignore
  Scenario: Get Direction Button check
    When I take necessary steps and landed on locations page
    And I click on Get Direction Button
    Then I validate google map page Title

#  passed-5
  @Test @Ignore
  Scenario: TD Bank signUp functionality check
    When I click on Sign Up button
    And I cancel the questions On Stimulus Payments Pop up
    And I do necessary steps to land on User info page
    And I select account type
    And I enter user information
      | firstName | lastName | email         | atmNumber         | SSN        | accountNumber  | userName     | reEnterUserName | password   | reEnterPassword  |
      | Rezia     | Farhana  | fk@gmail.com  | 3334567890876543  | 553456789  | 3334526273848  | fk_30294     | fk_30294        | test@30294 | test@30294       |
    And I check Yes From Bill Pay Option
    And I select Paper less Option
    And I click on continue button
    Then I should see "The information you gave doesn't match our records. Please review and make any updates before proceeding." is properly appear
#  passed-6
    @test @Ignore
    Scenario Outline: TD Bank login functionality check with invalid credentials
      When I click on logIn button in homePage
      And I click not now on the questions on Stimulus Payments Pop up
      And I enter "<userName>" and "<password>"
      And I click on login
      Then I validate "error" message
      Examples:
        | userName   | password   |
        | 30294NY_fk | test@30294 |
        | 30021NY_RF | pxyz@1234  |
        | 12345NY_HC | trump@2020 |

#  passed-7
      When I click on product
      And I click on checking
      Then I validate "Checking comes jam-packed with perks — and a bonus" displayed



