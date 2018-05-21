Feature: A company that employs social care worker can register

  As a company that employs social care worker I should
  be able to provide their details and register for
  the scheme

  Scenario: A company that employs social care worker with a non UK address can register for the scheme
    Given I am on the social care compliance homepage
    When I choose the "A company that employs social care worker" option
    And I enter "name" in the name field
    And I enter "name" in the name field
    And I choose the "No" option
  And I enter the address
  | Field        | Value           |
  | addressLine1 | 22 Acacia Avenue|
  | addressLine2 | Sao Paolo       |
  | country      | Brazil          |
    And I enter the phone number as "number"
    And I choose the "No" option
    And I choose the "No" option
    And I choose the "No" option
    And I submit the form