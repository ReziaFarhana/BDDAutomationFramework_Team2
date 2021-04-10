Feature: United Airlines home page signIn functionality test

  Background:
    Given I am in United Airlines home page
    When I click on signIn button
# passed-10
  @Farhana
  Scenario: United Airlines SignIn functionality test
    And I click on join now and use title
    And I use data in member information field
      | firstName | middleName | lastName | date  | year |
      | Rezia     | Farhana    | Khan     | 01    | 2000 |
    And month and gender field is selected
    Then I verify "contact information" is displayed
    # passed-11
  @Farhana
  Scenario: United Airlines contact information test
    And I click on join now and use title
    When I entered data in Contact Information field
      | street               | city       | state    | zipCode |
      | Henry Hudson Parkway | Bronx      | New York | 10463   |
    Then I validate "Phone number" appear properly
# passed-12
  @Farhana
  Scenario: United Airlines contact information test

    And I click on join now and use title
    And I entered data in phone number field

      | phoneNumber | extenPhone | businessPhone | extenBusinessPhone | airportName |
      | 646821000   | 123        | 2120001111    | 10111              | JFK         |

    And I click on check box field
    Then I verify "Email information" appear properly
# passed-13
  @Test
  Scenario: United Airlines contact information test
    And I click on join now and use title
    And I entered data in email field
      | email            |  reEnterEmail   |
      | fk@gmail.com     |  fk@gmail.com   |

    And I click on check box and uncheck box
    And I entered data in password field
      | password     | reEnterPassword |
      | 30294NY      | 30294NY         |

    And I click on Show button
    Then I verify "Security questions" display properly
# passed-14
  @Test
  Scenario: United Airlines Security Question test
    And I click on join now and use title
    And I entered data in answer field
      | Answer              |
      | Chocolate almond    |
      | Romance             |
      | Science fiction     |
      | Geneva              |
      | June                |

    Then I verify Accept and enroll button is enabled
# passed-15
@Test @Farhana
Scenario: United Airlines MileagePlus enrollment functionality test
  And I click on join now and use title
  And I use data in member information field
    | firstName | middleName | lastName | date  | year |
    | Rezia     | Farhana    | Khan     | 01    | 2000 |
  And month and gender field is selected
  And I entered data in Contact Information field
    | street               | city       | state    | zipCode |
    | Henry Hudson Parkway | Bronx      | New York | 10463   |

  And I entered data in phone number field

    | phoneNumber | extenPhone | businessPhone | extenBusinessPhone | airportName |
    | 646821000   | 123        | 2120001111    | 10111              | JFK         |

  And I entered data in email field
    | email            |  reEnterEmail   |
    | fk@gmail.com     |  fk@gmail.com   |

  And I entered data in password field
    | password     | reEnterPassword |
    | 30294NY      | 30294NY         |

   Then I verify Accept and enroll button is enabled
