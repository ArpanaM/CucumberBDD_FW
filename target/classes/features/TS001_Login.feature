Feature: Login Action
Scenario: Verify Login for valid inputs and display message Login Successful
Given user is on home page
When user clicks on Signin link
Then next page opens check title
When user enter user name and password clicks on submit button
Then check user and display Login successful message
And Close Application
