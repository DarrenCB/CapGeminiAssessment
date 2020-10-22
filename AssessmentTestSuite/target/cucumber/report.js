$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/userjourney.feature");
formatter.feature({
  "name": "UserJourney",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User completes full journey through tax calculator",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the tax calculator page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userOnThePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in all their details",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userFillsInDetails()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should get shown their take-home pay",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.takeHomePayDisplayed()"
});
formatter.result({
  "status": "passed"
});
});