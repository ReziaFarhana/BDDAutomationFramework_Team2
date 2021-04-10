Feature: Shop for a plan function

  Background:
    Given I am on the Individual Plans Page
    And I click Shop for a plan tab


  @test
  Scenario: Shop for a plan drop down menu function

    When I hover over Medicare tab
    Then I should see Browse Plans Link

  @test
  Scenario: Validate Browse Plans link
    When I hover over Medicare tab
    Then I should see Browse Plans Link

  @test
  Scenario: Verify Browse Plans page title
    And I hover over Medicare tab
    When I click Browse Plans Link
    Then I should see the page title as "Medicare Plans - Medicare Advantage, Part D, and Supplement Plans | Aetna Medicare"


  @test
  Scenario: Validate Find a Doctor link
    When I hover over Medicare tab
    Then I should see Find Doctor Link

  @test
  Scenario: Verify Find a Doctor page title
    And I hover over Medicare tab
    When I click Find Doctor Link
    Then I should see the page title as "Aetna"

  @test
  Scenario: Verify Find a Doctor page url
    And I hover over Medicare tab
    When I click Find Doctor Link
    Then I should see the page url as "https://www.aetna.com/dsepublic/#/contentPage?page=providerSearchLanding&site_id=medicare&language=en"

  @test
  Scenario: Validate Check our drug list link
    When I hover over Medicare tab
    Then I should see drug list Link

  @test
  Scenario: Verify Check our drug list page title
    And I hover over Medicare tab
    When I click Check our drug list Link
    Then I should see the page title as "Check Our Medicare Covered Drug List | Aetna Medicare"

  @test
  Scenario: Verify Check our drug list page url
    And I hover over Medicare tab
    When I click Check our drug list Link
    Then I should see the page url as "https://www.aetnamedicare.com/en/prescription-drugs/check-medicare-drug-list.html"

  @test
  Scenario: Validate Health coverage list link
    When I hover over Health coverage tab
    Then I should see Health coverage Link

  @test
  Scenario: Validate Plans through an employer link
    When I hover over Health coverage tab
    Then I should see Plans through an employer Link
#
  @test
  Scenario: Verify Plans through an employer page title
    And I hover over Health coverage tab
    When I click Plans through an employer Link
    Then I should see the page title as "Health Insurance Through Work | Employee Health Insurance Plans | Aetna"

  @test
  Scenario: Verify Plans through an employer page url
    And I hover over Health coverage tab
    When I click Plans through an employer Link
    Then I should see the page url as "https://www.aetna.com/individuals-families/health-insurance-through-work.html"

  @test
  Scenario: Validate Student plans link
    When I hover over Health coverage tab
    Then I should see Student plans link
#
  @test
  Scenario: Verify Student plans page title
    And I hover over Health coverage tab
    When I click Student plans link
    Then I should see the page title as "Home | Aetna Student Health"

  @test
  Scenario: Verify Student plans page url
    And I hover over Health coverage tab
    When I click Student plans link
    Then I should see the page url as "https://www.aetnastudenthealth.com/en/index.html"







