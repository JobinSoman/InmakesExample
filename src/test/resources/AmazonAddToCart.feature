@FeatureChallenge
Feature: Validate the add to cart feature
Scenario Outline: Validate whether the cart have all added product
Given Navigate to amazon home page
When Search product by entering keyword "<searchproduct>" in the search bar
And Click on the search button 
And Select any product from the list
And Switch the window to selected product
And Add the product to the cart
Then Verify whether the added product is captured in my cart
Examples:
|searchproduct|
|hand gloves|
|Sanitizer|
|Keyboard|

