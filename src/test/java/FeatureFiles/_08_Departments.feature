Feature: School Departments Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Creat school departments,edit and delete
    When Click on the element in the left Nav
      | setup       |
      | setupSchool |
      | departments |
    Then Click on the element in the Dialog
      | addBTN |
    And User sending the keys in Dialog content
      | nameInput | <nameValue> |
      | code      | <codeValue> |
    And Click on the element in the Dialog
      | section |
    Then User sending the keys in Dialog content
      | shortName | <shortNameValue> |
    And Click on the element in the Dialog
      | save |
    Then Success message should be displayed
    Given Click on the element in the Dialog
      | editTextDepartment |
    And User sending the keys in Dialog content
      | nameInput | <editNameValue> |
      | code      | <editCodeValue> |
    And Click on the element in the Dialog
      | section |
    Then User sending the keys in Dialog content
      | shortName | <editShortValue> |
    And Click on the element in the Dialog
      | save |
    Then Success message should be displayed
    Then Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |
    Examples:
      | nameValue | codeValue | shortNameValue | editNameValue | editCodeValue | editShortValue |
      | Univer+-1  | 19415      | java-+18        | Cambridge+-1   | 89273          | java8+-1        |