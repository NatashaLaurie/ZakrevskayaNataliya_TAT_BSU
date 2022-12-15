package page;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Waits;

public class RecentlyViewedPage extends BasePage {

    private final Logger log = LogManager.getRootLogger();
    private static final String DR_MARTENS_RECENTLY_VIEWED_URL = "https://www.drmartens.com/uk/en_gb/recent?c=0&d=d";

    protected RecentlyViewedPage(WebDriver driver) {
        super(driver);
    }

    public String getRecentlyViewedProductName() {
        try {
            String countryModelSubmitButtonXpath = "//*[@id='country-modal-submit']";
            WebElement countryModelSubmitButton = driver.findElement(By.xpath(countryModelSubmitButtonXpath));
            countryModelSubmitButton.click();
            Waits.waitForInvisibilityOfElementLocatedByXpath(driver, countryModelSubmitButtonXpath);
        } catch (Exception e) {
            log.log(Level.DEBUG, e.getMessage());
        }
        String recentlyViewedProductNameXpath = "//*[@id='recently-viewed-products']/div/div[2]/div[1]/a";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, recentlyViewedProductNameXpath).getText();
    }

    public RecentlyViewedPage openPage() {
        driver.get(DR_MARTENS_RECENTLY_VIEWED_URL);

        return this;
    }
}
