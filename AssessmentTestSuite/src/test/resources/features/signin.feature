Feature: Sign in

  Scenario: Sign in as registered user
    Given the user is on the "sign in" page
    When the user signs in with "registered" email
    Then the user is signed "in"

  Scenario: Sign in as unregistered user
    Given the user is on the "sign in" page
    When the user signs in with "unregistered" email
    Then "error message" is displayed

  Scenario: Forgotten Password
    Given the user is on the "sign in" page
    When the user clicks forgotten password
    Then "confirmation message" is displayed

  Scenario: Sign out
    Given the user is on the "sign in" page
    When the user signs out
    Then the user is signed "out"

  Scenario:Change account preferences
    Given the user is on the "account" page
    When the user changes account settings to opt in to offers and newsletter
    Then "updated account alert" is displayed

  Scenario: Sign in Using invalid password
    Given the user is on the "sign in" page
    When the user inputs valid email
    And enters invalid password
    Then "invalid password alert" is displayed

  Scenario: Add new address to account
    Given the user is on the "account" page
    And on the address section
    When the user adds a new address
    Then "new address" is displayed

  Scenario: signed in with existing account details and have an existing order
    Given the user is on the "account" page
    When the user navigates to a pre-existing order and adds a message
    Then "updated order alert" is displayed

  Scenario: Use and unregistered email to get forgotten password
    Given the user is on the "sign in" page
    When the user inputs and unregistered email in the forgotten password input
    Then "unregistered email alert" is displayed
