Feature: Grade Levels Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Creat grade levels,then edit and delete
    When Click on the element in the left Nav
      | setup       |
      | parameters  |
      | gradeLevels |
    Then Click on the element in the Dialog
      | addBTN |
    And User sending the keys in Dialog content
      | nameInput | <nameInputValue> |
      | shortName | <shortNameValue> |
      | order     | <orderValue>     |
    Then Click on the element in the Dialog
    |save|
    And Success message should be displayed
    Then Click on the element in the Dialog
    |editGrade|
    And User sending the keys in Dialog content
      | nameInput | <editNameValue> |
      | shortName | <editShortValue> |
      | order     | <editOrderValue>     |
    Then Click on the element in the Dialog
      |save|
    And Success message should be displayed
    Then Click on the element in the Dialog
    |textDelete|
    |deleteDialogbutton|
    And Success message should be displayed
    Examples:
      | nameInputValue | shortNameValue | orderValue |editNameValue|editShortValue|editOrderValue|
      | grade2         | gra2           | 2          |grade3       |gra3          |3             |


