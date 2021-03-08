import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

public class LogIn {
    public static void logInOtus (String name, String pass, WebDriver driver) throws InterruptedException {
        PagesActions pagesActions = new PagesActions();
        pagesActions.openPage("https://otus.ru", driver);
        driver.findElement(By.className("header2__auth js-open-modal")).click();
        driver.findElement(By.cssSelector(".new-input.new-input_full.js-placeholder.js-input.js-required.js-remove-form-error.new-input_border-no.js-email-input:first-of-type")).sendKeys("12312312313");
        Thread.sleep(3000);
        //pagesActions.enterText(webElement, name,driver);

    }

}
