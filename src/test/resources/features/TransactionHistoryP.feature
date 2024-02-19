@TransactionHistoryPengelolaMyTouristTicket
  Feature: Transaction History Pengelola My Tourist Ticket

    @TC5
    Scenario: Verify that Transaction History is running as intended
      Given Pengelola already on homepage
      When Pengelola click on Sign Up button
      When Pengelola click on Login text
      When Pengelola input "kuta@gmail.com" as email and "qwerty" as password
      When Pengelola click on Login button
      When Pengelola click on label transaction history
      Then Pengelola verify booking date data "2024-02-19 15:44:34"
      Then Pengelola verify booking id data "d2a7c1b0-2443-4422-aa01-b3169e696a07"
      Then Pengelola verify name data "Rayhan Arjunastya Miftaharif"
      Then Pengelola verify tour data "Pantai Kuta"
      Then Pengelola verify tour package data "Ticket Regular"
      Then Pengelola verify quantity data "11"
      Then Pengelola verify price data "20000"
      Then Pengelola verify status data
      When Pengelola click next on transaction history list
      When Pengelola click back on transaction history list
      When Pengelola click number on transaction history list