Feature: verifying adactin Login 
#Scenario Outline:  Verifiying Login details with valid credentials

#Given User is on the adactin page
#When  users enters "<username>" and "<password>"
#And   user should click the login button
#Then user should verfy the message 

#Examples:	
#	|username|password|
#	|Bhagyaraj|1982bagya|


Scenario:  Verifiying Login details with valid credentials
Given User is on the adactin page
When  users enters username and password
|username|password|
|Bhagyaraj|1982bagya|
|dfgfd|ggdgfg|
And   user should click the login button
Then user should verfy the message 


	
Scenario Outline: verifying the search hotel page
When user select the "<location>", "<hotel>", "<roomType>", "<noofRooms>", "<cinDate>", "<coutDate>", "<adultRoom>", "<childRoom>" 
Then user should click search button

Examples:
|location|hotel|roomType|noofRooms|cinDate|coutDate|adultRoom|childRoom|
|London|Hotel Cornice|Standard|1 - One|13/03/2020|15/03/2020|2 - Two|2 - Two|

Scenario Outline: verifying the select hotel page
When user should click checkbox
Then user should click continue button

Scenario: verifying the select hotel page
When user should click checkbox
Then user should click continue button

Scenario Outline: verifying the Book a hotel page
When user enter the "<firstname>", "<lastname>", "<address>", "<creditCardno>", "<cardType>", "<expiryMonth>", "<expiryYear>", "<cvv>" 
And user should click book now button
Then user should verfy the orderid 

Examples:
|firstname|lastname|address|creditCardno|cardType|expiryMonth|expiryYear|cvv|
|Suresh|Kumar|Trichy|4210021007006120|MAST|3|2022|683|
