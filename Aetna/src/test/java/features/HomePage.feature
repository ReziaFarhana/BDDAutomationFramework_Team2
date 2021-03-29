Feature: Aetna Homepage Employers Link

  @smokeTest
  Scenario: Employers Link functionality Check
    Given user is on Aetna homepage
    When user clicks on Employers link
#    Then user should see "Espanol" appear
    Then user verify page title is "Employer Group Health Insurance Plans & Benefits | Aetna"