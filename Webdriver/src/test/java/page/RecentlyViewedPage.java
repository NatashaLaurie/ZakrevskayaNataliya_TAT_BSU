package page;

import org.openqa.selenium.WebDriver;
import util.Waits;

public class RecentlyViewedPage extends BasePage {

    private static final String DR_MARTENS_RECENTLY_VIEWED_URL = "https://www.drmartens.com/uk/en_gb/recent?c=0&d=d\n";

    protected RecentlyViewedPage(WebDriver driver) {
        super(driver);
    }

    public String getRecentlyViewedProductName() {
        String recentlyViewedProductNameXpath = "//*[@id='recently-viewed-products']/div/div[2]/div[1]/a";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, recentlyViewedProductNameXpath).getText();
    }

    public RecentlyViewedPage openPage() {
        driver.get(DR_MARTENS_RECENTLY_VIEWED_URL);
        return this;
    }
}
