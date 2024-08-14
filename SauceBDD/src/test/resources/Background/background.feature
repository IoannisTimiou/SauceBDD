Feature: background processes

Background: User is logged in to sauce app
Given User accesses app login page
When User enters valid username and password
Then User should be able to navigate to Home page


Scenario: Test Menu Items
And clicks on breadcrumb icon
Then User should be able to see the side menu
And close the browser

Scenario: Verify add to cart function
And clicks on Add to button
Then Item should be added to cart
And close the browser


