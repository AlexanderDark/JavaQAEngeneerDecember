package yandex_market;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.debugger.model.Paused;
import org.openqa.selenium.devtools.indexeddb.model.Key;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class yandex_market {
    protected static WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Test
    public void sravnenie () throws Exception {

        try {

            driver.get("https://www.220-volt.ru/");
            driver.findElement(By.cssSelector("[title=\"Электроинструменты\"]")).click();
            try {
                driver.findElement(By.cssSelector(".form-submit-default.city-offer-agree-btn")).click();
            } catch (Exception e) {
                e.printStackTrace();
            }
            WebDriverWait wait = new WebDriverWait(driver, 5);
            driver.findElement(By.cssSelector("[title=\"Перфораторы\"] > .box-block")).click();
            driver.findElement(By.cssSelector("[title=\"ЗУБР\"]")).click();
            driver.findElement(By.cssSelector("[title=\"MAKITA\"]")).click();
            driver.findElement(By.cssSelector("[value=\"Подобрать модель\"]")).click();
            WebElement element = driver.findElement(By.cssSelector(".double-filter.mhbspace-10.pspace-10"));
            wait.until(ExpectedConditions.visibilityOf(element));
            driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
            driver.findElement(By.cssSelector("ul.select2-results__options :first-child")).click();
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
            } catch (Exception e) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
            }
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
                } catch (Exception a) {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
                }
                    try {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
                    } catch (Exception b) {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
                    }


        } catch (Exception e) {
            System.out.println("ВЫЛЕЗ АЙФРЕЙМ! НАЧИНАЮ С НАЧАЛА, ЧТОБЫ НЕ ЗАДЕЙСТВОВАТЬ THREAD SLEEP!!!");
            WebElement frame = driver.findElement(By.cssSelector(".flocktory-widget-overlay:last-of-type > iframe"));
            driver.switchTo().frame(frame);
            driver.findElement(By.cssSelector(".close.js-close")).click();
            driver.switchTo().defaultContent();
            driver.get("https://www.220-volt.ru/");
            driver.findElement(By.cssSelector("[title=\"Электроинструменты\"]")).click();
            try {
                driver.findElement(By.cssSelector(".form-submit-default.city-offer-agree-btn")).click();
            } catch (Exception d) {
                d.printStackTrace();
            }
            WebDriverWait wait = new WebDriverWait(driver, 5);
            driver.findElement(By.cssSelector("[title=\"Перфораторы\"] > .box-block")).click();
            driver.findElement(By.cssSelector("[title=\"ЗУБР\"]")).click();
            driver.findElement(By.cssSelector("[title=\"MAKITA\"]")).click();
            driver.findElement(By.cssSelector("[value=\"Подобрать модель\"]")).click();
            WebElement element = driver.findElement(By.cssSelector(".double-filter.mhbspace-10.pspace-10"));
            wait.until(ExpectedConditions.visibilityOf(element));
            driver.findElement(By.cssSelector(".select2-selection__arrow")).click();
            driver.findElement(By.cssSelector("ul.select2-results__options :first-child")).click();
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
            } catch (Exception m) {
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
            }
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
                } catch (Exception a) {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
                }
                    try {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
                    } catch (Exception b) {
                        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
                    }
        }






        String urlOfList = driver.getCurrentUrl();
        driver.findElement(By.xpath("//*[@class=\"box-inline v-top\"]//*[@class=\"new-item-list-name\"]//*[contains(@title,\"ЗУБР\")]")).click();
        String urlZubr1 = driver.getCurrentUrl();
        driver.get(urlOfList);
        driver.findElement(By.xpath("//*[@class=\"box-inline v-top\"]//*[@class=\"new-item-list-name\"]//*[contains(@title,\"MAKITA\")]")).click();
        String urlMakita1 = driver.getCurrentUrl();
        driver.get(urlOfList);

        driver.findElement(By.xpath("//*[@class=\"box-inline v-top\"]//*[@class=\"new-item-list-name\"]//*[contains(@title,\"ЗУБР\")]/../../*[@class=\"new-item-list-compare custom-ui-compare compare\"]")).click();
        driver.findElement(By.cssSelector(".button.line.toCompare > .activeButton")).click();
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
        } catch (Exception b) {
            WebDriverWait wait = new WebDriverWait(driver, 5);

            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".double-filter.mhbspace-10.pspace-10")));
        }

        driver.findElement(By.xpath("//*[@class=\"box-inline v-top\"]//*[@class=\"new-item-list-name\"]//*[contains(@title,\"MAKITA\")]/../../*[@class=\"new-item-list-compare custom-ui-compare compare\"]")).click();
        driver.findElement(By.cssSelector(".linkContinueView")).click();
//НОВОЕ ОКНО БРАУЗЕРА
        try {
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            driver.findElement(By.cssSelector(".compareItem.area.inlineBl.ui-sortable-handle .colored.ecommerce-tracked-product-link")).click();
            driver.findElement(By.cssSelector(".compareItem.area.inlineBl.ui-sortable-handle:nth-of-type(2) .colored.ecommerce-tracked-product-link")).click();
            ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs3.get(2));
            String urlMakita2 = driver.getCurrentUrl();
            driver.switchTo().window(tabs3.get(3));
            String urlZubr2 = driver.getCurrentUrl();
            Assert.assertEquals(urlZubr1, urlZubr2);
            Assert.assertEquals(urlMakita1, urlMakita2);
        } catch (Exception h) {
            System.out.println("Вылез IFRAME! Закрываю и запускаю сравнение с начала!!!");
            WebElement frame = driver.findElement(By.cssSelector(".flocktory-widget-overlay:last-of-type > iframe"));
            driver.switchTo().frame(frame);
            driver.findElement(By.cssSelector(".close.js-close")).click();
            driver.switchTo().defaultContent();
            ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs2.get(1));
            driver.findElement(By.cssSelector(".compareItem.area.inlineBl.ui-sortable-handle .colored.ecommerce-tracked-product-link")).click();
            driver.findElement(By.cssSelector(".compareItem.area.inlineBl.ui-sortable-handle:nth-of-type(2) .colored.ecommerce-tracked-product-link")).click();
            ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(tabs3.get(2));
            String urlMakita2 = driver.getCurrentUrl();
            driver.switchTo().window(tabs3.get(3));
            String urlZubr2 = driver.getCurrentUrl();
            Assert.assertEquals(urlZubr1, urlZubr2);
            Assert.assertEquals(urlMakita1, urlMakita2);
        }
    }
    @After
    public void closeDriver () {
        if (driver != null) {
            driver.close();
        }
    }
}
