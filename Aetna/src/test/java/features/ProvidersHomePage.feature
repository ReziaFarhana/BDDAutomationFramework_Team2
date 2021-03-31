Feature: Verify the Providers page

  Background:
    Given I am on the Aetna Homepage
    When I click on the Providers link

  @Israt
  Scenario: Navigate to the View provider update video
    And I click on the viewProviderUpdateVideo on the Partnering with providers pop-up
    When I click on the continue button
    Then I verify "COVID-19 Vaccines: Provider Update - YouTube" as the title of the video on YouTube

  @Israt
  Scenario: close the alert on the Providers homepage
    When I close the Partnering with providers alert
    Then I verify the Providers page title as "Aetna for Health Care Providers | Resources & Support for Health Care Professionals"

  @Israt
  Scenario: Check the Manuals, webinars and more link
    When I click on explore health care resources
    Then I should see "Provider Education & Manuals"

  @Israt
  Scenario: Check the Newsletters link
    When I click on read provider newsletters
    Then I verify page "OfficeLink Updates Newsletter Archive | Aetna"

  @Israt
  Scenario: Check the State regulations link
    When I click on find regulations by state link
    Then The title is "Insurance regulations by state"

  @Israt
  Scenario: Check the Disputes and appeals link
    When I click on learn about disputes and appeals
    Then I verify the text "Disputes & Appeals"

  @Israt
    Scenario: Navigate to the payment and claims helpful links
    And I right click the payment solutions link to open in a new window
    When I click on the explore claims options
    Then I verify the title as "Electronic claims | Aetna"

    @Israt
    Scenario: Navigate to the Availity claims management and authorizations site
      And I click on the submit claims through the availity site
      And I click on contiue to availity site and close the old window
      When I click on the no button on the availity site pop-up
      Then I verify the page as "Availity Revenue Cycle Management, Clearinghouse, Provider Portal"
