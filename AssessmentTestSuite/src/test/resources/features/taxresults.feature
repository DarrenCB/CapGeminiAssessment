Feature: TaxResults

  Scenario: User edits his submitted salary
    Given the user is on the "tax estimate" page
    When the user edits their data to a daily salary
    Then the user gets shown their take-home pay "from their daily salary"

  Scenario: User checks monthly take-home pay
    Given the user is on the "tax estimate" page
    When the user clicks "monthly pay tab"
    Then the user gets shown their take-home pay "on a monthly basis"

  Scenario: User decides to start again
    Given the user is on the "tax estimate" page
    When the user clicks "start again"
    Then the user should be on the home page