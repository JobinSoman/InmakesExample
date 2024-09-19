@Feature1
Feature: To validate Amazon login functionality
@Smoke
Scenario Outline: To validate the positive and negative combination of amazon login functionlality
Given User has to hit the gmail url
And User has to enter the data "<emaildata>" in email field
And User has to enter the data "<pasworddata>" in password field
Then User has to click next button

Examples:
|emaildata       |pasworddata  |
|john@gmail.com  |Something    |
|peter@gmail.com |32323        |
