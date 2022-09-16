Feature: Nationalities Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Create Nationalities
    And Click on the element in the left Nav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | addBTN |

    And User sending the keys in Dialog content
      | nameInput | <nameinput> |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

    And User sending the keys in Dialog content
      | searchBox | <nameinput> |

    And Click on the element in the Dialog
      | searchBTN |

    And Click on the element in the Dialog
      | editButton |

    And User sending the keys in Dialog content
      | nameInput | <nameseachinput> |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

    And Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |

    Then Success message should be displayed

    Examples:
      | nameinput   | nameseachinput |
      | group9 | group9+   |

