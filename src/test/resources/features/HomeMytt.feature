@HomepageMyTouristTicket
Feature: Homepage MyTouristTicket

  @TC4
  Scenario: Verify that homepage is running as intended
    Given User already on homepage
    When User click on Sign Up button
    When User click on Login text
    When User input "rayhan11@gmail.com" as email and "metal12" as password
    When User click on Login button
    Then User should be redirected to homepage
    Then Verify that the page loads correctly
    Then Verify that layout is displayed correctly
