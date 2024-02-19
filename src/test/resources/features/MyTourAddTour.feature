@AddTourPengelolaMyTouristTicket
Feature: Add Tour Pengelola My Tourist Ticket

  @TC3
  Scenario: Add tour pengelola with credentials data
    Given Pengelola already on homepage
    When Pengelola click on Sign Up button
    When Pengelola click on Login text
    When Pengelola input "kuta@gmail.com" as email and "qwerty" as password
    When Pengelola click on Login button
    When Pengelola click on label my tour
    When Pengelola click on add tour button
    When Pengelola click on back to my tour
    When Pengelola click on add tour button again
    When Pengelola input "Sentul Paradise Park" as Tour Name
    When Pengelola click on choose city
    When Pengelola click on option city
    When Pengelola input "Sentul Paradise Park" as Search Location
    When Pengelola click on button search
    When Pengelola click on zoom in map
    When Pengelola click on zoom out map
    When Pengelola input "Jl. Bojong Koneng, Kec. Babakan Madang, Kabupaten Bogor, Jawa Barat 16720" as Address
    When Pengelola input "Tempat wisata alami yang rimbun dengan air terjun menjulang & kolam, cocok untuk berenang, hiking, & piknik." as Description
    When Pengelola upload thumbnail
    When Pengelola upload image
    When Pengelola click on button add new tour
