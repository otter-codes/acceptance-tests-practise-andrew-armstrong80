Feature: Users who pay for their own care can register

  As a user who pays for there own care I should
  be able to provide my details and register for
  the scheme

  Scenario: User with a UK address can register for the scheme
    Given I am on the social care compliance homepage
    When I choose the "Someone who pays for care directly" option
    And I enter "name" in the name field
    And I choose the "Yes" option
    And I enter the address
      | Field        | Value           |
      | addressLine1 | 123 Fake Street |
      | addressLine2 | Fake Town       |
      | postcode     | NE98 1ZZ        |
    And I enter the phone number as "number"
    And I choose the "No" option
    And I choose the "No" option
    And I choose the "No" option
    And I submit the form
