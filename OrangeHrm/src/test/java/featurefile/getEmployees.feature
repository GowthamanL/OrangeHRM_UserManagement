Feature: Get all the employees names from HRM website
  Scenario: Get Employees names
    Given login Website
    And click the the directory button
    Then print all employee names
    Then logout