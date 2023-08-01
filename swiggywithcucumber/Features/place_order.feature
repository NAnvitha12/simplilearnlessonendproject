Feature: Verify ordering process on Swiggy website

Scenario: Verify the order placement process
Given a user is on the landing page of swiggy
  When I type my delivery location as Hyderabad and select the first option from the auto-complete box
  And I click on the first restaurant shown under Top restaurant chains in Hyderabad
  And I click on the Add button corresponding to the first listed dish
  And I hover over the Cart in the top right corner
  And I click on Check Out in the sub-menu
  Then I verify that the text To place your order now, log in to your existing account or sign up.is visible on the next page
  
