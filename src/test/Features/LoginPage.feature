Feature: login page for automation practice app
@Negative
Scenario Outline: verify user is not able to login using invalid credentials
 Given user is on automation practice
 When user clicks on sign in
 Then user should navigate to authentication page
  When user enters email as "<email>" and password as "<pwd>"
  And user clicks on log in
  Then user should see an error message "<error>"

  Examples:
    | email                   | pwd      | error                      |
    | vicky_sturd@hotmail.com | vivek123 | Authentication failed.     |
    |                         | Vivek123 | An email address required. |
    | vicky_sturd@hotmail.com |          | Password is required.      |