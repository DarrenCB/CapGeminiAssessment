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

    @When("^the user fills in all their details$")
    public void userFillsInDetails() {
        homepage.typeSalary();
        homepage.selectHourly();
        detailspage.typeHours();
        detailspage.selectNoStatePension();
        detailspage.ignoreTaxCode();
        detailspage.selectNoScottishTaxRate();
        detailspage.submitData();
    }

    @Then("^the user should get shown their take-home pay$")
    public void takeHomePayDisplayed() {
        resultspage.verifyPayDisplayed();
    }

}