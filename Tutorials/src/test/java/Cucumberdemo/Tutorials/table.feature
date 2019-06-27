
Feature: Loginn
  

  @multi
  Scenario Outline: Multi user Login
    Given User entered the "<username>"
    When user entered the "<password>" 
    Then Page is Displayed

    Examples: 
      | username  | password |
      | sam       |  sam@135 |
      | ram       |  ram@123 |
