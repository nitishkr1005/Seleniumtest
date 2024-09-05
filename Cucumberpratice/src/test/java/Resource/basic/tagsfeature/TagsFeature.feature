@Important
Feature: Create Account on Facebook page
As a user, you need to open the Facebook homepage and perform the necessary validations.
@Smoke
Scenario: Validate first name

Given User needs to be on the Facebook page
When User enters their "Pakau" first name
Then User checks if the "Pakau" first name is present
Then Browser should be closed
@Smoke @Regression
Scenario: Validate surname 
Given User needs to be on the Facebook page
When User enters their "ryan" first name
And User enter user "ghosling" surname
Then User check user "ghosling" surname is present
Then Mobile field should be blank 
Then Browser should be closed


Scenario: Validate multple 1 
Given User needs to be on the Facebook page
When User enters their "ryan" first name
And User enter user "ghosling" surname
Then User check user "ghosling" surname is present
Then Mobile field should be blank 
Then Browser should be closed

@Regression
Scenario: Validate multple 2
Given User needs to be on the Facebook page
When User enters their "ryan" first name
And User enter user "ghosling" surname
Then User check user "ghosling" surname is present
Then Mobile field should be blank 
Then Browser should be closed


@Sanity
Scenario: Validate multple 3 
Given User needs to be on the Facebook page
When User enters their "ryan" first name
And User enter user "ghosling" surname
Then User check user "ghosling" surname is present
Then Mobile field should be blank 
Then Browser should be closed