Feature: Desktop Test

  Scenario: User should verify desktop result from A to Z
    Given I am on homepage
    When   I click on desktop tab
    And I click on show all desktop tab
    And I Select Z to A from DropDownList
    And Select Product HP LP3065
  And Select Delivery Date "2022-11-30"
  And Enter Qty "1” using Select class.
  And Click on “Add to Cart” button
  And Click on link “shopping cart” display into success message
