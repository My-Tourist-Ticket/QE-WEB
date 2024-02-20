@TransactionListAdmin
  Feature: Transaction List Admin

    @TC1
    Scenario: Verify pagination in the transaction list admin
      Given User already on homepage
      When User click on Sign Up button
      And User click on Login text
      And User input "admin1@gmail.com" as email and "admin123" as password
      And User click on Login button
      Then User should be redirected to dashboard
      When User click on transaction list
      And User click on pagination dua
      And User click on pagination tiga