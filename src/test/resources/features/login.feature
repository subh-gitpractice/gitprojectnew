Feature: feature to test login

@smoketest
  Scenario: check login working with valid credentials
    Given user is on login page
    When user enters the username and password
    And clicks on login button
    Then user is navigated to the home page
