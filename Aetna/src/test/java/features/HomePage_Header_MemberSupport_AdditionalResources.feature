Feature:Check Member Support Functionality Additional Resources

  Background:

    Given I am on Aetna Home Page
    And I click on member Support
    And I hover on Additional Resources

  @maria
  Scenario: Account Management Functionality (Health insurance rights and resources)
    When I click on Health insurance rights and resources
    Then I verify "Member Rights & Resources | Aetna" is title

  @maria
  Scenario: Account Management Functionality (contact us )
    When I click on contact us
    Then I verify "Employee Portal - Applications" is a Title

  @maria
  Scenario: Account Management Functionality (Frequently asked questions)
    When I click on Frequently asked questions
    Then I verify "Health Insurance Frequently Asked Questions (FAQs) | Aetna" is displaying Title

