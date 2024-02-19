@TransactionHistoryPengelolaMyTouristTicket
  Feature: Transaction History Pengelola My Tourist Ticket

    @TCTHP
    Scenario: Verify that Transaction History is running as intended
      Given Pengelola already on homepage
      When Pengelola click on Sign Up button
      When Pengelola click on Login text
      When Pengelola input "kuta@gmail.com" as email and "qwerty" as password
      When Pengelola click on Login button
      When Pengelola click on label transaction history
      Then Pengelola verify booking date data "2024-02-18 10:45:46"
      Then Pengelola verify booking id data "ca996f63-6f6a-4b2d-8816-935c159cc839"
      Then Pengelola verify name data "kitten"
      Then Pengelola verify tour data "Pantai Kuta"
      Then Pengelola verify tour package data "Happy Bundling - 1 Ticket"
      Then Pengelola verify quantity data "3"
      Then Pengelola verify price data "100000"
      Then Pengelola verify status data
      When Pengelola click next on transaction history list
      When Pengelola click back on transaction history list
      When Pengelola click number on transaction history list