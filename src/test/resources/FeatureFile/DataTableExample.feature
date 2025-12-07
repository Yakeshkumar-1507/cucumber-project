Feature: Validate Datatable Scenario


  @TC_01
  Scenario: Verify datatable
    Given user launch the application
    When user enter "<username>" and "<password>"
      | username | password  |
      | admin    | admin123  |
      | yakesh   | yakesh123 |
    Then verify the username as expected

  @TC_02
  Scenario: verify products
    Given user launch the application
    When user enter product list
      | apple   |
      | samsung |
      | nokia   |
    Then products are added to List