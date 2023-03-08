Feature: Saucedemo Shopping site

Scenario: Login page

Given User launch the url
When User click the username and send the username "standard_user"
And User click the password and send the password "secret_sauce"
And User click the login button
Then See page shown

Scenario: Select product

When User click the product
And User click the add to cart
And User click the shopping cart badge
And User click the checkout button 

Scenario: Place order

When User click the First Name and send "Suganya"
And User click the Last Name and send "Amirthaganesh"
And User click the Postal code and send "600009"
And User click the Continue button
And User click the Finish button