@Feature7
Feature: To validate login and registration functionality
Scenario: To validate registration page with different set of invalid credentials
Given Navigate the user to registration page
When Pass the first and last name of the user in your name field
|john|george|
|peter|paul|
|mack|robert|
And Pass the phone number in mobile number field
|7894561235|
|9874561235|
|8794561235|
And Pass the password in password field
|pass1|jsjajs&KL|
|pass2|kskaksULI|
|pass3|sjsjsjOP|
Then Click on the verify mobile number button
@Smoke1
Scenario Outline:
Given Navigate the user to login page
When Pass the email or phone number in email or mobile number field
|email|phonenumber|
|john@gmail.com|7894561235|
|peter@gmail.com|9874561235|
|paul@gmail.com|9874781235|
And Click on continue button
And Pass the password "<password>" in password field
Then Click on sigin button
Examples:
|password|
|shjajsj32212|
|sdasda982389|
|sjadjkdjk23321|


