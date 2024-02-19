@FlowMyTouristTicket
Feature: Flow Application MyTouristTicket

  @TC4
  Scenario: Flow application for booking tour ticket as costumer
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
    When User choose package
    And User add ticket 10 times
    And User click on booking button
    Then User should be redirected to payment page
    When User choose payment method
    And User click on submit button
    Then User should be redirected to page for completed the payment