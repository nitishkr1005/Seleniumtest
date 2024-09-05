Feature: Create Account on Facebook page
As a user, you need to open the Facebook homepage and perform the necessary validations.

Scenario: Validate first name

Given User needs to be on the Facebook page
When User enters their first name
Then User checks if the first name is present
Then Browser should be closed

Scenario: Validate surname 

Given User needs to be on the Facebook page
When User enters their first name
And User enter user surname
Then User check user surname is present
Then Mobile field should be blank 
Then Browser should be closed