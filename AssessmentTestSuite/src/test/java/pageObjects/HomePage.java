package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    private static String URL = "https://www.tax.service.gov.uk/estimate-paye-take-home-pay/your-pay";
    private Actions actions = new Actions(driver);
    private PersonalDetails pd = getPersonalDetails();

    private static final By SALARY_INPUT_BOX = By.cssSelector("#amount");
    private static final By HOURLY_BUTTON = By.cssSelector("div:nth-child(1) > label");
    private static final By CONTINUE_BUTTON = By.cssSelector("#button-continue");
    private static final By DAILY_BUTTON = By.cssSelector("div > div:nth-child(2) > label");
    private static final By NO_SALARY_ERROR_MESSAGE = By.cssSelector("div.govuk-error-summary");

    public void goTo() {
        driver.get(URL);
    }

    public void typeSalary() {
        findAndType(SALARY_INPUT_BOX, pd.getSalary());
    }

    public void selectHourly() {
        waitAndClick(HOURLY_BUTTON);
        waitAndClick(CONTINUE_BUTTON);
    }

    public void selectDaily() {
        waitAndClick(DAILY_BUTTON);
        waitAndClick(CONTINUE_BUTTON);
    }

    public void typeEmptySalary() {
        findAndType(SALARY_INPUT_BOX, "0");
        waitAndClick(CONTINUE_BUTTON);
    }

    public void noSalaryErrorMessageVisible() {
        WebElement error = driver.findElement(NO_SALARY_ERROR_MESSAGE);
        Assert.assertTrue(elementIsVisible(error));
    }

    public void verifyOnHomePage() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.tax.service.gov.uk/estimate-paye-take-home-pay/your-pay", url);
    }


}
