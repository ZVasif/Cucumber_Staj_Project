Feature: Positions Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario: Create Positions
    And Click on the element in the left Nav
      | humanResources     |
      | setupHumanResourse |
      | positionCategories |

    And Click on the element in the Dialog
      | addBTN |

    And User sending the keys in Dialog content
      | nameInput | 7b8as |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | nameInput | c98dcc |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

    And Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |

    Then Success message should be displayed





