package page;

import model.Product;
import org.openqa.selenium.WebDriver;
import util.Waits;

public class WishListPage extends BasePage {

    public static String WISHLIST_PAGE_URL = "https://www.drmartens.com/us/en/wishlist";


    public WishListPage(WebDriver driver) {
        super(driver);
    }

    private String getProductName() {
        String productNameXpath = "//div[@class='wishlist__item__name']/a";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, productNameXpath).getText();
    }

    private String getProductPrice() {
        String productPriceXpath = "//div[@class='wishlist__item__price']/span";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, productPriceXpath).getText();
    }

    public Product getAddedProduct() {
        return new Product(getProductName(), getProductPrice());
    }


    @Override
    public WishListPage openPage() {
        driver.get(WISHLIST_PAGE_URL);
        return this;
    }
}
