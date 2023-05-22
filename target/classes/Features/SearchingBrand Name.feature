Feature: Searching brand Name


Background:
Given Hello from brandsearch

@Brands
Scenario: Search Brand Name
Given: I launched the application
When I hovered over the Brands Tab
When I Searched for Brand Name
Then i verified that brandmane got searched sucessfully



Scenario: Search Brand Name
Given: I launched the application
When I hovered over the Brands Tab
When I Searched for Invalid Brand Name
Then i verified that brandmane got searched sucessfully
