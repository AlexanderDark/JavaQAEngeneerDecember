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

        WebDriverWait wait = new WebDriverWait(driver, 5);
        PagesActions pagesAction = new PagesActions();
        try {
            pagesAction.openPage("https://otus.ru/lk/biography/personal/", driver);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".select.lk-cv-block__input.lk-cv-block__input_3.lk-cv-block__input_md-4.js-lk-cv-custom-select")));
        } catch (Exception e) {
            pagesAction.openPage("https://otus.ru/lk/biography/personal/", driver);

        }
        //driver.findElement(By.cssSelector(".select.lk-cv-block__input.lk-cv-block__input_3.lk-cv-block__input_md-4.js-lk-cv-custom-select")).click();
        driver.findElement(By.xpath("//span[contains(text(),\"Способ\")]")).click();
        driver.findElement(By.cssSelector("[data-value=\"facebook\"]")).click();
        driver.findElement(By.cssSelector("[name=\"contact-0-value\"]")).sendKeys("myFacebook");
        driver.findElement(By.cssSelector(".lk-cv-block__action.lk-cv-block__action_md-no-spacing.js-formset-add.js-lk-cv-custom-select-add")).click();


        ///EnterPrivateInfo.enterText("facebook", "myFacebook", driver);


    }
    @After
    public void closeWebDriver () {
       // WebDriverFactory.closeDriver(driver);

    }
}
//nesito7589@nobitcoin.net
//1234abcd