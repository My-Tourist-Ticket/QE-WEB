@VerificationAccount
  Feature: Verification account manager

    @TC1
    Scenario: Verify action account manager
      Given User already on homepage
      When User click on Sign Up button
      And User click on Login text
      And User input "admin1@gmail.com" as email and "admin123" as password
      And User click on Login button
      Then User should be redirected to dashboard
      When User click on verification account
      And User click action checklist