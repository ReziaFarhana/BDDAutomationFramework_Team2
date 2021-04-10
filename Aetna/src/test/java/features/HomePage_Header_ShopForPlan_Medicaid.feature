Feature: Check shop for plan functionality( Medicaid)

  Background:

    Given I m on Aetna homePage
    And I click on shop for plan
    And I hover on  Medicaid

  Scenario: Medicaid check functionality (Medicaid plans  )
   When I click on Medicaid plans
    Then I verify "Medicaid Insurance Coverage from Aetna | Eligibility & Health Plans" as Title


  Scenario: Medicaid check functionality (Find Doctor  )
    When I click on Find Doctor
    Then I verify "https://www.aetna.com/dsepublicContent/assets/html/content.html?resource=aetna-medicaid" as Title








