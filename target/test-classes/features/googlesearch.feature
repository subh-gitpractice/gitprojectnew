Feature: Check googlesearch is working
  Scenario: validate good search is working
    Given browser is open in "chrome"
    And user is on googlesearch page
    When user enters a text in serach box
    And hits enter
    And user navigated to searched results