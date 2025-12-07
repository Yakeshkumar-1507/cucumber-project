Feature: Tag Examples


  Background: # Background executes before each scenarios
    Given user launch the application

  @smoke @TC_01
  Scenario: valid the login
    Then user validated the login crenditals

  @smoke @TC_02
  Scenario: verify the product
    Then user verified the product page

  @smoke
  Scenario: verify the cart
    Then user verified the cart page

  @Regression
  Scenario: verify the payment
    Then user verified the payment page

  @Regression
  Scenario: verify the delivery
    Then user verified the delivery page

  @Regression
  Scenario: verify the delivery
    Then user verified the Tracking page