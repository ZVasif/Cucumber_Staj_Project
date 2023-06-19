Feature: Education Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Create Education edit and delete
    When Click on the element in the left Nav
      | education         |
      | educationSetup    |
      | subjectCategories |

    And Click on the element in the Dialog
      | addBTN |

    And User sending the keys in Dialog content
      | nameInput | <nameInputValue> |
      | code      | <codeValue>      |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

    And User sending the keys in Dialog content
      | namePosition | <nameInputValue> |

    And Click on the element in the Dialog
      | searchBTN |

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | nameInput | <editNameInputValue> |
      | code      | <editCodeValue>      |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

    And Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |

    Then Success message should be displayed


    Examples:
      | nameInputValue | codeValue | editNameInputValue | editCodeValue |
      | buKezSon1      | 6699      | buKezSon2          | 2189          |