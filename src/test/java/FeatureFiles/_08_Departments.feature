Feature: School Departments Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

    Scenario Outline: Creat school departments,edit and delete
    | setup       |
    | setupSchool |
    | departments   |
      Examples:
        |  |