import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class VtoroeDZ {
    protected static WebDriver driver;
    @Before
    public void setUo () {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver =new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test
    public void equalsTitle () {
        driver.get("https://yandex.ru");
        Assert.assertEquals("Яндекс", driver.getTitle());
    }
    @Test
    public void numbers () {
        driver.get("https://msk.tele2.ru/shop/number");
        driver.findElement(By.id("searchNumber")).sendKeys("97"+ Keys.ENTER);
        WebElement explicitWait = (new WebDriverWait(driver, 3))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("number-box")));
    }
    @After
    public void closeDriver () {
        if (driver != null) {
            driver.close();
        }
    }
}
