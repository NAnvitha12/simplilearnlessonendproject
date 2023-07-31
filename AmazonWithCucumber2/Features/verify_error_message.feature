Feature: Login functionality

@Tc_002 @Login_functionality
Scenario: A user with invalid credentials must get an error message while logging in
Given a user is on the landing page
When he hovers the pointer over the Hello Sign-in menu
And he clicks on the Sign-in button in the sub-menu
And he enters an invalid email address in the Email text-box
And he clicks on the Continue button
Then he must see the error message - "We cannot find an account with that email address"

  
