Feature: Register

  @mobile
    Scenario: Register
    Given user already open galileo apps
    And user click register
    And user input registration full name with value "Ari Abdul Rahman Ismanto"
    And user input date of birth "06/27/1985"
    And user click button "OK"
    And user input email "ari-testmobile@primavista-solusi.com"
    And user input phone number "8562945678"
    And user select gender "Male"
    And user click checkbox "I Agree with the Terms & Conditions"
    When user click button "Register"
    Then assert open page "Input OTP"


  @mobile
  Scenario: Register using data that already used
    Given user already open galileo apps
    And user click register
    And user input registration full name with value "Ari Abdul Rahman Ismanto"
    And user input date of birth "06/27/1985"
    And user click button "OK"
    And user input email "ari.abdulrahman@primavista-solusi.com"
    And user input phone number "8562345678"
    And user select gender "Male"
    And user click checkbox "I Agree with the Terms & Conditions"
    When user click button "Register"
    Then appear popup register "Phone or Email already registered"



