Feature: Searching for a book 

  Scenario: Search for physics books and add the first fourstar and above book to cart
Given a user is on the landing page
   When I type physics books in the search box and select the third option from the drop-down
    And I select rating fourstar and above from the left side bar
    And I click on the first search result
    And  I switches focus on the new tab
    And I click Add to Cart button
    When I click on Proceed to Buy button
    Then I should be on the Sign in page.
