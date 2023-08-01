Feature: Order food from Swiggy

Scenario: a user must be able to go to sign in page to complete order
Given a user is in the LandingPage on swiggy
When he type delivery location in the search box and then select 1st option from the drop-down
And Click on the first restaurant shown under Top restaurant chains in location
And Click on Add button corresponding to first listed dish
And Hover over Cart in the top right corner
And Click on Check Out in the sub-menu
Then Verify the text visible on the next page