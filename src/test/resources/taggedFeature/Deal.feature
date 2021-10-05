@EndToEndTest
Feature: CRM Deal Module

@RegressionTest @smokeTest
Scenario: Create Deal
Given User must have logged
When User enters new Deal details

@smokeTest
Scenario: Edit Deal
Given User must have logged
And Deal must be created
When User update Deal details

@RegressionTest
Scenario: View Deal
Given User must have logged
When User view Deal details 

@smokeTest
Scenario: Delete a Deal
Given User must have logged
When User deleted a Deal details

@RegressionTest
Scenario: User Logout
Given User logout