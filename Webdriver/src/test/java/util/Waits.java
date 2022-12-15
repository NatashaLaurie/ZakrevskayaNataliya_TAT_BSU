package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    private static final Duration WAIT_TIMEOUT_SECONDS = Duration.ofSeconds(20);

    public static WebElement waitForPresenceOfElementLocatedByXpath(WebDriver driver, String elementXpath) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath(elementXpath)));
    }


    public static WebElement waitForVisibilityOfElementLocatedByXpath(WebDriver driver, String elementXpath) {
        return new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions
                        .visibilityOfElementLocated(By.xpath(elementXpath)));
    }


    public static void waitForInvisibilityOfElementLocatedByXpath(WebDriver driver, String elementXpath) {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions
                        .invisibilityOfElementLocated(By.xpath(elementXpath)));
    }
}
