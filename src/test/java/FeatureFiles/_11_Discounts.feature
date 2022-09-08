Feature: Discounts Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Create discounts types , delete discounts types
    And Click on the element in the left Nav
      | setup      |
      | parameters |
      | discounts  |
    And Click on the element in the Dialog
      | addBTN |
    And User sending the keys in Dialog content
      | descriptionName | <DName>  |
      | code            | <cInput> |
      | priority        | <pri>    |
    And Click on the element in the Dialog
      | save |
    And Success message should be displayed

    And User sending the keys in Dialog content
      | descriptionName2 | <DName> |
    And Click on the element in the Dialog
      | searchBTN   |
      And Click on the element in the Dialog
      | addButton21 |
      | save        |
    And Success message should be displayed

    And Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |
    And Success message should be displayed
    Examples:
      | DName | cInput | pri |
      | alsg1pf  | 2332    | 810  |
