Feature: Validate all Links Present in Documents is Working

#With Example
Scenario Outline: Validate Document Links
Given user is already on Home Page
When title of login page is Developer Here
Then user clicks on "<search_Item>" Link verify status code
Then user Validate all the Links "<search_Item>" and Status Code
And Close the browser

Examples:

 | search_Item   |
 | documentation |

