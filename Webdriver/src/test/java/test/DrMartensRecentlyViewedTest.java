package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.DrMartensProductsItemPage;

public class DrMartensRecentlyViewedTest {

    private static final String EXPECTED_RECENTLY_VIEWED_ITEM_NAME = "1460 SERENA WOMEN'S FAUX FUR-LINED LEATHER BOOTS";

    private WebDriver chromeDriver;
    private DrMartensProductsItemPage drMartensProductsItemPage;

    @BeforeClass
    public void chromeBrowserAndMainPageSetUp() {
        chromeDriver = new ChromeDriver();
        drMartensProductsItemPage = new DrMartensProductsItemPage(chromeDriver).openPage();
    }

    @Test
    public void displayRecentlyViewedItem() {
        Assert.assertEquals(drMartensProductsItemPage
                        .showRecentlyViewedProducts()
                        .getRecentlyViewedProductName(),
                EXPECTED_RECENTLY_VIEWED_ITEM_NAME);
    }

    @AfterClass
    public void chromeBrowserAndMainPageTearDown() {
        chromeDriver.quit();
        chromeDriver = null;
        drMartensProductsItemPage = null;
    }
}
