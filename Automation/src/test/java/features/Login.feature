Feature: Application Login

Scenario: Home page default login
Given User is on netbanking landing page
When User login into application with "jin" and password "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page default login
Given User is on netbanking landing page
When User login into application with "john" and password "4567"
Then Home page is populated
And Cards displayed are "false"