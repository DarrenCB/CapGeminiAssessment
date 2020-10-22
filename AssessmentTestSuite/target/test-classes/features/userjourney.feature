Feature: UserJourney

  Scenario: User completes full journey through tax calculator
    Given the user is on the tax calculator page
    When the user fills in all their details
    Then the user should get shown their take-home pay