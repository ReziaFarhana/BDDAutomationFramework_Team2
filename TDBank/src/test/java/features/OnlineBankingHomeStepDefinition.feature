Feature: Verify TDBank Online services

  @run
  Scenario: accessing Online Banking From the Service Header Option
    Given I am navigated to TDBank Home page TDBank
    And I clicked on Services link
    And I locate and clicked on Online Banking
    Then I should land on a new Online Banking page "Online Banking"

  @run
  Scenario: accessing Online Banking From the Log In Option
    Given I am navigated to TDBank Home page TDBank
    And I clicked on the Log In Header Option 
    And I locate and clicked on Online Banking under Login
    Then I should land on a new Online Banking windows tab "Welcome to Online Banking"