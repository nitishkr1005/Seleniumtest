Feature: Create Account on Facebook page
As a user, you need to open the Facebook homepage and perform the necessary validations.

#Scenario Outline: Validate first name

#Given User needs to be on the Facebook page
#When User enters their <user> first name
#Then User checks if the <surname> first name is present
#Then Browser should be closed

Scenario Outline: Validate surname 

Given User needs to be on the Facebook page
When User enters their "<user>" first name
And User enter user "<surname>" surname
Then User check user "<surname>" surname is present
Then Mobile field should be blank 
Then Browser should be closed
Examples:
	| user	| surname	|
	| Tom		| jerry		|
	|	ryon	|ryonald	|