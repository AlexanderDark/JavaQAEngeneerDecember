import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PagesActions {
    public void openPage (String url, WebDriver driver) {
        driver.get(url);
    }
    public void enterText (WebElement webElement, String text, WebDriver driver) {
        driver.findElement((By) webElement).sendKeys("2342342424");
    }


}
