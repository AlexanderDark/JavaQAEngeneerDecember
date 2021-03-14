import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterText {
    public static void enterText (WebElement webElement, WebDriver driver, String text) {
        String value;
        value = driver.findElement(By.cssSelector("[data-title=\"Фамилия\"]")).getText();
        if (value == "") {
            driver.findElement(By.cssSelector("[data-title=\"Фамилия\"]")).sendKeys("sdfsfsf");
            //driver.findElement((By) webElement).sendKeys("text");
        }
    }
}

