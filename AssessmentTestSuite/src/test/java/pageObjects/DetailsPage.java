package pageObjects;

import org.openqa.selenium.By;

public class DetailsPage extends BasePage  {

    private PersonalDetails pd = getPersonalDetails();

    private static final By HOURS_INPUT_BOX = By.cssSelector("#how-many-a-week");
    private static final By CONTINUE_BUTTON = By.cssSelector("#button-continue");
    private static final By NO_STATE_PENSION_BUTTON = By.cssSelector("div:nth-child(2) > label");
    private static final By NO_SCOTTISH_TAX_BUTTON = By.cssSelector("div:nth-child(2) > label");
    private static final By SUBMIT_BUTTON = By.cssSelector("#button-get-results");

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

}
