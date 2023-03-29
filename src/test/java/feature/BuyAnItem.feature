Feature: Buy an item

Scenario Outline: Buy an item with valid credit card info
Given The user launches the application
When The user seaches an item "<items>"
Then The user closes the browser

Examples:
| items    |
| wallet   |



