Feature: Mi Primer Feature
  i want to use thus template for my feature file

  Scenario: Mi Primer Scenario
    Given I want to write a step with precondition
      | id     | nombre       | balance |
      | 14142  | SophosTester | 51.56   |
    When I complete action
      | id      | nombre        | balance |
      | 14142   | SophosTester  | 51.56   |
      | 867392  | SophosTester1 | 90.62   |
    Then  I validate the outcomes