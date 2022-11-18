package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.DrMartensMainPage;


public class DrMartensSearchResultTest {

    private static final String EXPECTED_EMPTY_SEARCH_RESULT_HEADER = "EMPTY SEARCH RESULT";
    private static final String SEARCH_TERM_FOR_COMMON_RESULT = "platform";
    private static final Object[][] TERMS_FOR_EMPTY_SEARCH_RESULT = new Object[][]{{"fffffff"}, {""}, {"a"}};

    private WebDriver chromeDriver;
    private DrMartensMainPage drMartensMainPage;

    @BeforeClass
    public void chromeBrowserAndMainPageSetUp() {
        chromeDriver = new ChromeDriver();
        drMartensMainPage = new DrMartensMainPage(chromeDriver).openPage();
    }

    @DataProvider(name = "termsForEmptySearchResult")
    public Object[][] initData() {
        return TERMS_FOR_EMPTY_SEARCH_RESULT;
    }

    @Test(dataProvider = "termsForEmptySearchResult")
    public void handleEmptySearchResult(String term) {
        Assert.assertEquals(drMartensMainPage.searchForTerms(term).getEmptySearchResultHeaderText(),
                EXPECTED_EMPTY_SEARCH_RESULT_HEADER);
    }

    @Test
    public void handleCommonSearchResult() {
        int numberOfCommonSearchResults = drMartensMainPage
                .searchForTerms(SEARCH_TERM_FOR_COMMON_RESULT)
                .numberOfCommonSearchResults();
        Assert.assertTrue(numberOfCommonSearchResults > 0,
                "Search result for " + SEARCH_TERM_FOR_COMMON_RESULT + " is empty!");

    }

    @AfterClass
    public void chromeBrowserAndMainPageTearDown() {
        chromeDriver.quit();
        chromeDriver = null;
        drMartensMainPage = null;
    }
}
