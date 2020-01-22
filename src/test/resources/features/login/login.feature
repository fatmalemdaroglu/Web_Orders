@login
Feature:Login
  As user, I want to be able to login

  Scenario:Login as a tester
    Given I am on the login page
    Then I login as a tester
    And I verify that "Web Orders" logo is displayed