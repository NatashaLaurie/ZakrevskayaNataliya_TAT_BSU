package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Waits;

public class MainPage extends BasePage {
    private static final String DR_MARTENS_MAIN_PAGE_URL = "https://www.drmartens.com/uk/en_gb/";
    private final String searchInputXpath = "//*[@id='js-site-search-input']";
    private final String countryModelSubmitButtonXpath = "//*[@id='country-modal-submit']";

    @FindBy(xpath = searchInputXpath)
    private WebElement searchInput;

    @FindBy(xpath = countryModelSubmitButtonXpath)
    private WebElement countryModelSubmitButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage openPage() {
        driver.get(DR_MARTENS_MAIN_PAGE_URL);
        countryModelSubmitButton.click();
        Waits.waitForInvisibilityOfElementLocatedByXpath(driver, countryModelSubmitButtonXpath);
        return this;
    }

    public SearchResultPage searchForTerms(String term) {
        Waits.waitForPresenceOfElementLocatedByXpath(driver, searchInputXpath);
        searchInput.sendKeys(term);
        searchInput.sendKeys(Keys.ENTER);
        return new SearchResultPage(driver);
    }

    public String getEmptyBagMessage() {
        String emptyBagAlertMessageXpath = "//div[@class='toast-alert-warning']/div";
        return Waits.waitForVisibilityOfElementLocatedByXpath(driver, emptyBagAlertMessageXpath).getText();
    }
}
