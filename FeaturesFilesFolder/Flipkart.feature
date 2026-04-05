Feature: search

Scenario: Verify the functionality of search module in flipkart homepage

Given launch an chrome browser
And Navigate to flipkart site
When Enter "mobile" in search module homepage
And validate mobile page has been open by pagetitle and the title is "Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com"
Then close an chrome browser

Given launch an chrome browser
And Navigate to flipkart site
When Enter "laptop" in search module homepage
And validate mobile page has been open by pagetitle and the title is "laptop- Buy Products Online at Best Price in India - All Categories | Flipkart.com"
Then close an chrome browser

Scenario:Verify the functionality of product
And Navigate to flipkart site
And Search an "mobile" in search module at homepage
When Click on a product
Then close an chrome browser
