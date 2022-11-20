Feature: Verify the adatin hotel page and validate the datas in search hotel page

  Scenario Outline: verifying the search hotel page select all fields
    Given User is on the hotel page
    When User should enter login "<username>"and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>"and "<childerperroom">
    Then User should verfied the login page sucess message "Search Hotel "

    Examples: 
      | Username     | password    | location | hotels         | roomtype | noofrooms | checkindate | checkoutdate | adultsperroom | childerperroom |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 17/11/2022  | 18//11/2022  | 3 - Three     | 4 - Four       |

  Scenario Outline: verifying the search hotel page and select manatory fields only
    Given User is on the hotel page
    When User should enter login "<username>"and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<noofrooms>","<checkin>","<checkout>"and "<adultsperroom>"
    Then User should verfied the login page sucess message "Search Hotel "

    Examples: 
      | Username     | password    | location | noofrooms | checkindate | checkoutdate | adultsperroom |
      | venkatraj027 | harinathraj | Brisbane | 4 - Four  | 17/11/2022  | 18//11/2022  | 3 - Three     |

  Scenario Outline: verifying the page date checking
    Given User is on the hotel page
    When User should enter login "<username>"and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter "<location>","<hotels>","<roomtype>","<noofrooms>","<checkin>","<checkout>","<adultsperroom>"and "<childerperroom">
    Then User should verfied the search page date with invalid date error message "Check-In Date shall be before than Check-Out Date" and " Check-Out Date shall be after than Check-In Date"

    Examples: 
      | Username     | password    | location | hotels         | roomtype | noofrooms | checkindate | checkoutdate | adultsperroom | childerperroom |
      | venkatraj027 | harinathraj | Brisbane | Hotel Sunshine | Double   | 4 - Four  | 18/11/2022  | 15//11/2022  | 3 - Three     | 4 - Four       |

  Scenario Outline: verifying the page without enter any field and click search
    Given User is on the hotel page
    When User should enter login "<username>"and "<password>"
    Then User should verfied the login page sucess message "Hello venkatraj027!"
    When User should enter search button without enter any field
    Then User should verfied the search page location with error message "Please Select a Location"

    Examples: 
      | Username     | password    |
      | venkatraj027 | harinathraj |
