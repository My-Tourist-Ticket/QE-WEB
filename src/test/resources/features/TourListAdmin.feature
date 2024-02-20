@TourListAdmin
  Feature: Tour List Admin

    @TC1
    Scenario: Verify More Info Tour Packages and delete package in the Tour List
      Given User already on homepage
      When User click on Sign Up button
      And User click on Login text
      And User input "admin1@gmail.com" as email and "admin123" as password
      And User click on Login button
      Then User should be redirected to dashboard
      And User click on tour list
      When User click three dot menu
      And User click delete menu