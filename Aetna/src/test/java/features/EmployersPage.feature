Feature: Employers Page Header Functionality

  Background:
    Given user is on employers page
#
#
#  Scenario: Toggle Drop Down Menu
#    When user clicks on Explore Aetna Sites
#    And user clicks on About Us
#    Then user verify "Wherever you are" appears properly
#
#
#  Scenario:Products and Services Options Checking All Health Plans
#    Then user clicks on Products and services
#    And user hovers over Health Plans
#    And user clicks All Health Plans
#    Then user verifies page title is "Group Medical, Medicare & Ancillary Insurance Plans | Aetna"

@monkeyTest
  Scenario:Products and Services Options Checking Medicare
    And user clicks on Products and services
    And user hovers over Health Plans
    When user clicks Medicare
    Then user verifies page title is "Group Health Medicare Plans for Retirees from Aetna | Insurance Coverage & Benefits"

  @sanityTest
  Scenario:Products and Services Options Checking Dental
    And user clicks on Products and services
    And user hovers over Health Plans
    When user clicks on Dental
    Then user verifies page title is "Group Dental Insurance Plans from Aetna | DMO, PPO, & Indemnity Plans & Coverage for Employers"


  Scenario:Products and Services Options Checking Vision
    And user clicks on Products and services
    And user hovers over Health Plans
    When user clicks on Vision
    Then user verifies page title is "Group Vision Insurance from Aetna | Plans for Employers & Employees"


  Scenario:Products and Services Options Checking Pharmacy
    And user clicks on Products and services
    And user hovers over Health Plans
    When user clicks on Pharmacy
    Then user verifies page title is "Group Pharmacy Insurance Plans from Aetna | Prescription Drug Plans & Coverage for Employers & Brokers"


  Scenario:Products and Services Options Checking Supplemental
    And user clicks on Products and services
    And user hovers over Health Plans
    When user clicks on Supplemental
    Then user verifies page title is "Group Supplemental Medical Insurance Plans from Aetna | Voluntary Employee Benefits"

  @integrationTest
  Scenario:Products and Services Options Checking All Member Programs
    And user clicks on Products and services
    And user hovers over Member Programs
    When user clicks All Member Programs
    Then user verifies page title is "Services to Support Member Health for Employers | Aetna"

    @monkeyTest
  Scenario:Products and Services Options Checking Aetna Health app
    And user clicks on Products and services
    And user hovers over Member Programs
    When user clicks Aetna Health app
    Then user verifies  "Making a care connection with Aetna Health" appears properly


  Scenario:Products and Services Options Checking Behavioral Health
    And user clicks on Products and services
    And user hovers over Member Programs
    When user clicks Behavioral Health
    Then user verifies page title is "Mental Health Insurance Plans & Coverage from Aetna | Behavioral Health Benefits & Programs for Employers"

  Scenario:Products and Services Options Checking Care Management
    And user clicks on Products and services
    And user hovers over Member Programs
    When user clicks Care Management
    Then user verifies page title is "Medical Care Management Services | Aetna"

  Scenario:Products and Services Options Checking Customer Service
    And user clicks on Products and services
    And user hovers over Member Programs
    When user clicks Customer Service
    Then user verifies page title is "Personalized Customer Service Programs & Support | Aetna"

  Scenario:Products and Services Options Checking Diabetes
    And user clicks on Products and services
    And user hovers over Member Programs
    When user clicks Diabetes
    Then user verifies page title is "Diabetes Management | Plans & Programs from Aetna"

  Scenario:Products and Services Options Checking Member Management Platform
    And user clicks on Products and services
    And user hovers over Member Programs
    When user clicks Member Management Platform
    Then user verifies page title is "Member Engagement Platform for Employers | Aetna"

  Scenario:Products and Services Options Checking Telehealth
    And user clicks on Products and services
    And user hovers over Member Programs
    When user clicks Telehealth
    Then user verifies page title is "Telehealth Services from Aetna | Telemedicine Benefits"

  Scenario:Products and Services Options Checking Womens Health
    And user clicks on Products and services
    And user hovers over Member Programs
    When user clicks Womens Health
    Then user verifies page title is "Women's Health Services & Support Plans for Employers | Aetna"

  Scenario:Products and Services Options Checking All Administration Tools
    And user clicks on Products and services
    And user hovers over Administration Offerings
    When user clicks All Administration Tools
    Then user verifies page title is "Health Plan & Benefits Administration for Employers | Aetna"

  Scenario:Products and Services Options Checking Payflex
    And user clicks on Products and services
    And user hovers over Administration Offerings
    When user clicks All Payflex
    Then user verifies page title is "PayFlex Integration for Employers & Employees | Aetna"

    @linkTest
  Scenario:Products and Services Options Checking Get A Quote
    And user clicks on Products and services

    And user gets all links on Quotes Page
    Then user verifies page title is "Get a Health Insurance Quote from Aetna for Your Clients"

      @easha
  Scenario Outline: Start a Quote functionality
   And user clicks on Products and services
   And user clicks on Get A Quote
    And user clicks Go to the individual dental Distribution Partner Portal
    And user enters "<Zipcode>"
    When user clicks Get A Free Quote
    Then user verifies page title is "Aetna Dental Direct | About You"
    Examples:
    |Zipcode|
    |12534|

  Scenario:Solutions Options Checking Small Business
    And user clicks on Solutions
    And user hovers over By company size
    When user clicks Small Business
    Then user verifies page title is "Small Business Health Insurance Plans from Aetna | Group Medical Insurance Options for Small Business Owners / Employers"

  Scenario:Solutions Options Checking Mid-size Business
    And user clicks on Solutions
    And user hovers over By company size
    When user clicks Mid-size Business
    Then user verifies page title is "Mid-Sized Business Health Insurance from Aetna | Plans for Mid-Market / Medium-Sized Business Employers"


  Scenario:Solutions Options Checking Large Business
    And user clicks on Solutions
    And user hovers over By company size
    When user clicks Large Business
    Then user verifies page title is "Mid-Sized Business Health Insurance from Aetna | Plans for Mid-Market / Medium-Sized Business Employers"
    And user gets links from Large Business Page