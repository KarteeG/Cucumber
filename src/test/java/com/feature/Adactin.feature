Feature: : Hotel Booking In Adactin Hotel Appilication

@AD01
Scenario Outline:: Loogin

Given user Launch The Appilication

When user Enter The "<Username>" In Username Field

And user Enter The "<Password>" In Password Field

Then user Click On The Login Button And It Navigate to The Search Hotel Page

Examples:

	|Username|Password|
	|A|123|
	|karteeng|13990T|

@AD02
Scenario: Search Hotel 

When user Select The "Sydney"

And user Select The Hotels

And user Select The Room Type

And user Select The No Of Rooms

And user Enter The Check in Date

And user Enter The Check Out Date

And user Select The Adults Per Room

And user Select The Childs Per Room

Then user Click The Search Button And It Navigate To The Select Hotel Page

@AD03
Scenario: Select Hotel

When clck The Select Button

Then user Click The Continue Button And it Navigate To The Book A Hotel Page

@AD04
Scenario: Book A Hotel

When user Enter The First Name In First Name Field

And user Enter The Last Name In Last Name Field

And user Enter The Billing Address In Biling Address Field

And user Enter The Credit Card Number In Credit Card Number Field

And user Select The Card Type

And user Select The Expiry Month

And user Select The Expiry Year

And user Enter CVV Number In The CVV "123"

Then user click The Book Now Button And it Naviagate To The Booking Confirmation Page

@AD05
Scenario: Booking Confirmation

Then user Click On The My ltinerary Button And It Navigate To the Booking Itinaray Page

@AD06
Scenario: Full Screen

When tags Method Checking Purpose

@AD07
Scenario: Booked Itinerary

Then user Click On The Logout Button and It Naviagate To The Logout Page


