import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.findElement(By.cssSelector(cssSelector)).sendKeys("dara@gkomega.ru");
        cssSelector = "[type = \"password\"]";
        driver.findElement(By.cssSelector(cssSelector)).sendKeys("@3@N7vr7!cpW");
        cssSelector = ".new-input-line_relative .new-button_md[type = \"submit\"]";
        driver.findElement(By.cssSelector(cssSelector)).click();
    }
/*    @After
    public void clearDriver () {
        if (driver != null) {
            driver.close();
        }
    }*/
}
