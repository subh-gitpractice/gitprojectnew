$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/googlesearch.feature");
formatter.feature({
  "name": "Check googlesearch is working",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate good search is working",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.googlesearch.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on googlesearch page",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefination.googlesearch.user_is_on_googlesearch_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters a text in serach box",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefination.googlesearch.user_enters_a_text_in_serach_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hits enter",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefination.googlesearch.hits_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to searched results",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefination.googlesearch.user_navigated_to_searched_results()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "feature to test login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "check login working with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.loginstep.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefination.loginstep.user_enters_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefination.loginstep.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.loginstep.user_is_navigated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
});