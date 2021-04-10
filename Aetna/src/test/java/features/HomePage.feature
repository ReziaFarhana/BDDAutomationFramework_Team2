Feature: Aetna home page functionality check

  Background:
    Given I am on Aetna home page
    When I click shop for a plan

#passed-1
  @Test  @Ignore
  Scenario: Student Health Shop a plan functionality check
    And I go Health coverage
    And I click Student plans
    Then I validate "Helpful links" is appeared properly
#passed-2
  @Test  @Ignore
  Scenario:Health insurance through worker functionality test
    And I go Health coverage
    And I click Plans through an employer
    Then I validate "Health insurance through work" is displayed properly
#passed-3
  @Test  @Ignore
  Scenario:International plan functionality test

    And I go Health coverage
    And I click International Plans
    Then I validate Aetna Well-being is appeared properly
#passed-4
  @Farhana  @Ignore
  Scenario:Aetna find a doctor Functionality Checking

    When I click on Find a doctor
    When I click on Plan from an employer
    Then I validate "Searching as a member is better" message is appeared properly
#passed-5
  @Test  @Ignore
  Scenario:Aetna Shop a Dental plan functionality test

    And I go dental, vision and supplemental
    And I click dental plans
    Then I validate "Dental insurance plans for individuals and families" is displayed
#passed-6
  @Test @Ignore
  Scenario:Aetna Shop a dentist plan functionality test

    And I go dental, vision and supplemental
    And I click find a dentist
    Then I validate "You Can:" appeared properly
  #passed-7
  @Test @Ignore
  Scenario:Aetna Shop a plan functionality test
    When I click shop for a plan
    And I go dental, vision and supplemental
    And I click vision plans
    Then I validate Aetna Dental Direct plan is appeared properly

    #passed-8
 @Test @Ignore
  Scenario:Aetna Disputes & Appeals Overview

    Then I took necessary steps to land on Aetna Disputes & Appeals Overview
    Then I validate Clinical Policy Bulletins is appeared properly
#passed-10
#  @Test
#  Scenario:Aetna Shop a plan functionality test
#    And I go Health coverage
#    And I click find a doctor
#    Then I validate "COVID-19" Alert is appeared properly
#passed-11
  @Test @Ignore
  Scenario:Aetna Request a call functionality check
  When I click on Explore Aetna sites
  When I click on Aetna.com
  When I click on Aetna Medicare
  When I click on Request call
  Then I validate A new plan is appeared properly

#passed-12
  @Farhana @Ignore
 Scenario:Aetna Welcome Functionality Checking

  When I click on For Providers
  When I click on Join the Aetna network
  When I click on Welcome
  Then I validate "Step 1" is appeared
#passed-13
  @Test @Ignore
  Scenario: Aetna Medical Functionality Checking

  When I click on Medical
  Then I validate Medical Request for Participation is appeared properly

 #passed-14
 @Test @Ignore
  Scenario:Aetna Behavioral Health Functionality Checking

  When I click on Behavioral Health
  Then I validate Behavioral Health Request for Participation is appeared properly

   #passed-15
@Test @Ignore
  Scenario:Aetna Facility Request for Participation Functionality Checking

  When I click on Facility
  Then I validate Facility Request for Participation is appeared properly
#passed-16
  @Test @Ignore
  Scenario:Aetna Others Functionality Checking

  When I click on Others
  Then I validate Other networks you can join is appeared properly
#passed-17
@Test @Ignore
  Scenario:Aetna Find a doctor or hospital Functionality Checking

  When I click on Precertification
  When I click on Find a doctor or hospital
  Then I validate Directory is appeared properly
#passed-18
@Test @Ignore
Scenario: Verify Aetna Medicare Plans

    And I click on Shop for a Plan
    And I click on Medicare and I click on Browse Aetna Medicare Plans
    And I click on Medicare Advantage Plans
    And I enter the Zip Code
    When  I click View 2021 Plans
      Then I Verify the plans Available "Aetna Medicare - Plan List" Title
#passed-19
@Test
  Scenario Outline: Verify Personal Information Form Functionality
    And I click the Sort Drop Down
    And I Select Plan Premium(Low to High)
    And I click Add To Cart
    And I click the Existing Aetna or SilverScript member option radio button
    And  I click Dental and Vision add button
    And  I Click the Proceed to Checkout button
    And I enter the First Name "<FirstName>" in the Text Box
    And I enter the Middle Initial "<MiddleInitial>" in the Text Box
    And I enter the Last Name "<LastName>" in the Text Box
    And I enter the Date of Birth "<DateOfBirth>" in the Text Box
    And I click female as Gender
    And I enter the Primary Phone Number "<PrimaryPhoneNumber>" in the Text Box
    And I enter the Email Address "<EmailAddress>" in the Text Box
    And I enter the Address "<Address>" in the Text Box
    Then I verify Mailing Address selection is optional

    Examples:
      | FirstName | MiddleInitial| LastName| DateOfBirth | PrimaryPhoneNumber | EmailAddress      |Address |
      | Tester    | A            | Asst    | 01/01/2000  | 1234567890         | Tester@gmail.com  |HHPKway |
      | Tester    | B            | Asst2   | 03/25/1990  | 2222563222         | Tester2@gmail.com |NLAvenue|
      | Tester    | C            | Asst3   | 04/25/1980  | 3335843123         | Tester3@gmail.com |Riverdal|
      | Tester    | D            | Asst4   | 05/25/1970  | 4485246324         | Tester4@@gmail.com|CanadaAv|