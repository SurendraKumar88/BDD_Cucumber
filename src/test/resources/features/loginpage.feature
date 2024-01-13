Feature: Validate Login page features
  Background:
    Given I am on Login page
    Given I entered valid username and password

  Scenario: Login with valid credentials and verify page title

    When Click on login button
    Then Validate page title "Gmail"


  Scenario: Verify page logo

    When Click on login button
    Then Validate page Logo "Google"
