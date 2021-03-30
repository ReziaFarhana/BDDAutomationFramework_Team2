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