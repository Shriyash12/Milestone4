Feature: Add product to bag

Scenario: Add product to bag.
Given Initialize the browser
And User will land to home page "https://www.myntra.com/"
When User enter top in search bar
Then User will redirect to product page
Then User will choose the first product
Then user will add the product to bag 



