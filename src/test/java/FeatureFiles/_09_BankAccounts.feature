Feature: Bank Accounts Funtionally

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User sholud login successfuly

  Scenario Outline: Create accounts edit and delete
    When Click on the element in the left Nav
      | setup        |
      | parameters   |
      | bankAccounts |

    And Click on the element in the Dialog
      | addBTN |

    And User sending the keys in Dialog content
      | nameInput | <nameInputValue> |
      | iban      | <ibanValue>      |

    And Click on the element in the Dialog
      | currency |
      | TRY      |

    And User sending the keys in Dialog content
      | integrationCode | <integrationCodeValue> |

    And Click on the element in the Dialog
      | save |

    Then Success message should be displayed

    And User sending the keys in Dialog content
      | searchNameAccounts | <searchNameAccountsValue> |

    And Click on the element in the Dialog
      | searchBTN |

    And Click on the element in the Dialog
      | deletebutton       |
      | deleteDialogbutton |

    Then Success message should be displayed

    Examples:
      | nameInputValue | ibanValue | integrationCodeValue | searchNameAccountsValue |
      | alpaslan7      | TR00 127  | 127                  | alpaslan7               |


