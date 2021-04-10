Feature: Individual Plans Page Verification

  Background:
    Given Individual Plans page is being displayed


  @test
  Scenario: Verify page title
    Then I should see the page title equates to "Individual & Family Health Insurance Plans | Aetna"

  @test
  Scenario: Verify page url
    Then I should see the page url equates to "https://www.aetna.com/individuals-families.html"

  @test
  Scenario Outline: Login functionality with incorrect username or password
    And I click login button
    And I click login button on next screen
    And I enter "<userName>" in username field
    And I enter "<password>" in password field
    When I click on secure login button
    Then I should see invalid login message
    Examples:
      | userName       | password  |
      | NotaValidUser3 | password3 |
      | NotaValidUser2 | password2 |
      | NotaValidUser1 | password1 |






