$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/taxresults.feature");
formatter.feature({
  "name": "TaxResults",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User edits his submitted salary",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"tax estimate\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user edits their data to a daily salary",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.TaxResultsStepDef.changeHourlySalaryToDailySalary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user gets shown their take-home pay \"from their daily salary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.takeHomePayDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User checks monthly take-home pay",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"tax estimate\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"monthly pay tab\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.TaxResultsStepDef.clickButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user gets shown their take-home pay \"on a monthly basis\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.takeHomePayDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User decides to start again",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"tax estimate\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks \"start again\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.TaxResultsStepDef.clickButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.TaxResultsStepDef.userOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/userjourney.feature");
formatter.feature({
  "name": "UserJourney",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User submits hourly salary to tax calculator",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"tax calculator\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in their \"hourly\" salary and all details",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userFillsInDetails(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user gets shown their take-home pay \"from their hourly salary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.takeHomePayDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User submits daily salary to tax calculator",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"tax calculator\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in their \"daily\" salary and all details",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userFillsInDetails(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user gets shown their take-home pay \"from their daily salary\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.takeHomePayDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User submits £0 as salary",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"tax calculator\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user submits no salary",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userSubmitsNoSalary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"no salary\" error message appears",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.errorMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User claims to work 8 days a week",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the user is on the \"tax calculator\" page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userOnThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills in their daily salary and types 8 days a week",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.userSubmitsEightDayWeek()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"incorrect days\" error message appears",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.errorMessage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
});