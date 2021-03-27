Feature: Verify the Providers page

  Background:
    Given I am on the Aetna Homepage
    When I click on the Providers link

  Scenario: Navigate to the View provider update video
    And I click on the viewProviderUpdateVideo on the Partnering with providers pop-up
    When I click on the continue button
    Then I verify "COVID-19 Vaccines: Provider Update - YouTube" as the title of the video on YouTube

    Scenario: close the alert
      And I close the Partnering with providers alert