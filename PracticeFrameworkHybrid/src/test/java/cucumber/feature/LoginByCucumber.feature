Feature: Login to Bewakoof.com

Scenario: Home page Default login with valid details
Given User is on Homepage of "https://www.bewakoof.com" and will click on login button
When User click on login then login with email with "email@email.id" and "123456"
Then Home page is populated and logged in
And User can add product to cart and access anytime by login inn

Scenario: Home page Default login with valid details
Given User is on Homepage of "https://bewakoof.com" and will click on login button
When User click on login then login with email with "emailid@email.id" and "123456"
Then Home page is populated and logged in
And User can add product to cart and access anytime by login inn
