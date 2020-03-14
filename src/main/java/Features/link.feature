Feature: Validate all Links Present in Documents is Working

#With Example
Scenario Outline: Validate Document Links
Given user is already on Home Page
When title of login page is Developer Here
Then user clicks on "<search_Item>" Link
Then user Validate all the Links "<search_Item>"
And Close the browser

Examples:

 | search_Item   |
 | Documentation |

