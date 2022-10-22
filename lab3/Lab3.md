[Dr.Martens](https://www.drmartens.com)
# Functional Test Cases 
## Test Case 1: 
| Id: | 1  |
| :--- | :----------- |
| Name: | Adding product's items to the shopping cart  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/, chosen location: United Kingdom  |
| Steps: | 1. [Open the product's item page](https://www.drmartens.com/us/en/1460-serena-women%27s-faux-fur-lined-leather-boots/p/27782225) |
||2. Select size of product's item |
||3. Click on "Add to bag" button |
| Expected result:| Popup with "Checkout" and "Continue shopping" buttons is displayed. Product item is added to the shopping cart. |
| Result: |  |

## Test Case 2: 
| Id: | 2  |
| :--- | :----------- |
| Name: | Moving product's items to the wishlist  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/, chosen location: United Kingdom, [at least 1 product's item](https://www.drmartens.com/us/en/p/15265001) is added to the shopping cart   |
| Steps: | 1. Click on the shopping cart in the header |
||2. Click on the "MOVE TO WISHLIST" button under the product's item |
| Expected result:| The product's item is removed from the shopping cart. The heart icon has changed color to yellow. The product's item is added to wishlist |
| Result: |  |

## Test Case 3: 
| Id: | 3  |
| :--- | :----------- |
| Name: | Deleting product's items from the wishlist  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/, chosen location: United Kingdom, [at least 1 product's item](https://www.drmartens.com/us/en/p/15265001) is added to the wishlist   |
| Steps: | 1. [Go to wishlist](https://www.drmartens.com/us/en/wishlist) (Click on the heart icon in the header) |
||2. Click on the "X" icon on the product's item |
| Expected result:| The product's item is removed from the wishlist |
| Result: |  |

## Test Case 4: 
| Id: | 4  |
| :--- | :----------- |
| Name: | Displaying recently viewed items  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/, chosen location: United Kingdom   |
| Steps: | 1. [Open the product's item page](https://www.drmartens.com/us/en/1460-serena-women%27s-faux-fur-lined-leather-boots/p/27782225) |
||2. Click on the eye icon in the header to go to the RECENTLY VIEWED page |
| Expected result:| Product item is displayed on the  RECENTLY VIEWED page. |
| Result: |  |

## Test Case 5: 
| Id: | 5  |
| :--- | :----------- |
| Name: | Adding product's items to the shopping cart without selecting size  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/, chosen location: United Kingdom   |
| Steps: | 1. [Open the product's item page](https://www.drmartens.com/us/en/1460-serena-women%27s-faux-fur-lined-leather-boots/p/27782225) |
||2. Click on the 'ADD TO BAG' |
| Expected result:|  above the 'ADD TO BAG' button an error message 'Please choose a size' is displayed, the item is not added to the shopping cart. |
| Result: |  |

## Test Case 6: 
| Id: | 6  |
| :--- | :----------- |
| Name: | Applying incorrect Promo Code |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, opened https://www.drmartens.com/, chosen location: United Kingdom, [at least 1 product's item](https://www.drmartens.com/us/en/p/15265001) is added to the shopping cart    |
| Steps: | 1. Click on the shopping cart in the header |
||2. Click on the 'PROMO CODE' box in the 'TOTAL' block  |
||3. Enter "ffffffff" and click 'APPLY'|
| Expected result:| Promo box has changed stroke color to red, the message "Promo code not applied" is displayed under box |
| Result: |  |

## Test Case 7: 
| Id: | 7  |
| :--- | :----------- |
| Name: | Search result  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127|
|| Opened https://www.drmartens.com/, chosen location: United Kingdom|

|   | Steps  | Expected results |
|:------------- |:---------------|:-------------|
| 1 | Click on the search input and enter nothing | EMPTY SEARCH RESULT page is opened and "Unfortunately we have 0 results for this search" text is showed |
| 2 | Click on the search input and enter "ffffffff" |  EMPTY SEARCH RESULT page is opened and "Unfortunately we have 0 results for this search" text is showed   |
| 3 | Click on the search input and enter "platform" | SEARCH RESULTS FOR 'PLATFORM' page is opened. Filters, sorts and product's items are showed  |

## Test Case 8: 
| Id: | 8  |
| :--- | :----------- |
| Name: | Sorting product's items by price  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, chosen location: United Kingdom|
|| Opened [FOR ALL PAGE](https://www.drmartens.com/us/en/unisex/c/04000000)|

|   | Steps  | Expected results |
|:------------- |:---------------|:-------------|
| 1 | Click on the 'SORT BY' button  | Drop-down list with options (Sort By: NAME (ASCENDING), NAME (DESCENDING), PRICE (LOWEST FIRST), PRICE (LOWEST FIRST), PRICE (HIGHEST FIRST), Recommended) appears |
| 2 | Choose the PRICE (LOWEST FIRST) from drop-down list |  Product's items are displayed from the cheapest to the most expensive one, selected option appears at the sorts block   |
| 3 | Choose the PRICE (HIGHEST FIRST) from drop-down list | Product's items are displayed from the most expensive to the cheapest one, selected option appears at the sorts block  |

## Test Case 9: 
| Id: | 9  |
| :--- | :----------- |
| Name: | Sorting product's items by name  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127, chosen location: United Kingdom|
|| Opened [FOR ALL PAGE](https://www.drmartens.com/us/en/unisex/c/04000000)|

|   | Steps  | Expected results |
|:------------- |:---------------|:-------------|
| 1 | Click on the 'SORT BY' button  | Drop-down list with options (Sort By: NAME (ASCENDING), NAME (DESCENDING), PRICE (LOWEST FIRST), PRICE (LOWEST FIRST), PRICE (HIGHEST FIRST), Recommended) appears |
| 2 | Choose the NAME (ASCENDING) from drop-down list |  Product's items are displayed alphabetically, starting with products whose name begins with a digit; selected option appears at the sorts block   |
| 3 | Choose the NAME (DESCENDING) from drop-down list | All product's items are displayed starting from the last letter of the alphabet, ending with products starting with a digit; selected option appears at the sorts block  |

## Test Case 10: 
| Id: | 10  |
| :--- | :----------- |
| Name: | Uploading image to gallery  |
| Preconditions: | Internet connection, Browser Google Chrome v.105.0.5195.127|
|| Opened https://www.drmartens.com/, chosen location: United Kingdom|

|   | Steps  | Expected results |
|:------------- |:---------------|:-------------|
| 1 | Click on the 'UPLOAD IMAGE' button on the  'SIX DECADES OF INDIVIDUALITY' block |  Popup with steps and resourse options (Hard Drive, Facebook, Instagram, Youtube) is displayed   |
| 2 | Click on the Hard Drive option and click on "Choose File"| File explorer is opened on your local device  |
| 3 | Choose image file (\*.tif, \*.jpg, \*.jpeg, \*.png, \*.svg, \*.jpeg, \*.gif, \*.tiff) and click "NEXT" button | The 2d step block with caption is displayed  |
| 4 | Choose non-image file ( \*.txt, \*.pdf, \*.xml etc.) and click "NEXT" button | A red block with a text 'Error: only image and video files are allowed.' is displayed  |











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
   
 
