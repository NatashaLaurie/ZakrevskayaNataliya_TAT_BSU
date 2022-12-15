package page;

import model.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Waits;

public class CartPage extends BasePage {

    public static String CART_PAGE_URL = "https://www.drmartens.com/us/en/cart";

    private final String moveToWishListButtonXpath = "//button[@class='item__move-wishlist']";
    private final String openPromoCodeFieldButtonXpath = "//button[@class='js-accordion-call accordion-arrow']";
    private final String promoCodeInputFieldXpath = "//*[@id='js-voucher-code-text']";
    private final String applyPromoCodeButtonXpath = "//*[@id='js-voucher-apply-btn']";

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = openPromoCodeFieldButtonXpath)
    private WebElement openPromoCodeFieldButton;

    @FindBy(xpath = promoCodeInputFieldXpath)
    private WebElement promoCodeInputField;

    @FindBy(xpath = applyPromoCodeButtonXpath)
    private WebElement applyPromoCodeButton;

    @FindBy(xpath = moveToWishListButtonXpath)
    private WebElement moveToWishListButton;


    private String getProductName() {
        String productNameXpath = "//a[@class='bfx-product-name']";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, productNameXpath).getText();
    }

    private String getProductPrice() {
        String productPriceXpath = "//p[@class='item__price entrySinglePrice bfx-price bfx-list-price ']";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, productPriceXpath).getText();
    }

    private String getProductSize() {
        String productSizeXpath = "//p[@class='size__wrapper bfx-product-size']";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, productSizeXpath).getText();
    }

    private String getProductColor() {
        String productColorXpath = "//p[@class='colour__wrapper']";
        return Waits.waitForPresenceOfElementLocatedByXpath(driver, productColorXpath).getText();
    }

    public Product getAddedProduct() {
        return new Product(getProductName(), getProductPrice(), getProductSize(), getProductColor());
    }

    public CartPage enterPromoCode(String promoCode) {
        openPromoCodeFieldButton.click();
        promoCodeInputField.sendKeys(promoCode);
        applyPromoCodeButton.click();
        return this;
    }

    public MainPage moveItemToWishList() {
        moveToWishListButton.click();
        return new MainPage(driver);
    }

    public String getPromoCodeValidationMessage() {
        String promoCodeValidationMessageXpath = "//*[@id=\"applyVoucherForm\"]/div/div[1]/div/div";
        return Waits.waitForVisibilityOfElementLocatedByXpath(driver, promoCodeValidationMessageXpath).getText();
    }

    @Override
    public CartPage openPage() {
        driver.get(CART_PAGE_URL);
        return this;
    }
}
