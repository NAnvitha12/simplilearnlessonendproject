Feature: Login functionality

Background: 
Given a user is on the landing page
When he hovers the pointer over the Hello Sign-in menu
And he clicks on the Sign-in button in the sub-menu


Scenario: A user with invalid credentials must get an error message while logging in
  And he enters an invalid email address in the Email text-box
  And he clicks on the Continue button
  Then he must see the error message - "We cannot find an account with that email address"

  
Scenario Outline: A user with multiple invalid credentials must get an error message while logging in
And he enters an invalid email address "<emailId>" in the Email text-box
And he clicks on the Continue button
Then he must see the error message - "We cannot find an account with that email address"

Examples:
|emailId|
|Ani123455555@gmai.com|
|Anju223344@gmail.com|
|chinchan1212@gmail.com|
|klragul121222@gmail.com|