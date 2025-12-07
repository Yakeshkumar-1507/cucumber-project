Feature: Login Functionality

  Scenario Outline: Valid login credentials
    Given user is on login page
    When user enter valid "<username>" and "<password>"
    And user click login button
    Then user should be navigate to the home page

    Examples:
      | username   | password    |
      | YakeshSiva | Yakesh@1507 |
      | Admin      | admin@123   |