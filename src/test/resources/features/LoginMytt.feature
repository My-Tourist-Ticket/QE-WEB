@LoginJobSeeker
Feature: Login MyTouristTicket

  @TC2
  Scenario: Login MyTouristTicket with valid credentials as costumer
    Given User already on homepage
    When User click on Sign Up button
    When User click on Login text
    When User input "rayhan11@gmail.com" as email and "metal12" as password
    When User click on Login button

  @TC2
  Scenario: Login MyTouristTicket with valid credentials as pengelola
    Given User already on homepage
    When User click on Sign Up button
    When User click on Login text
    When User input "pengelola2@gmail.com" as email and "metal12" as password
    When User click on Login button

  @TC2
  Scenario: Login MyTouristTicket with valid credentials as admin
    Given User already on homepage
    When User click on Sign Up button
    When User click on Login text
    When User input "rayhan123@gmail.com" as email and "metal123" as password
    When User click on Login button