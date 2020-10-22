package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultsPage extends BasePage {

    private PersonalDetails pd = getPersonalDetails();

    private static final By GREEN_BOX_TEXT = By.cssSelector("#YEARLY > div > div");
    private static final By BACK_BUTTON = By.cssSelector("div:nth-child(5) > a");
    private static final By MONTH_TAB_BUTTON = By.cssSelector("#main-content li:nth-child(2) > a");
    private static final By MONTHLY_GREEN_BOX_TEXT = By.cssSelector("#MONTHLY > div > div");
    private static final By START_AGAIN_BUTTON = By.cssSelector("#restart-button");
    private static final By FEEDBACK_LINK = By.cssSelector("p:nth-child(7) > a");

    public void verifyPayDisplayed(String salary) {
        WebElement description = driver.findElement(GREEN_BOX_TEXT);
        switch (salary) {
            case "from their hourly salary":
                Assert.assertEquals("Your estimated take-home pay for 2020 is\n" +
                        "£14,249.80 a year", description.getText());
                break;
            case "from their daily salary":
                Assert.assertEquals("Your estimated take-home pay for 2020 is\n" +
                        "£2,600 a year", description.getText());
                break;
            case "on a monthly basis":
                WebElement monthlyText = driver.findElement(MONTHLY_GREEN_BOX_TEXT);
                Assert.assertEquals("Your estimated take-home pay for 2020 is\n" +
                        "£1,187.48 a month", monthlyText.getText());
                break;
        }
    }

    public void pressBack() {
        waitAndClick(BACK_BUTTON);
    }

    public void clickMonthTab() {
        waitAndClick(MONTH_TAB_BUTTON);
    }

    public void verifyMonthlyEstimateVisible() {
        WebElement description = driver.findElement(MONTHLY_GREEN_BOX_TEXT);
                Assert.assertEquals("Your estimated take-home pay for 2020 is\n" +
                        "£1,187.48 a month", description.getText());
    }

    public void clickStartAgain() {
        waitAndClick(START_AGAIN_BUTTON);
    }

    public void clickFeedbackLink() {
        waitAndClick(FEEDBACK_LINK);
    }

    public void verifyFeedbackFormLoaded() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.tax.service.gov.uk/contact/beta-feedback-unauthenticated?service=PayeTaxCalculator", url);
    }

}


