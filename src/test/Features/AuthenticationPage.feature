Feature: User login from Automation Practice
  Background:
    Given user is on automation practice
    When user clicks on sign in
    Then user should navigate to authentication page

    @Smoke
    Scenario: verify user is able to login using valid credentials
      Given user enters email as "vicky_sturd@hotmail.com" and password as "Vivek123"
      And user clicks on log in
      Then user should navigate to My Account page
