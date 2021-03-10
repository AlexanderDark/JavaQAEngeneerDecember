import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterPrivateInfo {
    public static void enterText (String contactType, String text, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        PagesActions pagesAction = new PagesActions();
        try {
            pagesAction.openPage("https://otus.ru/lk/biography/personal/", driver);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".select.lk-cv-block__input.lk-cv-block__input_3.lk-cv-block__input_md-4.js-lk-cv-custom-select")));
        } catch (Exception e) {
            pagesAction.openPage("https://otus.ru/lk/biography/personal/", driver);

        }
        //driver.findElement(By.cssSelector(".select.lk-cv-block__input.lk-cv-block__input_3.lk-cv-block__input_md-4.js-lk-cv-custom-select")).click();
        driver.findElement(By.xpath("//*[@class=\"select lk-cv-block__input lk-cv-block__input_3 lk-cv-block__input_md-4 js-lk-cv-custom-select\"]//..//*[contains(@span,\"Способ связи\")]")).click();
        driver.findElement(By.cssSelector("[data-value=\""+contactType+"\"]")).click();
        driver.findElement(By.cssSelector("[name=\"contact-0-value\"]")).sendKeys(text);
        driver.findElement(By.cssSelector(".lk-cv-block__action.lk-cv-block__action_md-no-spacing.js-formset-add.js-lk-cv-custom-select-add")).click();
        driver.findElement(By.xpath("//*[@class=\"box-inline v-top\"]//*[@class=\"new-item-list-name\"]//*[contains(@title,\"ЗУБР\")]")).click();
        //data-value="skype"
    }

}
