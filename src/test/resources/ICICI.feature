Feature: To validate login functionality in ICICI bank site
@Feature5
Scenario Outline: To validate login with invalid credential
Given Launch the page of ICICI bank login page
When Click the field of login using userid
And Pass the userid "<userid>" of the user
And Pass the password "<password>" of the user
Then Hit the login button
Examples:
|userid           |password    |
|121212121221121  |Inmakes    |
|21312313123123   |Runmakes   |
|432342131313213  |Uinmakes   |
