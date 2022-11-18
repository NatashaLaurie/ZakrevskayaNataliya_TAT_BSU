package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class DrMartensSearchResultPage extends BasePage {

    @FindBy(className = "pageName")
    private WebElement pageNameHeader;

    @FindBys({@FindBy(xpath = "//*[@id='product-list']/div/div")})
    private List<WebElement> productsList;

    public DrMartensSearchResultPage(WebDriver chromeDriver, String searchTerm) {
        super(chromeDriver);
    }

    public String getEmptySearchResultHeaderText() {
        return pageNameHeader.getText();
    }

    public int numberOfCommonSearchResults() {
        return productsList.size();
    }

    @Override
    protected BasePage openPage() {
        return null;
    }
}
