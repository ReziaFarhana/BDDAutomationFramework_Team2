Feature: Aetna home page functionality check


  Background:
    Given I am on Aetna home page
    When I click shop for a plan

#passed-1
  @Test
  Scenario: Student Health Shop a plan functionality check
    And I go Health coverage
    And I click Student plans
    Then I validate "Helpful links" is appeared properly

  @Test
  Scenario:Health insurance through worker functionality test
    And I go Health coverage
    And I click Plans through an employer
    Then I validate "Health insurance through work" is displayed properly

  @Test
  Scenario:International plan functionality test

    And I go Health coverage
    And I click International Plans
    Then I validate Aetna Well-being is appeared properly

  @Farhana
#  Scenario:Aetna Plan from an employer Functionality Checking
  Scenario:Aetna find a doctor Functionality Checking

    When I click on Find a doctor
    When I click on Plan from an employer
    Then I validate "Searching as a member is better" message is appeared properly

  @Test
  Scenario:Aetna Shop a Dental plan functionality test

    And I go dental, vision and supplemental
    And I click dental plans
    Then I validate "Dental insurance plans for individuals and families" is displayed

  @Test
  Scenario:Aetna Shop a dentist plan functionality test

    And I go dental, vision and supplemental
    And I click find a dentist
    Then I validate "You Can:" appeared properly
  @Test
  Scenario:Aetna Shop a plan functionality test
    When I click shop for a plan
    And I go dental, vision and supplemental
    And I click vision plans
    Then I validate Aetna Dental Direct plan is appeared properly

  Scenario:Aetna Disputes & Appeals Overview

    Then I took necessary steps to land on Aetna Disputes & Appeals Overview
    Then I validate Clinical Policy Bulletins is appeared properly

#  @Test
#  Scenario:Aetna Shop a plan functionality test
#    And I go Health coverage
#    And I click find a doctor
#    Then I validate "COVID-19" Alert is appeared properly

  @Test
  Scenario:Aetna Request a call functionality check
  When I click on Explore Aetna sites
  When I click on Aetna.com
  When I click on Aetna Medicare
  When I click on Request call
  Then I validate A new plan is appeared properly

 Scenario:Aetna Welcome Functionality Checking

  When I click on For Providers
  When I click on Join the Aetna network
  When I click on Welcome
  Then I validate "Step 1" is appeared

  Scenario: Aetna Medical Functionality Checking

  When I click on Medical
  Then I validate Medical Request for Participation is appeared properly

  Scenario:Aetna Behavioral Health Functionality Checking

  When I click on Behavioral Health
  Then I validate Behavioral Health Request for Participation is appeared properly

  Scenario:Aetna Facility Request for Participation Functionality Checking

  When I click on Facility
  Then I validate Facility Request for Participation is appeared properly

  Scenario:Aetna Others Functionality Checking

  When I click on Others
  Then I validate Other networks you can join is appeared properly

  Scenario:Aetna Find a doctor or hospital Functionality Checking

  When I click on Precertification
  When I click on Find a doctor or hospital
  Then I validate Directory is appeared properly


