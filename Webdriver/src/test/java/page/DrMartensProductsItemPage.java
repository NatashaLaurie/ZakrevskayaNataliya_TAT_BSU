package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DrMartensProductsItemPage extends BasePage {

    private static final String DR_MARTENS_PRODUCTS_ITEM_PAGE_URL = "https://www.drmartens.com/us/en/1460-serena-women%27s-faux-fur-lined-leather-boots/p/27782225";

    @FindBy(xpath = "//a[@class='js-recently-viewed']")
    private WebElement recentlyViewedIcon;

    @FindBy(xpath = "//*[@id='country-modal-submit']")
    private WebElement countryModelSubmitButton;

    public DrMartensProductsItemPage(WebDriver chromeDriver) {
        super(chromeDriver);
    }

    public DrMartensProductsItemPage openPage() {
        chromeDriver.get(DR_MARTENS_PRODUCTS_ITEM_PAGE_URL);
        countryModelSubmitButton.click();
        new WebDriverWait(chromeDriver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.invisibilityOf(countryModelSubmitButton));
        return this;
    }

    public DrMartensRecentlyViewedPage showRecentlyViewedProducts() {
        recentlyViewedIcon.click();
        return new DrMartensRecentlyViewedPage(chromeDriver).openPage();
    }
}
