Feature: Verify Aetna Shop for a Plan Functionality

  Background:
    Given I am on Aetna Homepage
    And I click on Shop for a Plan
    And I click on Medicare and I click on Browse Aetna Medicare Plans
    And I click on Medicare Advantage Plans
    And I enter the Zip Code
    When  I click View 2021 Plans

  @Test #----done
  Scenario: Verify Aetna Medicare Plans
    Then I Verify the plans Available "Aetna Medicare - Plan List" Title

#      Scenario: Verify Aetna Medicare Advantge Plan functionality
#        And I click the Sort Drop Down
#        When  I Select Plan Premium(Low to High)
#        Then I verify the result set is in Ascending Order

  @Test  #  sortDD--> add to cart-- done
  Scenario: Verify Aetna Medicare Plan Add to Cart functionality
    And I click the Sort Drop Down
    And  I Select Plan Premium(Low to High)
    When I click Add To Cart
    Then I Verify the "My cart" Text

  @Test
  Scenario:Verify Aetna  Checkout functionality
    And I click the Sort Drop Down
    And I Select Plan Premium(Low to High)
    And I click Add To Cart
    And I click the Existing Aetna or SilverScript member option radio button
    And  I click Dental and Vision Add button
    When  I Click the Proceed to Checkout button
    Then I verify "Personal Information" Text

  @Test #--verifying personal info page title--
  Scenario: Verify the Aetna Medicare Enrollment Form Title
    And I click the Sort Drop Down
    And I Select Plan Premium(Low to High)
    And I click Add To Cart
    And I click the Existing Aetna or SilverScript member option radio button
    And I click Dental and Vision Add button
    When I Click the Proceed to Checkout button
    Then I verify the Personal Information "Aetna Medicare - Enrollment Form" Title

  @Test #--verify personal Info text----Done
  Scenario: Verify the Aetna Medicare Enrollment Form Functionality
    And I click the Sort Drop Down
    And I Select Plan Premium(Low to High)
    And I click Add To Cart
    And I click the Existing Aetna or SilverScript member option radio button
    And I click Dental and Vision Add button
    When I Click the Proceed to Checkout button
    Then I verify the Personal Information "Personal Information" Text

    @Test  #-----done
  Scenario Outline: Verify Personal Information Form Functionality
    And I click the Sort Drop Down
    And I Select Plan Premium(Low to High)
    And I click Add To Cart
    And I click the Existing Aetna or SilverScript member option radio button
    And  I click Dental and Vision Add button
    And  I Click the Proceed to Checkout button
    And I Click the Special Enrollment CheckBox
    And I enter the First Name "<FirstName>" in the Text Box
    And I enter the Middle Initial "<MiddleInitial>" in the Text Box
    And I enter the Last Name "<LastName>" in the Text Box
    And I enter the Date of Birth "<DateOfBirth>" in the Text Box
    And I enter the Primary Phone Number "<PrimaryPhoneNumber>" in the Text Box
    And I enter the Email Address "<EmailAddress>" in the Text Box
    #And I Click the Gender RadioButton



    Examples:
      | FirstName | MiddleInitial | LastName | DateOfBirth | PrimaryPhoneNumber | EmailAddress      |
      | Teresa    | A             | Smith    | 02/25/2000  | 1111111123         | Smith@gmail.com   |
      | Frank     | B             | Tera     | 03/25/1990  | 2222563222         | Tera@gmail.com    |
      | Jack      | C             | Lopez    | 04/25/1980  | 3335843123         | Lopez@gmail.com   |
      | Jennifer  | D             | Shibley  | 05/25/1970  | 4485246324         | Shibley@gmail.com |











