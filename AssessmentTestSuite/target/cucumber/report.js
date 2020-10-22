$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/userjourney.feature");
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
  "name": "the user gets shown their take-home pay from their \"hourly\" salary",
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
  "name": "the user gets shown their take-home pay from their \"daily\" salary",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.takeHomePayDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User edits his submitted salary",
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
  "name": "the user edits their data to a daily salary",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.changeHourlySalaryToDailySalary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user gets shown their take-home pay from their \"daily\" salary",
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
  "name": "an error message appears",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.noSalaryErrorMessage()"
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
  "name": "a different error message appears",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserJourneyStepDef.wrongDaysErrorMessage()"
});
formatter.result({
  "status": "passed"
});
});