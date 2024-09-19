@Feature2
Feature: To validate the account creation of the fb application
@Regression
Scenario: To create new account
When To launch url of fb application
And To click the create new account button
# One dimensional map data
And To pass first name in first name text box
#key     value
|firstname1|John|
|firstname2|Peter|
|firstname3|Ryan|
|firstname4|Jeni|
# One dimensional list data
And To pass second name in second name text box
|Mathew|
|George|
|Mack|
#Two dimensional map data
And To pass mobileno or email in email text box
|email|mobileno|
|john@gmail.com|7894561235|
|peter@gmail.com|9874562135|
|ryan@gmail.com|96325874125|
#Two dimensional list data
And To create new password using new password text box
|Jcs@2345|UIJ@!323|JJAJJA2233|
|Jcs@3232222|UIJ@!3222223|JJAJJA22222222223|
And To select date from date field of DOB
And To select month from month field of DOB
And To select year from year field of DOB
And To click the radio button of gender field
And To click the signup button

