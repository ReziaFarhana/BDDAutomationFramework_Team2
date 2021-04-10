Feature: Member Support Function

  Background:
    Given Individual Plans page is displayed
    And I click Member support tab
    And I hover over Account management tab


  @test
  Scenario: Member support drop down menu function
    Then I should see Find a Doctor Link

  @test
  Scenario: Find a Form link is valid
    Then I should see Find a Form link


  @test
  Scenario: Pay Your Premium is valid
    Then I should see Pay your premium link

  @test
  Scenario: Verify Pay Your Premium page title
    When I click Pay your premium link
    Then I should see the page title is "Pay Your Monthly Premium Bill Online | Aetna"






