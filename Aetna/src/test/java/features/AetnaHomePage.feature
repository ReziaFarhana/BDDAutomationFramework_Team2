Feature: Aetna Homepage Header Tabs

  Background:
    Given I am on Aetna Homepage

  @Test  #done  Logo
  Scenario: Verify Aetna logo functionality
    And I Click on Contact Us
    When I Click on Aetna Logo
    Then I Verify the "Individual & Family Health Insurance Plans | Aetna" Title

  @Test  #who we are --done
  Scenario: Verify Our Mission functionality
    And I Click on Contact Us
    And I click Who we are Drop Down
    When I click on Our Mission and I click on Our values
    Then  I verify "Company Values | Aetna" Title


  @Test  # initiatives --corporate responsibilities--done
  Scenario:Verify Aetna Corporate Responsibility Functionality
    And I Click on Contact Us
    And I click on Initiatives
    And I click Corporate Responsibility
    Then I verify "Corporate Responsibility | Aetna" Title
#    When I click National Program
#    Then I verify "National Health Initiatives | Aetna" title

  @Test  #inititives----done
  Scenario: Verify Aetna Doing Business With us Page
    And I Click on Contact Us
    And I click on Initiatives
    When  I click on Doing Business with us
    #Then I verify  "Doing Business With Us | Aetna" title
    Then I verify "Doing Business With Us" Text

  @Test #investors----done
  Scenario: Verify Aetna Investor Information
    And I click on Contact Us
    And I click on Investors
    When I click on Investor Overview
    Then I verify Investor Overview "Investor information" title


  @Test #health section-----done
  Scenario: Verify Aetna News and Insight
    And I click on Contact Us
    And I click on Health Section
    When I click on Community
    Then I verify The"News & Insights | CVS Health" title

  @Test #searchbox-----done
  Scenario: Verifying Aetna Searchbox Functionality
    And I enter "Doctor" In SearchBox and Click Enter
    Then I Verify "Search Results" Title

  @Test #------SearchBox Data Table----Done
  Scenario Outline: Verifying Search Box Functionality
    And I input "<SearchKeyword>" in the SearchBox
    When I click on Search button
    Then I verify the "<SearchResult>" Text
    Examples:
      | SearchKeyword   | SearchResult                            |
      | Doctors         | Showing results for \"Doctors\"         |
      | Insurance Plans | Showing results for \"Insurance Plans\" |
      | Medicare        | Showing results for \"Medicare\"        |
      | Cost            | Showing results for \"Cost\"            |


@Test #-----------verify HealthCare reform text---done
Scenario: Verifying the HealthCare Reform
  And I Click on Contact Us
  And I click Who we are Drop Down
  When I Click on HealthCare Reform
  Then I Verify the Aetna "Health Care Reform" Text





