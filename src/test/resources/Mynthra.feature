@Feature4
Feature: To validate Mynthra login functionality
Scenario: To validate login with invalid credentials
Given Launch the mynthra application
When Hover over the profile icon
And Click on the sign button
And Enter the invalid phone number
And Click on the continue button
And Click on login using password
And Enter the password
Then Click on the login button

