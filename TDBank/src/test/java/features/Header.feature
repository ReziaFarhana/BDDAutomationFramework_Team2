Feature: Header Functionality

  Background:
    Given I am on the homepage
    And I hover over Services tab

  @test
  Scenario: Verify homepage title
    Then I see the page title as "TD Personal Banking, Loans, Cards & More | TD Bank"


  @test
  Scenario: Verify homepage url
    Then I see the page url as "https://www.td.com/us/en/personal-banking/"


  @test
  Scenario: Services drop down functionality
    Then I see Student Banking link


  @test
  Scenario: Verify Student Banking page title
    When I click Student Banking Link
    Then I see the page title as "Student Banking Services, Free Accounts and Tips | TD Bank"

  @test
  Scenario: Verify Student Banking page url
    When I click Student Banking Link
    Then I see the page url as "https://www.td.com/us/en/personal-banking/student-services/"

  @test
  Scenario: Verify Student Banking page banner
    When I click Student Banking Link
    Then I see the student services banner

  @test
  Scenario: Verify Cross Border link
    Then I see Cross Border link


  @test
  Scenario: Verify Cross Border page title
    When I click Cross Border Link
    Then I see the page title as "Cross-Border Banking | TD Canada Trust"

  @test
  Scenario: Verify Cross Border page url
    When I click Cross Border Link
    Then I see the page url as "https://www.td.com/ca/en/personal-banking/solutions/cross-border-banking/"

  @test
  Scenario: Verify Travel Tips link
    Then I see Travel Tips link


  @test
  Scenario: Verify Travel Tips page title
    When I click Travel Tips Link
    Then I see the page title as "International Travel Money Tips From TD Bank"

  @test
  Scenario: Verify Travel Tips page url
    When I click Travel Tips Link
    Then I see the page url as "https://www.td.com/us/en/personal-banking/travel-tips/"

  @test
  Scenario: Verify Online Banking link
    Then I see Online Banking link


  @test
  Scenario: Verify Online Banking page title
    When I click Online Banking Link
    Then I see the page title as "Safe and secure Online Banking from TD Bank | TD Bank"

  @test
  Scenario: Verify Online Banking page url
    When I click Online Banking Link
    Then I see the page url as "https://www.td.com/us/en/personal-banking/online-banking/"

  @test
  Scenario: Learning main banner verification
    And I click Online Banking Link
    When I click Learning tab
    Then I see Learning main page banner

  @test
  Scenario: Learning banner verification
    And I click Online Banking Link
    When I click Learning tab
    Then I see Learning page banner


  @test
  Scenario: Learning Personal Banking tab verification
    And I click Online Banking Link
    When I click Learning tab
    Then I see Personal Banking tab


  @test
  Scenario: Learning Personal Banking banner verification
    And I click Online Banking Link
    When I click Learning tab
    Then I see Personal Banking banner


  @test
  Scenario: Learning Credit and Lending tab verification
    And I click Online Banking Link
    And I click Learning tab
    Then I see Credit and Lending tab


  @test
  Scenario: Verify Learning page title
    And I click Online Banking Link
    When I click Learning tab
    Then I see the page title as "Personal Financial Education Tips | TD Bank Learning Center"


  @test
  Scenario: Verify Learning page url
    And I click Online Banking Link
    When I click Learning tab
    Then I see the page url as "https://www.td.com/us/en/personal-banking/learning/"


  @test
  Scenario: Learning page footer verification
    And I click Online Banking Link
    And I click Learning tab
    Then I see SECURITIES AND INSURANCE footer tag


  @test
  Scenario: Learning page sub footer verification
    And I click Online Banking Link
    And I click Learning tab
    Then I see Not FDIC Insured sub footer tag

  @test
  Scenario: Learning page sub footer verification 2
    And I click Online Banking Link
    And I click Learning tab
    Then I see Not No Bank Guarantee sub footer tag