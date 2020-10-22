package stepdefs;

import config.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class TaxResultsStepDef {

    private HomePage homepage = new HomePage();
    private DetailsPage detailspage = new DetailsPage();
    private ResultsPage resultspage = new ResultsPage();

    @When("^the user edits their data to a daily salary$")
    public void changeHourlySalaryToDailySalary(){
        resultspage.pressBack();
        detailspage.editSalary();
        homepage.typeSalary();
        homepage.selectDaily();
        detailspage.typeDays();
        detailspage.submitData();
    }

//    @Given("^the user is on the tax estimate page$")
//    public void userOnResultsPage() {
//        homepage.clearCookies();
//        homepage.goTo();
//        homepage.typeSalary();
//        homepage.selectHourly();
//        detailspage.typeHours();
//        detailspage.selectNoStatePension();
//        detailspage.ignoreTaxCode();
//        detailspage.selectNoScottishTaxRate();
//        detailspage.submitData();
//    }

//    @When("^the user selects monthly pay tab$")
//    public void clickMonthlyTab() {
//        resultspage.clickMonthTab();
//    }

    @When("^the user clicks \"([^\"]*)\"$")
    public void clickButton(String link) {
        switch (link) {
            case "start again":
                resultspage.clickStartAgain();
                break;
            case "monthly pay tab":
                resultspage.clickMonthTab();
                break;
        }
    }

    @Then("^the user should be on the home page$")
    public void userOnHomePage() {
        homepage.verifyOnHomePage();
    }

}
