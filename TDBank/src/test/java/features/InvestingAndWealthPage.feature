Feature: Check the Investing And Wealth Page

  Background:
    Given I am on the TD Bank homePage
    When I close the Ads Choices & Personalization popUp
    Then I click on the Investing And Wealth Tab

  Scenario: Verify the Preserve Your wealth Page
    And I hover over the Financial Goals link and I select Preserve Your Wealth option
    Then I should see the page title as "How To Preserve & Grow Your Wealth For Generations | TD Wealth"

  Scenario: Verify Our Process on the Investment Management Page
    And I hover over the Financial Goals link and I select Preserve Your Wealth option
    And I click on the Investment Management Find out more link
    When I click on Our Process
    Then I should see "Our investment management process" title

  Scenario Outline: Check the functionality of the Find a Store or An Atm Near You SearchBox
    And I click on the Individuals and Families icon
    And I click the Find a TD Bank Button
    When I enter "<state>" in the searchBox and hit enter
    Then I verify "<expectedState>" properly appeared below the searchBox
    Examples:
      | state          | expectedState |
      | New Jersey,USA | NJ            |
      | New York,USA   | New York, NY  |
      | Delware,USA    | DE            |

  Scenario: Navigate to Payment Solutions tab in the Private Banking page
    And I click on the Business Owners icon
    And I click on the Private Banking Link
    When I click on the Payment Solutions Tab
    Then I should see "Payment solutions" as the title

  Scenario: Verify the functionality of the Watch video button on the Legacy and Philanthropic planning page
  And I click on the Retirement and Wealth Planning icon
    And I click on the Legacy and Philanthropic Planning link
  When I click on the Watch video button of TD wealth Planning
    And I clicked on transcript
  Then I verify "A recent report by Bloomberg shows 76% of Americans are afraid of running out of money in retirement." is the first sentence of the transcript on the video



#  Scenario Outline: TD Bank Type your question searchBox functionality check in the Investing & Wealth with valid questions
#    And I enter "<question>" in the searchBox
#    When I click on the askNow Button
#    Then I should see "<expectedQuestion>" properly appear below the searchBox
#    But I should not see "<notExpectedQuestion>" appear below the searchBox
#    Examples:
#      | question                                        | expectedQuestion                                | notExpectedQuestion                |
#      | What is SWIFT?                                  | What is SWIFT?                                  | What is a account?                 |
#      | What is Send Money with Zelle?                  | What is Send Money with Zelle?                  | How do I close my account?         |
#      | What's the purpose of adding account nicknames? | What's the purpose of adding account nicknames? | When should I use a wire transfer? |


