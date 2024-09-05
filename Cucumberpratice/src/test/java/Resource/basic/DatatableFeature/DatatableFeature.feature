Feature: Create Account on Facebook page
As a user, you need to open the Facebook homepage and perform the necessary validations.

Scenario: Validate first name

Given User needs to be on the Facebook page
When Enter following data
	|userName |userSurname |Mobile|
	|Pakau 		|hanks			 |54546|
	|ryan			|ghosling		 |7987	|
	
	Then Browser should be closed