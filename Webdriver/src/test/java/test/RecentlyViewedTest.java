package test;

import org.testng.annotations.Test;
import page.ProductItemPage;
import service.TestDataReader;

import static org.assertj.core.api.Assertions.assertThat;

public class RecentlyViewedTest extends CommonConditions {

    private static final String EXPECTED_RECENTLY_VIEWED_ITEM_NAME = TestDataReader.getTestData("testdata.recently_viewed_item_name");

    @Test
    public void displayRecentlyViewedItem() {
        String recentlyViewedItemName = new ProductItemPage(driver)
                .openPage()
                .showRecentlyViewedProducts()
                .getRecentlyViewedProductName();
        assertThat(recentlyViewedItemName).isEqualTo(EXPECTED_RECENTLY_VIEWED_ITEM_NAME);
    }

}
