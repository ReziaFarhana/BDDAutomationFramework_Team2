Feature:HomePage header functionality

  @smokeTest
  Scenario: Book A Flight functionality
    Given user is on the UnitedAirlines homepage
    And user enters From location
    And user enters To location
    And user enters dates for flight
    And user selects Premium economy
    When user clicks Find Flights button


