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
   
 
