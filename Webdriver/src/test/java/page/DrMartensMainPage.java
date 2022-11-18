package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DrMartensMainPage extends BasePage {
    private static final String DR_MARTENS_MAIN_PAGE_URL = "https://www.drmartens.com/uk/en_gb/";

    @FindBy(xpath = "//*[@id='js-site-search-input']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@id='country-modal-submit']")
    private WebElement countryModelSubmitButton;

    public DrMartensMainPage(WebDriver chromeDriver) {
        super(chromeDriver);
    }

    public DrMartensMainPage openPage() {
        chromeDriver.get(DR_MARTENS_MAIN_PAGE_URL);
        countryModelSubmitButton.click();
        new WebDriverWait(chromeDriver, WAIT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.invisibilityOf(countryModelSubmitButton));
        return this;
    }

    public DrMartensSearchResultPage searchForTerms(String term) {
        searchInput.sendKeys(term);
        searchInput.sendKeys(Keys.ENTER);
        return new DrMartensSearchResultPage(chromeDriver, term);
    }
}
