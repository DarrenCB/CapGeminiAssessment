package stepdefs;

import config.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pageObjects.*;


public class UserJourneyStepDef {

    private HomePage homepage = new HomePage();
    private DetailsPage detailspage = new DetailsPage();
    private ResultsPage resultspage = new ResultsPage();

    @Given("^the user is on the tax calculator page$")
    public void userOnThePage() {
        homepage.clearCookies();
        homepage.goTo();
    }

    @When("^the user fills in their \"([^\"]*)\" salary and all details$")
    public void userFillsInDetails(String time) {
        homepage.typeSalary();
        switch (time) {
            case "hourly":
                homepage.selectHourly();
                detailspage.typeHours();
                break;
            case "daily":
                homepage.selectDaily();
                detailspage.typeDays();
                break;
        }
        detailspage.selectNoStatePension();
        detailspage.ignoreTaxCode();
        detailspage.selectNoScottishTaxRate();
        detailspage.submitData();
    }

    @Then("^the user gets shown their take-home pay from their \"([^\"]*)\" salary$")
    public void takeHomePayDisplayed(String salary) {
        resultspage.verifyPayDisplayed(salary);
    }

    @And("^the user edits their data to a daily salary$")
    public void changeHourlySalaryToDailySalary(){
        resultspage.pressBack();
        detailspage.editSalary();
        homepage.typeSalary();
        homepage.selectDaily();
        detailspage.typeDays();
        detailspage.submitData();
    }

    @When("^the user submits no salary$")
    public void userSubmitsNoSalary(){
        homepage.typeEmptySalary();
    }

    @Then("^an error message appears$")
    public void noSalaryErrorMessage() {
        homepage.noSalaryErrorMessageVisible();
    }

    @When("^the user fills in their daily salary and types 8 days a week$")
    public void userSubmitsEightDayWeek() {
        homepage.typeSalary();
        homepage.selectDaily();
        detailspage.typeEightDays();
    }

    @Then("^a different error message appears$")
    public void wrongDaysErrorMessage() {
        detailspage.tooManyDaysErrorMessageVisible();
    }

}
