Feature: Trip Advisor Home Page Search Box functionality check

  Scenario Outline: Trip Advisor searchBox functionality check
  Given I am on Trip Advisor home Page
  And I enter "<countryName>" in searchBox
  When I click on search Button
  Then I should see "<expectedCountry>" is properly appear
   And I verify "<verifyTitle>" in page title
  Examples:
  | countryName    | expectedCountry | verifyTitle                               |
  | SwitzerLand    | SwitzerLand     | Search results: SwitzerLand - Tripadvisor |
#  | Nepal          | Nepal           | Search results: Nepal - Tripadvisor       |
#  | Maldives       | Maldives        | Search results: Maldives - Tripadvisor    |

  @Test
  Scenario Outline: Search Box functionality check with Valid Product
    When I click on things to do
    And I enter "<City>" in searchbox
    Then I verify "<PageURL>" appears properly
    Examples:
      | City      | PageURL                                                                               |
      | Hawai     | https://www.tripadvisor.com/Attractions-g29217-Activities-Island_of_Hawaii_Hawaii.html|
      | Paris     | https://www.tripadvisor.com/Attractions-g187147-Activities-Paris_Ile_de_France.html   |
      | Las Vegas | https://www.tripadvisor.com/Tourism-g45963-Las_Vegas_Nevada-Vacations.html            |
      | Maldives  | https://www.tripadvisor.com/Attractions-g293953-Activities-Maldives.html              |