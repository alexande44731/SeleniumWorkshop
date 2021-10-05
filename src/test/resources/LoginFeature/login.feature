Feature: CRM Login Feature
This feature is to test login functionality

Scenario: Valid Login
Given User is already in login page
When User enters login credentials
Then User is on Home Page
And close the browser

#Scenario: Valid Login
#Given User is already in login page
#When User enters "tomsmith" and "SuperSecretPassword!" login credentials
#Then User is on Home Page
#And close the browser

#Scenario Outline: Valid Login
#Given User is already in login page
#When User enters "<username>" and "<password>" login credentials
#Then User is on Home Page
#And close the browser

#Examples:
#	| username | password |
#	| tomsmith | SuperSecretPassword! |
#	| testuser1 | welcome123 |
	
#Scenario: Valid Login
#Given User is already in login page
#When User enters  login credentials
#	| tomsmith | SuperSecretPassword! |
#Then User is on Home Page
#And close the browser

	
#Scenario: Valid Login
#Given User is already in login page
#When User enters  login credentials
#| username | password |
#| tomsmith | SuperSecretPassword! |
#Then User is on Home Page
#And close the browser
	