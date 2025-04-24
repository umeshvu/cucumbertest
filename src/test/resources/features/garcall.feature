Feature: Conditional GarCall implementation

  Scenario: isAllowed is true - should call DefaultGarCall
    Given isAllowed is "true"
    When GarCallService is invoked
    Then response should be "real one called"

  Scenario: isAllowed is false - should call DemoGarCall
    Given isAllowed is "false"
    When GarCallService is invoked
    Then response should be "demo is called"
