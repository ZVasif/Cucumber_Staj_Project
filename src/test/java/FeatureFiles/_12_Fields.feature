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


    And User delete item from Dialog
      | <fieldName> |

    And Success message should be displayed

    Examples:
      | fieldName |
      | datwgko |
