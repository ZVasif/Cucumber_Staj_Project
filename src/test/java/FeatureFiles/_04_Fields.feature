Feature: Fields Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Create Fields and Delete Fields
    And Click on the element in the left Nav
      | setup      |
      | parameters |
      | fields     |
    And Click on the element in the Dialog
      | addButton2 |
    And User sending the keys in Dialog content
      | nameInput | <fieldName> |
    And Click on the element in the Dialog
      | save |
    And Success message should be displayed
    And User sending the keys in Dialog content
      | searchBox | <fieldName> |
    And Click on the element in the Dialog
      | searchBTN |
    And Click on the element in the Dialog
      | editButton |

    And Click on the element in the Dialog
      | save |
    And Success message should be displayed

    And Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |

    And Success message should be displayed

    Examples:
      | fieldName |
      | berat+ff  |
