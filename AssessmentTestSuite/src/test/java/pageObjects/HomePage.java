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

//
//    public void navigateToSignInPage() {
//        waitAndClick(SIGN_IN_BUTTON);
//    }
//
//    public void hoverOverItem() {
//
//        actions.moveToElement(driver.findElement(BLOUSE_IMAGE)).build().perform();
//
//        WebElement hoverView = driver.findElement(QUICK_VIEW_LINK);
//        Assert.assertTrue(elementIsVisible(hoverView));
//    }
//
//    public void clickMoreButton() {
//        waitAndClick(BLOUSE_IMAGE);
//    }
//
//
//    public void maximiseBrowserWindow() {
//        driver.manage().window().maximize();
//    }
//
//    public void addItemToCart() {
//        WebElement firstProductImage = driver.findElement(SECOND_PRODUCT_IMAGE);
//        WebElement firstProductQuickView = driver.findElement(SECOND_PRODUCT_QUICKVIEW);
//        actions
//                .moveToElement(firstProductImage)
//                .click(firstProductQuickView)
//                .perform();
//        waitAndClick(ADD_TO_CART_BUTTON);
//    }
//
//    public void addedToCart() {
//        waitUntilVisible(MODAL_WINDOW);
//        WebElement addedToCart = driver.findElement(MODAL_WINDOW);
//        Assert.assertTrue(elementIsVisible(addedToCart));
//    }
//
//
//    public void itemAddedToCart() {
//        maximiseBrowserWindow();
//        addItemToCart();
//        addedToCart();
//    }
//
//
//    public void clickCloseItemQuickview(){
//        waitAndClick(CLOSE_BUTTON_QUICKVIEW);
//    }
//
//    public void addPrintedDressToCart(){
//        WebElement printedDressImage = driver.findElement(PRINTED_DRESS_IMG);
//        WebElement printedDressQuickView = driver.findElement(CLICK_QUICK_VIEW);
//        actions
//                .moveToElement(printedDressImage)
//                .click(printedDressQuickView)
//                .perform();
//        waitAndClick(ADD_TO_CART_BUTTON);
//        waitAndClick(TO_CHECKOUT_BUTTON);
//    }
//
//    public void clickDresses() {
//        actions.moveToElement(driver.findElement(WOMEN_LINK)).build().perform();
//        waitAndClick(DRESSES_LINK);
//    }
//
//    public void clickOnBlouse() {
//        actions.moveToElement(driver.findElement(BLOUSE_IMAGE)).build().perform();
//        waitAndClick(BLOUSE_QUICKVIEW);
//    }
//
//    public void selectQuantity() {
//        waitAndClick(QUANTITY_UP_BUTTON);
//        waitAndClick(QUANTITY_UP_BUTTON);
//    }
//
//    public void clickWhite() {
//        new WebDriverWait(driver, 10).ignoring(StaleElementReferenceException.class).until((WebDriver d) -> {
//            d.findElement(WHITE_COLOUR).click();
//            return true;
//        });
//    }
//
//    public void subscribe() {
//        double number = Math.random();
//        findAndType(SUBSCRIBE_INPUT_BOX, String.format(number + "@test.com"));
//        waitAndClick(SUBSCRIBE_BUTTON);
//    }
//
//    public void verifySubscribe() {
//        WebElement message = driver.findElement(SUBSCRIPTON_MESSAGE);
//        Assert.assertEquals("You have successfully subscribed to this newsletter.", message.getText());
//    }
//
//    public void clickContactUs() { waitAndClick(CONTACT_US_LINK); }
//
//    public void clickSummerDresses() {
//        actions.moveToElement(driver.findElement(WOMEN_LINK)).build().perform();
//        waitAndClick(SUMMER_DRESSES_LINK);
//    }
//
//    public void searchForDress() {
//        findAndType(SEARCH_BAR, "dress");
//        waitAndClick(SEARCH_BUTTON);
//    }
//
//    public void addDifferentItemToCart() {
//        WebElement anotherProductImage = driver.findElement(ANOTHER_PRODUCT_IMAGE);
//        WebElement anotherProductQuickView = driver.findElement(ANOTHER_PRODUCT_QUICKVIEW);
//        actions
//                .moveToElement(anotherProductImage)
//                .click(anotherProductQuickView)
//                .perform();
//        waitAndClick(ADD_TO_CART_BUTTON);
//    }
//
//    public void clickCheckout() {
//        waitAndClick(CHECKOUT_BUTTON);
//    }
//
//    public void clickProduct() {waitAndClick(ANOTHER_PRODUCT_IMAGE); }
//
//    public void clickContinueShopping() {waitAndClick(CONTINUE_SHOPPING_BUTTON); }


}
