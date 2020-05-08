Feature: Register and not registered user will come on application and perform activities

Scenario: Registered user comes to application login and log out
Given user is on login page
When user enters username
And user enters password
And user clicks on signin button
Then user should be loggedin
When user clicks on Logout button
Then user should be logged out

Scenario: Non Registered User Comes to the Application, Register and Login
Given user is on reigstration page
When user enters username
And user enters email address
And user enters password
And user enters confirm password
And user enters date of birth
And user enters phone number
And user enters address
And user clicks on the home address type
And user select gender
And user select country
And user select state
And user enters city
And user enters zip code
And user click on agree checkbox
And user click on signup button
Then auser account should be created
