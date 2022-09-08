Feature: Document Types Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Create document types , edit document types and delete document types
    And Click on the element in the left Nav
      | setup         |
      | parameters    |
      | documentTypes |
    And Click on the element in the Dialog
      | addBTN |
    And User sending the keys in Dialog content
      | nameInput | <NameD> |
    And Click on the element in the Dialog
      | stageButton            |
      | stageExaminationOption |
    And Click on the element with Robot

    And Click on the element in the Dialog
      | save |
    And Success message should be displayed

    And User sending the keys in Dialog content
      | searchBox | <NameD> |
    And Click on the element in the Dialog
      | searchBTN |
    And Click on the element in the Dialog
      | editButton |
      | save       |
    And Success message should be displayed

    And Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |
    And Success message should be displayed
    Examples:
      | NameD |
      | berk12  |