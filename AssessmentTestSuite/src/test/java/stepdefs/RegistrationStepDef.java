package stepdefs;



import config.DriverFactory;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class RegistrationStepDef {


    private HomePage homepage = new HomePage();

    @Given("^the user is on the \"([^\"]*)\" page$")
    public void theUserOnThePage(String page) {
        homepage.clearCookies();
        homepage.goTo();
        switch (page) {
            case "sign in":
                homepage.navigateToSignInPage();
                break;
            case "home":
                homepage.maximiseBrowserWindow();
                break;
            case "product":
                homepage.maximiseBrowserWindow();
                break;
            case "dresses":
                homepage.clickDresses();
                break;
            case "summer dresses":
                homepage.clickSummerDresses();
                break;
            case "account":
                homepage.navigateToSignInPage();
                break;
            default:
                throw new IllegalArgumentException("Unrecognised page provided");
        }

    }

    @When("^the user completes the registration form with \"([^\"]*)\"$")
    public void registrationForm(String combo) {
        switch (combo) {
            case "a registered email address":
                break;
            case "an unregistered email address":
                break;
            case "an unregistered email address and a name with numeric values":
                double num1 = Math.random();
                break;
            case "an unregistered email address and a password with numeric values":
                double num2 = Math.random();
                break;
            case "a registered email address and an invalid birthdate":
                break;
            default:
                throw new IllegalArgumentException("Unrecognised registration details");
        }
    }

    @Then("^the user is registered and the account page is displayed$")
    public void userRegisteredAndAccountDisplayed() {
    }

}















