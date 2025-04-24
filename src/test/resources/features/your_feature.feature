Feature: Greeting

  Scenario: Say Hello
    Given the application is running
    When I call the hello endpoint
    Then I should receive "Hello, World!"
