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
      | addBTN |
    And User sending the keys in Dialog content
      | nameInput | <nameValue>      |
      | shortName | <shortNameValue> |
      | capacity  | <capacityValue>  |
    And Click on the element in the Dialog with action
    And Success message should be displayed
    Then Click on the element in the Dialog
      | editText |
    And User sending the keys in Dialog content
      | nameInput | <editNameValue>     |
      | shortName | <editShortValue>    |
      | capacity  | <editCapacityValue> |
    And Click on the element in the Dialog with action
    And Success message should be displayed
    Then Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |
    Then Success message should be displayed
    Examples:
      | nameValue | shortNameValue | capacityValue | editNameValue | editShortValue | editCapacityValue |
      | co+-12    | tom+-12        | 22+-12        | po+12         | co+22          | 25+12             |



