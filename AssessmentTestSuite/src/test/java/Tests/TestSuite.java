package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import config.DriverFactory;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Registration.class})
public class TestSuite {

    static DriverFactory driverFactory = new DriverFactory();

    @BeforeClass
    public static void suiteSetUp(){
    }


    @AfterClass
    public static void tearDown(){
        driverFactory.getDriver().quit();
    }

}
