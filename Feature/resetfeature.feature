Feature: Reset functionality on login page of Application				

Scenario Outline: Verify reset with 2 sets of data

Given Open the chrome and launch the application				

When User enters "<username>" and "<password>"

Then Reset the credential		

Examples: 

 | username   | password |
 | testuser_1 | Test@153 |
 | testuser_2 | Test@153 |
					

