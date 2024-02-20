@DashboardAdminMyTouristTicket
  Feature: Dashboard Admin

    @TC1
    Scenario: Verify Dashboard Admin
      Given User already on homepage
      When User click on Sign Up button
      And User click on Login text
      And User input "admin1@gmail.com" as email and "admin123" as password
      And User click on Login button
      Then User should be redirected to dashboard
      When User click on pantai kuta image
      And User click on ticket regular
      And User click on family bundling
      And User click on happy bundling