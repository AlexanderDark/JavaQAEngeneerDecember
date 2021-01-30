import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.get("https://otus.ru");
        driver.findElement(By.className("header2__auth-reg")).click();
        String cssSelector = ".js-input[placeholder = \"Электронная почта\"]";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector(cssSelector)).sendKeys("dara@gkomega.ru");
        cssSelector = "[type = \"password\"]";
        driver.findElement(By.cssSelector(cssSelector)).sendKeys("@3@N7vr7!cpW");
        cssSelector = ".new-input-line_relative .new-button_md[type = \"submit\"]";
        driver.findElement(By.cssSelector(cssSelector)).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://otus.ru/lk/biography/personal");
        driver.get("https://otus.ru/lk/biography/personal");
        driver.findElement(By.name("date_of_birth")).sendKeys("03.01.1989"+ Keys.ENTER);
        /*driver.findElement(By.cssSelector("#id_ready_to_relocate_1 .radio__label :first-child")).click();*/
        driver.findElement(By.cssSelector("[data-ajax-slave=\"/lk/biography/cv/lookup/cities/by_country/\"] [title=\"Россия\"]")).click();
        driver.findElement(By.cssSelector("[title=\"Сохранить и заполнить позже\"]")).click();
    }
/*    @After
    public void clearDriver () {
        if (driver != null) {
            driver.close();
        }
    }*/
}
