@EditUserProfileMyTouristTicket
Feature: Edit User Profile MyTouristTicket

  @TC3
  Scenario: Edit user profile with valid data
    Given User already on homepage
    When User click on Sign Up button
    When User click on Login text
    When User input "rayhan11@gmail.com" as email and "metal12" as password
    When User click on Login button
    When User click on image profile
    When User click on label profile
    When User click on edit profile button
    When User click on cancel button
    When User click on edit profile button again
    When User input "Rayhan A M" as Full Name
    When User input "rayhan11@gmail.com" as Email
    When User input "+62643-229-0470" as Phone Number
    When User input "metal12" as Password
    When User click on save button