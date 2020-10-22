package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultsPage extends BasePage {

    private PersonalDetails pd = getPersonalDetails();

    private static final By GREEN_BOX_TEXT = By.cssSelector("#YEARLY > div > div");

    public void verifyPayDisplayed() {
        WebElement description = driver.findElement(GREEN_BOX_TEXT);
        Assert.assertEquals("Your estimated take-home pay for 2020 is\n" +
                "£14,249.80 a year", description.getText());
    }

}


