Feature: A social care worker can register

  As a social care worker I should
  be able to provide my details and register for
  the scheme

  Scenario: A social care worker with a UK address can register for the scheme
    Given I am on the social care compliance homepage
    And I choose the "Social care workers" option
    Then I should be taken to the redirection page
