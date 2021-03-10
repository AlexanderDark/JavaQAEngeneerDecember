import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestVvodaOtus {
    String login = System.getProperty("login");
    String pass = System.getProperty("pass");
    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(TestVvodaOtus.class);


    @Before
    public void mainSwtUp () {
        WebDriverType wDT;
        wDT = WebDriverType.CHROME;
        WebDriverFactory factory = new WebDriverFactory();
        driver = factory.createDriver(wDT);
        logger.info("Драйвер поднят!");
    }
    @Test
    public void mainOtusInfo () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LogIn.logInOtus(login, pass, driver);
        EnterPrivateInfo.enterText("facebook", "myFacebook", driver);


    }
    @After
    public void closeWebDriver () {
       // WebDriverFactory.closeDriver(driver);

    }
}
//nesito7589@nobitcoin.net
//1234abcd