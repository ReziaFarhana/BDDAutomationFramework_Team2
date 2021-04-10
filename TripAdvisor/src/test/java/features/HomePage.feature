Feature: TripAdviser Vacation Rental Functionality

  Background:
    Given I am on TripAdvisor Homepage
    And I click on Vacation Rentals
    When I enter "Tampa" in Where To TextBox and click enter
    And I click on reviews and opinions
    When I click on Vacation Rental Tab

#  Scenario:verifying Tampa Vacation rental
#    Then I verify "Tampa Vacation Rentals" Text Page Displays

  @Test  #1//done
  Scenario: Verify Reviews and Opinion functionality

    Then I verify "Tampa 2021: Best of Tampa, FL Tourism - Tripadvisor" Title Appears correctly

  @test #2 Done
  Scenario: Verify TripAdvisor Vacation Rental functionality using Chrome Browser

    Then I verify that "Tampa Vacation Rentals" Text Displays Correctly

  @Test #3
  Scenario: Verify TripAdvisor Vacation Rental Tab is functional

    Then I verify the Text "Tampa Vacation Rentals" appears Accurately


  @Test  #4
  Scenario: Verify TripAdvisor Vacation Rental Checkin CheckOut filter functionality

    And I click on Checkin Box
    And I click on "May 28" and click on "June 4"
    And I click on Guest
    And I click the add button to add bedrooms
    And I click the add button to add guests
    And I click the add button  to add  bathrooms
    When I click on apply
    Then I verify all the filters appear accurately

  @Test  #5
  Scenario: Verify TripAdvisor Vacation Rental for Sorting Low to High filter functionality

    And I click on Checkin Box
    And I click on "May 28" and click on "June 4"
    And I click on Guest
    And I click the add button to add bedrooms
    And I click the add button to add guests
    And I click the add button  to add  bathrooms
    When I click on apply
    And  I click on  Sort By drop Down
    When I Select Price-Low to High
    Then I Verify that the "price per night" Text is the Lowest Price

  @Test  #6
  Scenario:Verify TripAdvisor Vacation Rental for Sorting High to Low filter functionality
    And I click on Checkin Box
    And I click on "May 28" and click on "June 4"
    And I click on Guest
    And I click the add button to add bedrooms
    And I click the add button to add guests
    And I click the add button  to add  bathrooms
    When I click on apply
    And  I click on  Sort By drop Down
    When I click on Price-High to Low
    Then The search result should be diplayed in descending order by price per night

  @Test  #7
  Scenario:Verify TripAdvisor Vacation Rental for Sorting Rating filter functionality
    And I click on Checkin Box
    And I click on "May 28" and click on "June 4"
    And I click on Guest
    And I click the add button to add bedrooms
    And  I click the add button to add guests
    And I click the add button  to add  bathrooms
    When I click on apply
    And  I click on  Sort By drop Down
    When I click on Travel Rating
    Then I should see bubble rating

  @Test  #8---come back
  Scenario: Verify TripAdvisor Slider setting for minimum amount Functionality
   # And I click on the left Slider button
    And I slide the slider to Offset 10 for the amount $100
    Then I verify the minimum amount has changed to "$100"

@Text #9
  Scenario: Verify TripAdvisor Slider setting for Maximum amount functionality
    And I click on the right Slider button
    And I slide the slider to Offset 50 for the amount $500
    Then I verify the maximum amount has changed to $500


  @Test  #9
  Scenario: Verify TripAdviser Suitability Filter Funtionality
    And I click the Kid Friendly Checkbox
    And I click Pet friendly Checkbox
    Then the Applied filters should be displayed

  @Test    #10
  Scenario: Verify TripAdvisor Amenities Filter Functionality
    And I Click On Parking Checkbox
    When I click on Internet Checkbox
    Then the applied filters should be displayed2

  @Test   #11
  Scenario:Verify TripAdvisor Property Type Filter Functionality
    When I click on Vacation Rental Houses Checkbox
    Then the applied filter should be displayed3

  @Test   #12
  Scenario: Verify TripAdvisor Distinctive Feature Functionality
    And I click the Water views Checkbox
    And I click Waterfront Checkbox
    Then the Applied filters should be displayed



