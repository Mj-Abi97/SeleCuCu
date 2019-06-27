$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:Cucumberdemo/Tutorials/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "LoginSuccess",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User enters username",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepfile.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password",
  "keyword": "When "
});
formatter.match({
  "location": "Stepfile.user_enters_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepfile.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepfile.home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});