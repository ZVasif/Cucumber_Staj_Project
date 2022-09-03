Feature: School Location Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Creat school location,edit and delete
    When Click on the element in the left Nav
      | setup       |
      | setupSchool |
      | locatoins   |
    Then Click on the element in the Dialog
      | addBTN       |
      | locationType |
      | labortory    |
    And User sending the keys in Dialog content
      | nameInput | <nameValue>      |
      | shortName | <shortNameValue> |
      | capacity  | <capacityValue>  |
    And Click on the element in the Dialog
      | save |
    And Success message should be displayed
    Then Click on the element in the Dialog
      | editText |
    And User sending the keys in Dialog content
      | nameInput | <editNameValue>     |
      | shortName | <editShortValue>    |
      | capacity  | <editCapacityValue> |
    And Click on the element in the Dialog
      | save |
    And Success message should be displayed
    Then Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |
    Then Success message should be displayed
    Examples:
      | nameValue | shortNameValue | capacityValue | editNameValue | editShortValue | editCapacityValue |
      | co+-1     | tom+-1         | 22+-1         | po+1          | co+2           | 25+1              |



