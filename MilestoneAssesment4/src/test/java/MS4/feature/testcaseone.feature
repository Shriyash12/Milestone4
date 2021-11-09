Feature: This is feature file for test case one

  Scenario: To verify Tide free and gentle is available under powder in shop product
    Given Initialize the browser
    And Open the website
    When Website is opened click on shop product in navigation bar
    And under Shop Product select powder from dropdown
    Then Verify if Tide free and gentle is displayed or not
    And close the browser

  Scenario Outline: Searching for Antibacterial products using searchbar.
    Given Initialize the browser
    And Open the website
    When Website is opened search <key> using search bar
    Then Print the result found
    And close the browser 

    Examples: 
    
      | key          |
      | antibacterial|
      

  Scenario: Validating How to read laundry symobols under Learn More of How to do laundry.
    Given Initialize the browser
    And Open the website
    When Website is opened Click on learn more under How to do laundry
    Then Look for How to read laundry symbols from grid
    And print the text and validate
    Then close the browser