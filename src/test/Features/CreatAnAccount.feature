Feature: Create an account on automation practice

  @Regression
  Scenario Outline: verify user is not able to create an account with empty mendatory fields
    Given user is on automation practice
    When user clicks on sign in
    Then user should navigate to authentication page
    When user enters email "<email>" under create an account heading
    And user clicks on create an account page.
    Then user should navigate to create an account page.
    When user selects title "<title>" enters first name "<first_name>", last name "<last_name>" and password "<pwd>"
    And user selects DOB "<date>", "<month>" and "<year>"
    And user enter street address "<address>", city "<city>" and post code "<post_code>"
    And user selects state "<state>" and country "<country>"
    And user enters mobile number "<mobile_number>"
    And user clicks on register
    Then user should see a validation message "<error_message>"

    Examples:
      | email          | title | first_name | last_name | pwd      | date | month | year | address            | city     | post_code | state  | country       | mobile_number | error_message                                |
      | hfhf@gmail.com | Mr    | Vicky      | Talvar    | ehey8990 | 6    | 7     | 1979 | 2816  Seneca Drive | Portland | 97205     | Oregon | United States |               | You must register at least one phone number. |