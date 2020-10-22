package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DetailsPage extends BasePage  {

    private PersonalDetails pd = getPersonalDetails();

    private static final By HOURS_INPUT_BOX = By.cssSelector("#how-many-a-week");
    private static final By CONTINUE_BUTTON = By.cssSelector("#button-continue");
    private static final By NO_STATE_PENSION_BUTTON = By.cssSelector("div:nth-child(2) > label");
    private static final By NO_SCOTTISH_TAX_BUTTON = By.cssSelector("div:nth-child(2) > label");
    private static final By SUBMIT_BUTTON = By.cssSelector("#button-get-results");
    private static final By DAYS_INPUT_BOX = By.cssSelector("#how-many-a-week");
    private static final By CHANGE_SALARY_BUTTON = By.cssSelector("div:nth-child(1) > dd.govuk-summary-list__actions > a");
    private static final By INCORRECT_DAYS_ERROR_MESSAGE = By.cssSelector("div.govuk-error-summary");

    public void typeHours(){
        findAndType(HOURS_INPUT_BOX, pd.getHours());
        waitAndClick(CONTINUE_BUTTON);
    }

    public void selectNoStatePension() {
        waitAndClick(NO_STATE_PENSION_BUTTON);
        waitAndClick(CONTINUE_BUTTON);
    }

    public void ignoreTaxCode() {
        waitAndClick(CONTINUE_BUTTON);
    }

    public void selectNoScottishTaxRate(){
        waitAndClick(NO_SCOTTISH_TAX_BUTTON);
        waitAndClick(CONTINUE_BUTTON);
    }

    public void submitData() {
        waitAndClick(SUBMIT_BUTTON);
    }

    public void typeDays() {
        findAndType(DAYS_INPUT_BOX, pd.getDays());
        waitAndClick(CONTINUE_BUTTON);
    }

    public void editSalary() {
        waitAndClick(CHANGE_SALARY_BUTTON);
    }

    public void typeEightDays() {
        findAndType(DAYS_INPUT_BOX, "8");
        waitAndClick(CONTINUE_BUTTON);
    }

    public void tooManyDaysErrorMessageVisible() {
        WebElement error = driver.findElement(INCORRECT_DAYS_ERROR_MESSAGE);
        Assert.assertTrue(elementIsVisible(error));
    }

}
