Feature: Home Test


  Scenario: verify User Should Navigate To DesktopsPage Successfully
    Given I am on homepage
    When   I click on desktop tab
    And I click on show all desktop tab




  Scenario: verify User Should Navigate To LaptopPage Successfully
    Given I am on homepage
    When I click on Laptops & Notebooks tab
    Then  I click on show all Laptops & Notebooks tab

    Scenario: Verify User Should Navigate To Component Successfully
      Given I am on homepage
      When I click on Components
      Then I click on show All Components


