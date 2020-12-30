Feature: verifying the  adactin login details

  Scenario Outline: verifying the adactin login details with valid credentials
    Given user is on the adactin page
    When user should enter the "<username>" , "<password>"
    And user should click the login button
    And user should select the "<Location>","<Hotels>","<Room Type>","<Number of Rooms>","<Check In Date>","<Check Out Date>","<Adults per Room>","<Children per Room>"
    And user should click the search button
    And user should select the hotel
    And user select click the continue button
    And user should enter the "<First Name>","<Last Name >","<Billing Address>","<Credit Card No>""<Credit Card Type>"
      | Credit Card Type | Credit Card No   |
      | American Express | 1234567891234678 |
      | Visa             | 1234567891234678 |
      | Master Card      | 1234567891234678 |
      | Other            | 1234567891234678 |
    And user should enter the "<Expiry Month>","<Expiry year>","<CCV Number>"
      | Expiry Month | Expiry year | CCV Number |
      | November     |        2022 |       1234 |
      | December     |        2021 |        463 |
      | August       |        2020 |       7894 |
    And user should click the Book Now Button
    Then user should get the Order no

    Examples: 
      | username      | password  | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address   |
      | Jayaprakash31 | warnyjp31 | Sydney   | Hotel Creek | Double    | 2 - Two         | 18/12/2020    | 19/12/2020     | 2 - Two         | 3 - Three         | jeevan     | war       | qwertyuityityufgh |
