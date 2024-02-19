@HomepageMyTouristTicket
Feature: Homepage MyTouristTicket

  @TC3
  Scenario: Verify that homepage is running as intended
    Given User already on homepage
    When User click on Sign Up button
    And User click on Login text
    And User input "rayhan11@gmail.com" as email and "metal12" as password
    And User click on Login button
    Then User should be redirected to homepage
    And Verify that the page loads correctly
    And Verify that layout is displayed correctly

  @TC3
  Scenario: Test search functionality with valid tour name
    Given User already on homepage
    When User click on Sign Up button
    And User click on Login text
    And User input "rayhan11@gmail.com" as email and "metal12" as password
    And User click on Login button
    Then User should be redirected to homepage
    And Verify that the page loads correctly
    And Verify that layout is displayed correctly
    When User input "Pantai Kuta" to search and click enter
    Then User should be redirected to tour page