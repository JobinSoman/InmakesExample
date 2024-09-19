@Feature3
Feature: To validate gmail login functionality
@Sanity
Scenario Outline: To validate the positive and negative combination of gmail login functionlality
Given User has to launch the browser and maximize window
When User has to hit the gmail url
And User has to enter the data "<emaildata>" in email field
And User has to enter the data "<pasworddata>" in password field
And User has to click next button
Then User has to close the window browser

Examples:
|emaildata       |pasworddata|
|john@gmail.com  |Inmakes    |
|peter@gmail.com |Runmakes   |
|jeru@gmail.com  |Funmakes   |
|judha@gmail.com |Hunmakes   |
|ceaser@gmail.com|Uinmakes   |