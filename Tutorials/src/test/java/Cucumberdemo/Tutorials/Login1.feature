
@tag
Feature: Login and Logout
  I want to use this template for my feature file

  @add
  Scenario: success
    Given user enter the user name "abisek"
    When enter the password "abi@123"
    And click button
    Then home page
    @smoke
  Scenario: Logout
    When clicks the logout
    Then Logouts from the homepage
    