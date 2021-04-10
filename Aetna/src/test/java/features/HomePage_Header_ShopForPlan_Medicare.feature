Feature: Check shop for plan functionality(Medicare)

Background:

  Given I m on Aetna homePage
  And I click on shop for plan
  And I hover on medicare

Scenario:  Medicare check functionality  (Find a Doctor)
  When I click on find doctor
  Then I should see Find Aetna Medicare Health Care Professionals


Scenario:  Medicare check functionality (Browse Aetna medicare plan)
  When I click on Browse Aetna medicare plan
  Then I verify "Medicare Plans - Medicare Advantage, Part D, and Supplement Plans | Aetna Medicare" as Title


  Scenario:  Medicare check functionality (Check our drug list )
    When I click on Check our drug list
    Then I verify "Check Our Medicare Covered Drug List | Aetna Medicare" as Title


  Scenario:  Medicare check functionality (Understand Medicare )
    When I click on Understand Medicare
    Then I verify "Understanding Medicare - What You Need To Know | Aetna Medicare" as Title

 @yasmina
  Scenario:  Medicare check functionality (Find a plan to meet your needs  )
    When I click on Find a plan to meet your needs
    Then I verify "Right Medicare Plan for You | Aetna Medicare" as Title



  Scenario:  Medicare check functionality (Enroll in Medicare   )
    When I click on Enroll in Medicare
    Then I verify "Aetna Medicare - Plan List" as Title