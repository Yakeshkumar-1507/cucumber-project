Feature: Verify API Testing

  @getMapping
  Scenario: Verify get response
    Given user verify the get endpoint
    Then user successfully verify 200 status code