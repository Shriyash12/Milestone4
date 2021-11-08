Feature: Application Login

Scenario Outline: Login with valid data.
Given Initialize the browser
And User will land to Login page "https://techademy.in/mindtreeorchard/account/landing" and need to input credentials
When User enters <username> and <password>
Then User will redirect to Home page and acces the track specified courses
And Close the driver

Examples:

|username                     |password 	 	|
|shriyash.nilawar@mindtree.com|Shri@1299    |
|Bittu.Sharma@mindtree.com    |Vivek@123	  |
|Bittu.Sharma@mindtree.com    |Vivek@123    |