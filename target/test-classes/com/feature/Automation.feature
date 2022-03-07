Feature: Purchase A Dresses In Automation Appilication

@AT01
Scenario: Home PAge

Given user Open The Appilication

Then user Click On The Sighn In Button It Naviagate Login Page

@AT02
Scenario: Login Page

When user Enter The Username In The Username Field "kartee.sri@gmail.com"

And user Enter The Passeord In The Password Field "password"

Then user click The Sign In Button And It Navigate To My Account Page


@AT03
Scenario: Full Screen

When user Want To Full Screen


@AT04
Scenario: Women

When user Click On The Women Button And it Naviagte To Womens Page

And user click The Faded Short Sleeve Image And It Naviagate To Faded Short Sleeve Page Frame

And user Enter The Qty In The Qty Text Box

And user Select The Size In Size 

And user Click The Add To Cart Button and It Naviagte To Shopping Cart 

And user Click The Proceed To Checkout Button and It Naviagte To Shiping Cart Summary Page

And  user Click The Proceed To Checkout Button and It Naviagte To Addresses Page

And  user Click The Proceed To Checkout Button and It Naviagte To Shpping Page

And  user Click The Terms And Service Radio Button

And  user Click The Proceed To Checkout Button and It Naviagte To Payment Page

And  user Click The Bank Wire Button and It Naviagte To Order Summary Page

And user Click the Confirm Button and It Navigate To Order Confirmation Page

Then user Click The SignOut Button And It Will Naviagte To Login Page

@AT05
Scenario Outline:: Login Page

When user Enter The "<Username>" In The Username Text Box

And user Enter The "<Password>" In The Password Text Box

Then user click The Sign In Button And It Navigate To My Accounts Page

Examples:

	|Username|Password|
	|kartee.sri@gmail.com|password|


@AT06
Scenario: Dressed

When user Click on The Dresses Button And it Naviagte To Dresses Page

And user click The Printed Dress Image And It Naviagate To Printed Dress Frame

And user click The Add To Cart Button and it Naviagte To Shopping Cart

And user Click The Proceed To Checkout Button and It Naviagte To The Shiping Cart Summary Page

And  user Click The Proceed To Checkout Button and It Naviagte To the Addresses Page

And  user Click The Proceed To Checkout Button and It Naviagte To the Shpping Page

And  user Click The Terms And click the Service Radio Button

And  user Click The Proceed To Checkout Button and It Naviagte To the Paeyment Page

And  user Click The Bank Wire Button and It Naviagte To the Order Summary Page

And user Click the Confirm Button and It Navigate To the Order Confirmation Page

Then user Click The SignOut Button And It Will Naviagte To the Login Page

@AT07
Scenario Outline:: Login Page

When user Enter The "<Username>" In To  The Username Text Box

And user Enter The "<Password>" In To The Password Text Box

Then user click The Sign In Button And It Navigate To The My Account Page

Examples:

	|Username|Password|
	|kartee.sri@gmail.com|password|


@AT008
Scenario: T-Shirts

When user Click on The T-Shirts Button And it Naviagte To T-shirts Page

And user click The Faded T-Shirt Image And It NAviagate To Faded T-Shirt Page Frame

And user click The Add To Cart Button and it Naviagte To the Shopping Cart 

And user Click The Proceed To The Checkout Button and It Naviagte To Shiping Cart Summary Page

And  user Click The Proceed To The Checkout Button and It Naviagte To Addresses Page

And  user Click The Proceed To The Checkout Button And It Naviagte To Shpping Page

And  user Click The Terms And Service The Radio Button 

And  user Click The Proceed To The Checkout Button and It Naviagte To Payment Page

And  user Click The Payment Bank Wire Button and It Naviagte To Order Summary Page

And user Click the I Confirm Button and It Navigate To Order Confirmation Page

Then user Click To The SignOut Button And It  Naviagte To Login Page










