import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VtoroeDZ {
    protected static WebDriver driver;
    @Before
    public void setUo () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver =new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait webWait = new WebDriverWait(driver, 5);
    }
    @Test
    public void equalsTitle () {
        driver.get("https://yandex.ru");
        Assert.assertEquals("Яндекс", driver.getTitle());
    }
    @Test
    public void numbers () throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        WebElement webElement;
        String number;
        driver.get("https://msk.tele2.ru/shop/number");
        webElement = driver.findElement(By.cssSelector(".bundles-column:nth-of-type(1)"));
        driver.findElement(By.className("text-field")).sendKeys("97"+Keys.ENTER);
        try {
            wait.until(ExpectedConditions.stalenessOf(webElement));
        } catch (Exception e) {
            WebElement frame = driver.findElement(By.cssSelector("iframe"));
            driver.switchTo().frame(frame);
            driver.findElement(By.cssSelector(".close")).click();
            driver.switchTo().defaultContent();


        }
        for (int i=1; i<6; i++) {
            webElement = driver.findElement(By.cssSelector(".bundles-column:nth-of-type(" + i +")"));
            for (int j=1; j<5; j++) {
                number = driver.findElement(By.cssSelector(".bundles-column:nth-of-type(" + i +") .phone-number-block:nth-of-type("+j+") .phone-number > span"))
                                                                .getText();
                System.out.println(number);
                Assert.assertTrue((number.contains("97")|(number.contains("9-7"))));
            }
        }

    }
    @After
    public void closeDriver () {
        if (driver != null) {
            driver.close();
        }
    }
}
