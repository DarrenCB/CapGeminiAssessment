Feature: UserJourney

  Scenario: User submits hourly salary to tax calculator
    Given the user is on the "tax calculator" page
    When the user fills in their "hourly" salary and all details
    Then the user gets shown their take-home pay "from their hourly salary"

  Scenario: User submits daily salary to tax calculator
    Given the user is on the "tax calculator" page
    When the user fills in their "daily" salary and all details
    Then the user gets shown their take-home pay "from their daily salary"

  Scenario: User submits £0 as salary
    Given the user is on the "tax calculator" page
    When the user submits no salary
    Then "no salary" error message appears

  Scenario: User claims to work 8 days a week
    Given the user is on the "tax calculator" page
    When the user fills in their daily salary and types 8 days a week
    Then "incorrect days" error message appears