@CreateVoucherTicket
  Feature: Create new voucher ticket

    @TC1
    Scenario: Create voucher with valid data
      Given User already on homepage
      When User click on Sign Up button
      And User click on Login text
      And User input "admin1@gmail.com" as email and "admin123" as password
      And User click on Login button
      Then User should be redirected to dashboard
      When User click on add voucher
      And User input "Voucher jum'at berkah" as voucher name, "berkah" as voucher code
      And User input "khusus hari jum'at" as description, "3" as discount value
      And User click on icon show date
      And User choose date on calender
      And User click on button add
      Then Show message "Voucher already exist!" should appeared