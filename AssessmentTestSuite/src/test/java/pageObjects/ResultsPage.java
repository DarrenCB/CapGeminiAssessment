package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultsPage extends BasePage {

    private PersonalDetails pd = getPersonalDetails();

    private static final By GREEN_BOX_TEXT = By.cssSelector("#YEARLY > div > div");
    private static final By BACK_BUTTON = By.cssSelector("div:nth-child(5) > a");

    public void verifyPayDisplayed(String salary) {
        WebElement description = driver.findElement(GREEN_BOX_TEXT);
        switch (salary) {
            case "hourly":
                Assert.assertEquals("Your estimated take-home pay for 2020 is\n" +
                        "£14,249.80 a year", description.getText());
                break;
            case "daily":
                Assert.assertEquals("Your estimated take-home pay for 2020 is\n" +
                        "£2,600 a year", description.getText());
                break;
        }
    }

    public void pressBack() {
        waitAndClick(BACK_BUTTON);
    }

}


