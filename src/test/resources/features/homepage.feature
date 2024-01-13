Feature: Validate Home features
  Background:
    Given I am on Login page

  Scenario: Verify Page url

    Given I entered valid username and password
    When Click on login button
    Then Validate page url


  Scenario: Verify page sub logo

    Given I entered valid username and password
    When Click on login button
    Then Validate page sub logo

  @suri
  Scenario Outline: Login with invalid username and validate the error message
    When I entered invalid gmail <gmail_id>
    Then Validate invalid error message <error_msg>

    Examples:
      | gmail_id        | error_msg                           |
      | "gkdllwlegdklk" | "Couldn’t find your Google Account" |
      | "fjksjdslkfk"   | "Couldn’t find your Google Account" |



