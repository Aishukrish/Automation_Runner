Feature: Hotel Booking in Adactin Application

Scenario: Login Page

Given user Launch The Application

When user Enter the Username In Username Field

And user Enter the Password in Password Field

Then user Click on the Login Button And it Navigates to the Search Hotel Page


Scenario: Search Hotel Page

When user Enter the Hotel Location 

And user Select the Hotel

And user Select the Room type

And user Select the Number of Rooms

And user Select the Number of Adults

And user Select the Number of Childrens

Then user click on the Search button And it Navigates to the Select Hotel Page


Scenario: Select Hotel Page

When user Select the Hotel

And user Click on the Continue button And it Navigates to the Book a Hotel Page



Scenario: Book a Hotel Page

When user Enter the Firstname in Firstname Field

And user Enter the Lastname in Lastname Field

And user Enter the Address in Address Field

And user Enter the CC Number in CC Number Field

And user Enter the CC card Type

And user Select the CC card expiry month and Year

And user Enter the CCV number in CCV number field

Then user click on the Book Now button And it navigates to the Booking Confirmation Page


Scenario: Booking Confirmation Page

When user click on the My Itinerary Button and it navigates to Booked Itinerary Page





