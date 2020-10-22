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

    @Given("^the user is on the \"([^\"]*)\" page$")
    public void userOnThePage(String page) {
        homepage.clearCookies();
        homepage.goTo();
        switch (page) {
            case "tax calculator":
                break;
            case "tax estimate":
                homepage.typeSalary();
                homepage.selectHourly();
                detailspage.typeHours();
                detailspage.selectNoStatePension();
                detailspage.ignoreTaxCode();
                detailspage.selectNoScottishTaxRate();
                detailspage.submitData();
        }
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

    @Then("^the user gets shown their take-home pay \"([^\"]*)\"$")
    public void takeHomePayDisplayed(String salary) {
        resultspage.verifyPayDisplayed(salary);
    }

    @When("^the user submits no salary$")
    public void userSubmitsNoSalary(){
        homepage.typeEmptySalary();
    }

    @Then("^\"([^\"]*)\" error message appears$")
    public void errorMessage(String message) {
        switch (message) {
            case "no salary":
                homepage.noSalaryErrorMessageVisible();
                break;
            case "incorrect days":
                detailspage.tooManyDaysErrorMessageVisible();
                break;
        }
    }

    @When("^the user fills in their daily salary and types 8 days a week$")
    public void userSubmitsEightDayWeek() {
        homepage.typeSalary();
        homepage.selectDaily();
        detailspage.typeEightDays();
    }

}
