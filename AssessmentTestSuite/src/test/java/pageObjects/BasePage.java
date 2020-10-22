package pageObjects;

import config.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

abstract class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    private PersonalDetails pd = new PersonalDetails("Bob", "10", "30", "5");

    BasePage() {
        driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, 20);
    }

    void waitAndClick(By selector) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(selector));
        element.click();
    }

    boolean elementIsVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (ElementNotVisibleException e) {
            return false;
        }
    }

    void findAndType(By elementSelector, String inputString) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elementSelector));
        element.clear();
        element.sendKeys(inputString);
    }

    public PersonalDetails getPersonalDetails() {
        return pd;
    }

    public void clearCookies(){
        driver.manage().deleteAllCookies();
    }

}
