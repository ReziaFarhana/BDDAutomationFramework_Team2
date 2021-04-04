Feature: SearchBox Functionality check

  @maria
  Scenario: TD Bank personal Tab Working
    Given I am on  TDBank homePage
    When I click on personal tab
    Then I should see we are here to help you
    And I verify "TDBank.com : personal tab" is a working tab

  @maria
  Scenario: TD Bank personal checking account is working properly
    Given I am on  TDBank homePage
    And I click on  personal tab
  And I click on checking account tab
  Then I should see TD Bank open a TDBank checking account display properly
   And I verify " TDBank.com: checking account is displaying " is displaying

#   @IntegrationTest
#  Scenario: Amazon searchBox functionality check with valid product2
#    Given I am on amazon homePage
#    And I enter "MacBook" in searchBox
#    When I click on search Button
#    Then I should see "MacBook" is properly appear
#    But I should not see "mobile" is appear
#    And I verify "Amazon.com : MacBook" in product title
#
#  @test
#  Scenario Outline: Amazon searchBox functionality check with valid product3
#    Given I am on amazon homePage
#    And I enter "<productName>" in searchBox
#    When I click on search Button
#    Then I should see "<ExpectedProduct>" is properly appear
#    But I should not see "<notExpected>" is appear
#    And I verify "<verifyTitle>" in product title
#    Examples:
#      | productName    | ExpectedProduct | notExpected | verifyTitle                 |
#      | Hand Sanitizer | Hand Sanitizer  | mobile      | Amazon.com : Hand Sanitizer |
#      | Mask           | Mask            | mobile      | Amazon.com : Mask           |
#      | MacBook        | MacBook         | mobile      | Amazon.com : MacBook        |
#
#
#
#
#
#
#
#
#






