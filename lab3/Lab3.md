[Dr.Martens](https://www.drmartens.com)
# Functional Test Cases 
## Test Case 1: 
| Id: | 1  |
| :--- | :----------- |
| Name: | Adding product's items to the shopping cart  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/   |
| Steps: | 1. Click the Woman category in the Header |
||2. Hover over the any image of product's item |
||3. Click on "Add to bag" button |
||4. Select size of product's item |
| Expected result:| Popup with "Checkout" and "Continue shopping" buttons is displayed. Product item is added to the shopping cart. |
| Result: |  |

## Test Case 2: 
| Id: | 2  |
| :--- | :----------- |
| Name: | Moving product's items to the wishlist  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/, at least 1 product's item is added to the shopping cart   |
| Steps: | 1. Click on the shopping cart in the header |
||2. Click on the "MOVE TO WISHLIST" button under the product's item |
| Expected result:| The product's item is removed from the shopping cart. The heart icon has changed color to yellow. The product's item is added to wishlist |
| Result: |  |

## Test Case 3: 
| Id: | 3  |
| :--- | :----------- |
| Name: | Checkout of product's item  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127|
|| Opened https://www.drmartens.com/|
|| At least 1 product's item is added to the shopping cart  |


|   | Steps  | Expected results |
|:------------- |:---------------|:-------------|
| 1 | Hover on the shopping cart in the header | Shopping cart with added item and "Checkout" button is displayed |
| 2 | Click on the "Checkout" button |  The shopping cart page is opened   |
| 3 | Click on the "Checkout" button and select "Checkout as a guest" | The shipping and billing page is opened  |
| 4 | Fill in correct data and click "Continue to payment" button | The payment page is opened  |
| 5 | Select credit / debet card payment method | Credit cart credentials fields are displayed |
| 6 | Enter credit cart credentials and click "Place order" button | The order is placement  |


# Localization Test Cases 
## Test Case 1: 
| Id: | Country-1  |
| :--- | :----------- |
| Name: | Check that currency matches with selected currency of selected country  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/   |
| Steps: | 1. Select country from country list except from  “Rest of World”. |
||2. Pay attention to the currency of the selected country |
||3. Select any product from shop |
| Expected result:| Price for product should match with currency that was on a Country list |
| Result: |  |
   
## Test Case 2: 
| Id: | Country-2  |
| :--- | :----------- |
| Name: | Goods that we show to the user correspond to the goods of the selected region  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/   |
| Steps: | 1. Select country from country list |
||2. Open database of selected country |
||3. Check that products that we show to client on Web page matches with products in database of selected country  |
| Expected result:| Products in database of selected country matches with products on client web page |
| Result: |  |

## Test Case 3: 
| Id: | Country-3  |
| :--- | :----------- |
| Name: | Check that language matches with language of selected country  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/   |
| Steps: | 1. Select country from country list |
||2. Pay attention to the language of the selected country |
||3. Check the page language  |
| Expected result:| The page has been translated into the language of the selected country |
| Result: |  |
   
 
