package service;

import model.Product;

public class ProductCreator {
    public static final String PRODUCT_NAME = "testdata.product.name";
    public static final String PRODUCT_PRICE = "testdata.product.price";
    public static final String PRODUCT_SIZE = "testdata.product.size";
    public static final String PRODUCT_COLOR = "testdata.product.color";

    public static Product withFullCredentialsFromProperty() {
        return new Product(TestDataReader.getTestData(PRODUCT_NAME),
                TestDataReader.getTestData(PRODUCT_PRICE), TestDataReader.getTestData(PRODUCT_SIZE),
                TestDataReader.getTestData(PRODUCT_COLOR));
    }

    public static Product withCredentialsFromProperty() {
        return new Product(TestDataReader.getTestData(PRODUCT_NAME),
                TestDataReader.getTestData(PRODUCT_PRICE));
    }
}
