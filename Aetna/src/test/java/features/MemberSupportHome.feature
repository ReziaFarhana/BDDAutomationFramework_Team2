Feature: Verifying Aetna Member support Home page Header https://www.aetna.com/

  @run
  Scenario:  Member support Home page
    Given I am on Aetna's home page
    When  I click on the  Member support Menu bar link
    Then  I should get a drop down option for further slection

