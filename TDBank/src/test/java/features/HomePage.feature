Feature:Check TDBank Product Functionality



  @maria
  Scenario: TDBank personal tab is displaying required information
    And I click on more about personal online banking
    When I click on enroll now
    Then I verify page title as "TD Bank Online Banking" is displaying

  @maria
  Scenario: TD Bank personal Tab displaying
    When I click on personal tab
    Then I should see we are here to help you
    And I verify "TDBank.com : personal tab" is a working tab

  @maria
  Scenario: TD Bank personal tab is displaying
    And I click on  personal tab
    And I click on checking account tab
    Then I verify " Checking & Savings Account Offers" is displaying

  @maria
  Scenario: TD Bank personal checking account is working properly
    And I click on  personal tab
    And I click on checking account tab
    Then I verify " Checking & Savings Account Offers" is displaying

  @maria
  Scenario: TDBank small business tab is displaying required information
    And I click on more about personal online banking
    When I click on enroll now
    Then I verify page title as "TD Bank Online Banking" is displaying

  @maria
  Scenario: Small business tab is working properly
    And I click on small business
    And I click on  watch the video
    Then I verify " Small Business Banking by TD Bank" is displaying properly


  @maria
  Scenario: Commercial tab is working properly
    And I click on  Commercial
    And I click on  learn more
    Then I verify " TD Bank Commercial Fraud Prevention & Control Systems" is opening properly

  @maria
  Scenario: Investing and Wealth tab is working properly
    And I click on  Investing and Wealth
    And I click on Individuals and Families
    And I click Retirement Planning
    Then I verify " Retirement Investment Planning & Account Management | TD Wealth" is  properly opening


