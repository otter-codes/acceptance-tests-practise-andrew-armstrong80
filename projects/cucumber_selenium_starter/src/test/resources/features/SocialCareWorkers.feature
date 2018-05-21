Feature: A social care worker can register

  As a social care worker I should
  be taken to a redirection page

  Scenario: A social care worker with a UK address can't register for the scheme
    Given I am on the social care compliance homepage
    And I choose the "Social care workers" option
    Then I should be taken to the redirection page
