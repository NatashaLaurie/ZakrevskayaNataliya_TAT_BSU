package test;

import model.Product;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.CartPage;
import page.ProductItemPage;
import page.WishListPage;
import service.ProductCreator;
import service.TestDataReader;

import static org.assertj.core.api.Assertions.assertThat;

public class CartTest extends CommonConditions {

    private static final String EXPECTED_ERROR_MESSAGE = TestDataReader.getTestData("testdata.error_message_text");
    public final String INCORRECT_PROMO_CODE = TestDataReader.getTestData("testdata.incorrect_promo_code");
    public final String INCORRECT_PROMO_CODE_MESSAGE = TestDataReader.getTestData("testdata.incorrect_promo_code_message");
    public final String EMPTY_BAG_MESSAGE = TestDataReader.getTestData("testdata.empty_bag_message");


    @BeforeMethod(onlyForGroups = {"addedItemToCartPrecondition"})
    public void addItemToCart() {
        new ProductItemPage(driver)
                .openPage()
                .addProductToCartWithSelectingSize();
    }

    @Test
    public void addToCartWithoutSelectingSize() {
        String errorMessage = new ProductItemPage(driver)
                .openPage()
                .addProductToCartWithoutSelectingSize()
                .getChoosingSizeErrorMessage();
        assertThat(errorMessage).isEqualTo(EXPECTED_ERROR_MESSAGE);
    }

    @Test
    public void addItemToCartTest() {
        Product expectedProduct = ProductCreator.withFullCredentialsFromProperty();
        new ProductItemPage(driver)
                .openPage()
                .addProductToCartWithSelectingSize();
        Product actualProduct = new CartPage(driver)
                .openPage()
                .getAddedProduct();
        assertThat(actualProduct).isEqualTo(expectedProduct);
    }

    @Test(groups = {"addedItemToCartPrecondition"})
    public void useIncorrectPromoCodeTest() {
        String promoCodeStatusMessage = new CartPage(driver)
                .openPage()
                .enterPromoCode(INCORRECT_PROMO_CODE)
                .getPromoCodeValidationMessage();
        assertThat(promoCodeStatusMessage).contains(INCORRECT_PROMO_CODE_MESSAGE);
    }

    @Test(groups = {"addedItemToCartPrecondition"})
    public void emptyCartTest() {
        String emptyCartMessage = new CartPage(driver)
                .openPage()
                .moveItemToWishList()
                .getEmptyBagMessage();
        assertThat(emptyCartMessage).contains(EMPTY_BAG_MESSAGE);
    }

    @Test(groups = {"addedItemToCartPrecondition"})
    public void moveToWishListTest() {
        Product expectedProduct = ProductCreator.withCredentialsFromProperty();
        new CartPage(driver)
                .openPage()
                .moveItemToWishList();
        Product actualProduct = new WishListPage(driver)
                .openPage()
                .getAddedProduct();
        assertThat(actualProduct).isEqualTo(expectedProduct);
    }

}
