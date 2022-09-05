Feature: Human Resources Position Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Create position edit and delete
    When Click on the element in the left Nav
      | humanResources     |
      | setupHumanResourse |
      | position           |
    And Click on the element in the Dialog
      | addBTN |
    Then User sending the keys in Dialog content
      | nameInput | <nameInputValue> |
      | shortName | <shortNameValue> |
    And Click on the element in the Dialog
      | save |
    Then Success message should be displayed
    And User sending the keys in Dialog content
      | namePosition | <namePositionValue> |
    And Click on the element in the Dialog
      | searchBTN |
    And Click on the element in the Dialog
      | editButton |
    Then User sending the keys in Dialog content
      | nameInput | <editNameInputValue> |
      | shortName | <editShortNameValue> |
    And Click on the element in the Dialog
      | save |
    Then Success message should be displayed
    And Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |
    Then Success message should be displayed
    Examples:
      | nameInputValue | shortNameValue | namePositionValue | editNameInputValue | editShortNameValue |
      | Ahmet4          | Namli4          | Ahmet4             | ismettt               | Elcibeyy            |



