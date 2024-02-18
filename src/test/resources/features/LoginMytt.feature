@LoginMyTouristTicket
Feature: Login MyTouristTicket

  @TC3
  Scenario: Login MyTouristTicket with valid credentials as costumer
    Given User already on homepage
    When User click on Sign Up button
    And User click on Login text
    And User input "rayhan11@gmail.com" as email and "metal12" as password
    And User click on Login button

  @TC3
  Scenario: Login MyTouristTicket with valid credentials as pengelola
    Given User already on homepage
    When User click on Sign Up button
    And User click on Login text
    And User input "pengelola2@gmail.com" as email and "metal12" as password
    And User click on Login button

  @TC3
  Scenario: Login MyTouristTicket with valid credentials as admin
    Given User already on homepage
    When User click on Sign Up button
    And User click on Login text
    And User input "rayhan123@gmail.com" as email and "metal123" as password
    And User click on Login button

  @TC3
  Scenario: Login MyTouristTicket with invalid email
    Given User already on homepage
    When User click on Sign Up button
    And User click on Login text
    And User input "asdasd@gmail.com" as email and "metal12" as password
    And User click on Login button
    Then Error message "Email not found" should appeared

  @TC3
  Scenario: Login MyTouristTicket with invalid password
    Given User already on homepage
    When User click on Sign Up button
    And User click on Login text
    And User input "rayhan11@gmail.com" as email and "thisiswrongpass" as password
    And User click on Login button
    Then Error message "Password is incorrect" should appeared