Feature: Verify the adatin hotel login page

  Scenario Outline: Verifying the hotel valid page
    Given User is on the hotel page
    When User should enter login "<Username>" and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"

    Examples: 
      | Username     | password    |
      | venkatraj027 | harinathraj |

  Scenario Outline: Verifying the hotel valid page using ENTER KEY
    Given User is on the hotel page
    When User should enter login "<Username>" and "<password>"  with ENTER KEY
    Then User should verfied the login page sucess message "Hello venkatraj027!"

    Examples: 
      | Username     | password    |
      | venkatraj027 | harinathraj |

  Scenario Outline: Verifying the hotel verify invalid credential
    Given User is on the hotel page
    When User should enter login "<Username>" and "<password>"
    Then User should verfied the login page with invalid credential error message contains  "Invalid Login details or Your Password might have expired. Click here to reset your password"

    Examples: 
      | Username     | password    |
      | venkatraj027 | harinathraj |
