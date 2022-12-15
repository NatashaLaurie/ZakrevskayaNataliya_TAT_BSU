package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Waits;

public class ProductItemPage extends BasePage {

    private static final String DR_MARTENS_PRODUCTS_ITEM_PAGE_URL = "https://www.drmartens.com/us/en/1461-smooth-leather-oxford-shoes-/p/11838002";
    private final String recentlyViewedIconXpath = "//a[@class='js-recently-viewed']";
    private final String countryModelSubmitButtonXpath = "//*[@id='country-modal-submit']";
    private final String addToBagButtonXpath = "//*[@id='addToCartButton']";
    private final String sizeButtonXpath = "//*[@id='sizeSelector']//button[contains(@class, 'stock-inStock product-size ') and span[text()='5']]";


    @FindBy(xpath = recentlyViewedIconXpath)
    private WebElement recentlyViewedIcon;

    @FindBy(xpath = countryModelSubmitButtonXpath)
    private WebElement countryModelSubmitButton;

    @FindBy(xpath = addToBagButtonXpath)
    private WebElement addToBagButton;

    @FindBy(xpath = sizeButtonXpath)
    private WebElement sizeButton;


    public ProductItemPage(WebDriver driver) {
        super(driver);
    }

    public RecentlyViewedPage showRecentlyViewedProducts() {
        recentlyViewedIcon.click();
        return new RecentlyViewedPage(driver).openPage();
    }


    public void addProductToCartWithSelectingSize() {
        executor.executeScript("arguments[0].click()", sizeButton);
        executor.executeScript("arguments[0].click()", addToBagButton);
    }

    public ProductItemPage addProductToCartWithoutSelectingSize() {
        executor.executeScript("arguments[0].click()", addToBagButton);
        return this;
    }

    public String getChoosingSizeErrorMessage() {
        String errorMessageXpath = "//*[@id='pdp-error-msg']";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, errorMessageXpath).getText();
    }

    @Override
    public ProductItemPage openPage() {
        driver.get(DR_MARTENS_PRODUCTS_ITEM_PAGE_URL);
        countryModelSubmitButton.click();
        Waits.waitForInvisibilityOfElementLocatedByXpath(driver, countryModelSubmitButtonXpath);
        return this;
    }


}
