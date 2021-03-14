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
    PagesActions pagesAction = new PagesActions();


    @Before
    public void mainSwtUp () {
        WebDriverType wDT;
        wDT = WebDriverType.CHROME;
        WebDriverFactory factory = new WebDriverFactory();
        driver = factory.createDriver(wDT);
        driver.manage().window().maximize();
        logger.info("Драйвер поднят!");
    }
    @Test
    public void mainOtusInfo () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        LogIn.logInOtus(login, pass, driver);
        LogIn.openInfo(driver);

        String value;
        value = driver.findElement(By.cssSelector("[data-title=\"Имя\"]")).getAttribute("value");
        if (value == "") {
            driver.findElement(By.cssSelector("[data-title=\"Фамилия\"]")).sendKeys("sdfsfsf");
            //driver.findElement((By) webElement).sendKeys("text");
        }

        EnterPrivateInfo.enterContact("Facebook", "myFacebook", driver);
        EnterPrivateInfo.enterSex(driver);
    }
    @After
    public void closeWebDriver () {
       // WebDriverFactory.closeDriver(driver);

    }
}
//nesito7589@nobitcoin.net
//1234abcd