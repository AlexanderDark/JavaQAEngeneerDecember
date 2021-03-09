import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestVvodaOtus {
    String name = System.getProperty("name");
    String pass = System.getProperty("pass");
    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(TestVvodaOtus.class);


    @Before
    public void mainSwtUp () {
        WebDriverType wDT;
        wDT = WebDriverType.CHROME;
        WebDriverFactory factory = new WebDriverFactory();
        driver = factory.createDriver(wDT);
    }
    @Test
    public void mainOtusInfo () throws InterruptedException {
        LogIn.logInOtus(name, pass, driver);

    }
    @After
    public void closeWebDriver () {
        WebDriverFactory.closeDriver(driver);

    }
}
