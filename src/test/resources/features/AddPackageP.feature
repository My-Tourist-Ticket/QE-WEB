@AddPackagePengelolaMyTouristTicket
Feature: Add Package Pengelola My Tourist Ticket

  @TC3
  Scenario: Add package pengelola with credentials data
    Given Pengelola already on homepage
    When Pengelola click on Sign Up button
    When Pengelola click on Login text
    When Pengelola input "kuta@gmail.com" as email and "qwerty" as password
    When Pengelola click on Login button
    When Pengelola click on label my tour
    When Pengelola click on image tour
    When Pengelola click on add package
    When Pengelola input "Happy Bundling - 1 Ticket" as Package Name
    When Pengelola click on add services button
    When Pengelola input "Drink" as services list 1
    When Pengelola input "Meal" as services list 2
    When Pengelola click on remove services button
    When Pengelola input "1" as Jumlah Tiket
    When Pengelola input "30000" as Price
    When Pengelola click on button submit