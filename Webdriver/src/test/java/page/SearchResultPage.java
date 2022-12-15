package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Waits;

import java.util.ArrayList;
import java.util.List;

public class SearchResultPage extends BasePage {

    private final String productsListXpath = "//span[contains(@class, 'current-price bfx-price')]";

    @FindBy(xpath = productsListXpath)
    private List<WebElement> productsList;

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public String getEmptySearchResultHeaderText() {
        String pageNameHeaderXpath = "//*[@class='pageName']";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, pageNameHeaderXpath).getText();
    }

    public List<String> getDescriptionOfCommonSearchResults() {
        ArrayList<String> itemDescriptionTextList = new ArrayList<>();
        for (WebElement productItem : productsList) {
            itemDescriptionTextList.add(productItem.getText());
        }
        return itemDescriptionTextList;
    }

    @Override
    protected SearchResultPage openPage() {
        throw new RuntimeException("Direct access to search results page is not needed");
    }
}
