@CitypageMyTouristTicket
Feature: City page MyTouristTicket

  @TC3
  Scenario: Verify that city page is running as intended
    Given User already on homepage
    When User click on Sign Up button
    And User click on Login text
    And User input "rayhan11@gmail.com" as email and "metal12" as password
    And User click on Login button
    Then User should be redirected to homepage
    When User click on city image
    Then User should be redirected to city page
    And Verify that city page load correctly

  @TC4
  Scenario: Verify that clicking image redirect users to correct page
    Given User already on homepage
    When User click on Sign Up button
    And User click on Login text
    And User input "rayhan11@gmail.com" as email and "metal12" as password
    And User click on Login button
    Then User should be redirected to homepage
    When User click on city image
    Then User should be redirected to city page
    When User click on tourist attraction image
    Then User should be redirected to tour page