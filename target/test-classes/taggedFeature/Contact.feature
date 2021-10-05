@FunctionalTest
Feature: CRM contact Module

@RegressionTest @smokeTest
Scenario: Create Contact
Given User must have logged
When User enters new contact details

@smokeTest
Scenario: Edit Contact
Given User must have logged
And Contact must be created
When User update contact details

@RegressionTest
Scenario: View Contact
Given User must have logged
When User view contact details 

@smokeTest
Scenario: Delete a contact
Given User must have logged
When User deleted a contact details

@RegressionTest
Scenario: User Logout
Given User logout