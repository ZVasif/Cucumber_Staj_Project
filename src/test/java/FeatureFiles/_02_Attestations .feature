Feature: Attestations Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario: Create Attestations

    And Click on the element in the left Nav
      | humanResources     |
      | setupHumanResourse |
      | attestations       |

    And Click on the element in the Dialog
      | addBTN |

    And User sending the keys in Dialog content
      | nameInput | beyza+ |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

    And Click on the element in the Dialog
      | attestationsEditBTN |

    And User sending the keys in Dialog content
      | nameInput | asa1fgf+|

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

    And Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |

    Then Success message should be displayed



