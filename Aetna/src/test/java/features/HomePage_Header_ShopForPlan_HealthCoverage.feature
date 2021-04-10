Feature: Check shop for plan functionality(Health Coverage)

  Background:

    Given I m on Aetna homePage
    And I click on shop for plan
    And I hover on health coverage


 Scenario:  health coverage check functionality  (Plans through an employer )
  When I click on Plans through an employer
    Then I should see Health insurance through work


  Scenario:  health coverage check functionality  (International plans )
    When I click on International plans
    Then I verify "International Health Insurance | Aetna International" as Title


  Scenario:  health coverage check functionality  (Find a Doctor)
    When I click on Find a Doctor
    Then I verify  Find Doctor, Dentist or Hospital


  Scenario:  health coverage check functionality  (Student plans )
    When I click on Student plans
    Then I verify "Home | Aetna Student Health" as Title

