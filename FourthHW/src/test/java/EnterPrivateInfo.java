import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterPrivateInfo {
    public static void enterContact (String contactType, String text, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(By.cssSelector(".input.input_full.lk-cv-block__input.input_straight-bottom-right.input_straight-top-right.input_no-border-right.lk-cv-block__input_fake.lk-cv-block__input_select-fake.js-custom-select-presentation :last-of-type")).click();
/*        try {
            driver.findElement(By.cssSelector("[title=\""+contactType+"\"]")).click();
        } catch (Exception e) {
            enterSex(driver);
            driver.findElement(By.cssSelector(".input.input_full.lk-cv-block__input.input_straight-bottom-right.input_straight-top-right.input_no-border-right.lk-cv-block__input_fake.lk-cv-block__input_select-fake.js-custom-select-presentation :last-of-type")).click();
            driver.findElement(By.cssSelector("[title=\""+contactType+"\"]")).click();

        }*/
        driver.findElement(By.cssSelector("[title=\""+contactType+"\"]")).click();
        driver.findElement(By.cssSelector("[name=\"contact-0-value\"]:last-of-type")).sendKeys(text);
        driver.findElement(By.cssSelector(".lk-cv-block__action.lk-cv-block__action_md-no-spacing.js-formset-add.js-lk-cv-custom-select-add")).click();
        //data-value="skype"
    }
    public static void enterSex (WebDriver driver) {
        driver.findElement(By.cssSelector("#id_gender")).click();
        driver.findElement(By.cssSelector("option[value=\"m\"]")).click();
    }
    public static void enterMainInfo (WebDriver driver) {
        WebElement field = driver.findElement(By.cssSelector("[data-title=\"Фамилия\"]"));
        EnterText.enterText(field, driver, "asdadadads");
    }
}
