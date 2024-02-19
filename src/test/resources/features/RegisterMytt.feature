@RegisterMyTouristTicket
Feature: Register MyTouristTicket


  @TC3
  Scenario Outline: Register MyTouristTicket with valid data as costumer
    Given User already on home page
    When User click Sign Up button
    And User click Customer
    And User input "<fullName>" as Fullname, "<phoneNumber>" as Phone Number, "<email>" as email, and "<password>" as password
    And User click on Register button
    Examples:
      | fullName | phoneNumber | email               | password |
      | Rayhan2  | 0810000002  | rayhan002@gmail.com | metal12  |

  @TC3
  Scenario Outline: Register MyTouristTicket with valid data as pengelola
    Given User already on home page
    When User click Sign Up button
    And User click Pengelola
    And User input "<fullName>" as Fullname, "<phoneNumber>" as Phone Number, "<email>" as email, "<address>" as address, "<noKTP>" as no ktp and "<password>" as password
    And User click on Register button
    Examples:
      | fullName   | phoneNumber | email                 | address | noKTP    | password |
      | Pengelola1 | 0820000001  | penglola001@gmail.com | Ngawi   | 12000001 | metal12  |

  @TC3
  Scenario Outline: Register MyTouristTicket as costumer with phone number using character
    Given User already on home page
    When User click Sign Up button
    And User click Customer
    And User input "<fullName>" as Fullname, "<phoneNumber>" as Phone Number, "<email>" as email, and "<password>" as password
    And User click on Register button
    Then Error message "Phone number should be a number" should appeared
    Examples:
      | fullName | phoneNumber | email               | password |
      | Rayhan2  | asdasd      | rayhan002@gmail.com | metal12  |

  @TC3
  Scenario Outline: Register MyTouristTicket as costumer with duplicate phone number
    Given User already on home page
    When User click Sign Up button
    And User click Customer
    And User input "<fullName>" as Fullname, "<phoneNumber>" as Phone Number, "<email>" as email, and "<password>" as password
    And User click on Register button
    Then Error message "Phone number already exists" should appeared
    Examples:
      | fullName | phoneNumber | email               | password |
      | Rayhan2  | 0810000002  | rayhan002@gmail.com | metal12  |

  @TC3
  Scenario Outline: Register MyTouristTicket as costumer with duplicate email
    Given User already on home page
    When User click Sign Up button
    And User click Customer
    And User input "<fullName>" as Fullname, "<phoneNumber>" as Phone Number, "<email>" as email, and "<password>" as password
    And User click on Register button
    Then Error message "Email already existed" should appeared
    Examples:
      | fullName | phoneNumber  | email              | password |
      | Rayhan2  | 081342342342 | rayhan11@gmail.com | metal12  |

  @TC3
  Scenario Outline: Register MyTouristTicket as pengelola with No KTP using character
    Given User already on home page
    When User click Sign Up button
    And User click Pengelola
    And User input "<fullName>" as Fullname, "<phoneNumber>" as Phone Number, "<email>" as email, "<address>" as address, "<noKTP>" as no ktp and "<password>" as password
    And User click on Register button
    Then Error message "KTP should be a number" should appeared
    Examples:
      | fullName   | phoneNumber | email                 | address | noKTP     | password |
      | Pengelola1 | 0820000111  | penglola005@gmail.com | Ngawi   | asdsadsad | metal12  |

  @TC3
  Scenario Outline: Register MyTouristTicket as pengelola with duplicate No KTP
    Given User already on home page
    When User click Sign Up button
    And User click Pengelola
    And User input "<fullName>" as Fullname, "<phoneNumber>" as Phone Number, "<email>" as email, "<address>" as address, "<noKTP>" as no ktp and "<password>" as password
    And User click on Register button
    Then Error message "KTP already exists" should appeared
    Examples:
      | fullName   | phoneNumber | email                 | address | noKTP          | password |
      | Pengelola1 | 0820000111  | penglola005@gmail.com | Ngawi   | 12314434345123 | metal12  |