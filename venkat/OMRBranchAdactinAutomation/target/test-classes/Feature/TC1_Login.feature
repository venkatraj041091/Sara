Feature: verify the adatin hotel login page

  Scenario Outline: verifying the hotel valid page
    Given user is on the hotel page
    When user should enter login "<username>"and "<password>"
    Then user should verfied the login page sucess message "Hello venkatraj027!"

    Examples: 
      | username     | password    |
      | venkatraj027 | harinathraj |

  Scenario Outline: verifying the hotel valid page using ENTER KEY
    Given user is on the hotel page
    When user should enter login "<username>"and "<password>"  with ENTER KEY
    Then user should verfied the login page sucess message "Hello venkatraj027!"

    Examples: 
      | username     | password    |
      | venkatraj027 | harinathraj |

  Scenario Outline: verifying the hotel verify invalid credential
    Given user is on the hotel page
    When user should enter login "<username>"and "<password>"
    Then user should verfied the login page with invalid credential error message contains  "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | username     | password    |
      | venkatraj027 | harinathraj |
