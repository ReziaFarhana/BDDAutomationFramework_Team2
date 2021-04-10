Feature: TDBank Search Box Functionality

#********************HELP
  Scenario Outline: TDBank Check SearchBox Function With Valid Services
    Given I am on TDBank HomePage
    And I click on TDBank SearchBox
    When I enter "<products>" in searchBox and click enter
    And I verify "<ProductText>" Product Text

    Examples:
      | products     | ProductText                         |
      | Checking     | Welcome to TD Bank Personal Banking |
      | Savings      | Welcome to TD Bank Personal Banking |
      | CDs          | Welcome to TD Bank Personal Banking |
      | Credit Cards | Welcome to TD Bank Personal Banking |