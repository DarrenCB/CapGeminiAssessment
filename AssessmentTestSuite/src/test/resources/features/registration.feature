Feature: Registration


  Scenario: Register user with already registered email address
    Given the user is on the "sign in" page
    When the user completes the registration form with "a registered email address"
    Then "already registered alert" is displayed

  Scenario: Register as new user
    Given the user is on the "sign in" page
    When the user completes the registration form with "an unregistered email address"
    Then the user is registered and the account page is displayed

  Scenario: Register using name with numeric value
    Given the user is on the "sign in" page
    When the user completes the registration form with "an unregistered email address and a name with numeric values"
    Then "invalid name alert" is displayed

  Scenario: Register using numeric values for password
    Given the user is on the "sign in" page
    When the user completes the registration form with "an unregistered email address and a password with numeric values"
    Then "invalid numeric password alert" is displayed

  Scenario: Register with invalid birthdate
    Given the user is on the "sign in" page
    When the user completes the registration form with "a registered email address and an invalid birthdate"
    Then "invalid birthdate alert" is displayed
