@RegisterMyTouristTicket
Feature: Register MyTouristTicket


  @TC3
  Scenario Outline: Register MyTouristTicket with valid data as costumer
    Given User already on home page
    When User click Sign Up button
    When User click Customer
    When User input "<fullName>" as Fullname, "<phoneNumber>" as Phone Number, "<email>" as email, and "<password>" as password
    When User click on Register button
    Examples:
      | fullName | phoneNumber | email               | password |
      | Rayhan2  | 0810000002  | rayhan002@gmail.com | metal12  |

  @TC3
  Scenario Outline: Register MyTouristTicket with valid data as pengelola
    Given User already on home page
    When User click Sign Up button
    When User click Pengelola
    When User input "<fullName>" as Fullname, "<phoneNumber>" as Phone Number, "<email>" as email, "<address>" as address, "<noKTP>" as no ktp and "<password>" as password
    When User click on Register button
    Examples:
      | fullName   | phoneNumber | email                 | address | noKTP    | password |
      | Pengelola1 | 0820000001  | penglola001@gmail.com | Ngawi   | 12000001 | metal12  |