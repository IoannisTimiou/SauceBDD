Feature: login page automation

Scenario Outline: check login is successful with valid credentials
Given User is on login page
When User enters valid "<username>" and "<password>"
And Click on Login Button
Then User is navigated to Home page
And close the browser

Examples:
| username	| password |
| standard_user | secret_sauce |
#| locked_out_user | secret_sauce |
| problem_user | secret_sauce	|
#| error_user | secret_sauce |
#| visual_user | secret_sauce |
#| performance_glitch_user | secret_sauce |