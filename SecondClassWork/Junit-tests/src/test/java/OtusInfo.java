import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OtusInfo {
    protected static WebDriver driver;
    @Before
    public void setup () {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void openUrl () {
        driver.get("https://design.1cmaker.com/login");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("alexanderdark@gmail.com");
        driver.findElement(By.id("password")).sendKeys("ChUrKiVgOrI");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.className("MuiButton-label")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//p[contains(text(),‘Последнее изменение’)]/../div[1]//div[2]")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        /*driver.get("https://otus.ru");
        driver.findElement(By.className("header2__auth-reg")).click();
        String cssSelector = ".js-input[placeholder = \"Электронная почта\"]";
        driver.findElement(By.cssSelector(cssSelector)).sendKeys("dara@gkomega.ru");
        cssSelector = "[type = \"password\"]";
        driver.findElement(By.cssSelector(cssSelector)).sendKeys("@3@N7vr7!cpW");
        cssSelector = ".new-input-line_relative .new-button_md[type = \"submit\"]";
        driver.findElement(By.cssSelector(cssSelector)).click();*/
    }
/*    @After
    public void clearDriver () {
        if (driver != null) {
            driver.close();
        }
    }*/
}
