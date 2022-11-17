package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DrMartensRecentlyViewedPage extends BasePage {

    @FindBy(xpath = "//*[@id='recently-viewed-products']/div/div[2]/div[1]/a")
    WebElement recentlyViewedProductName;

    protected DrMartensRecentlyViewedPage(WebDriver chromeDriver) {
        super(chromeDriver);
    }

    public String getRecentlyViewedProductName() {
        return recentlyViewedProductName.getText();
    }

    public DrMartensRecentlyViewedPage openPage() {
        new WebDriverWait(chromeDriver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(recentlyViewedProductName));
        return this;
    }
}
