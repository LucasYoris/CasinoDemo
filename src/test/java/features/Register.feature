Feature: User sign up
  This feature test the users registration

  Scenario Outline: User sign up with email
    Given the user is on the home page
    And click on the Registration button
    And registration page should be visible
    When the user enters their email <email>
    And enters their main coin <coin>
    And enters their password <password>
    And re-enters their password <password>
    And enters their name <name>
    And enters their lastName <lastName>
    And enters their middleName <middleName>
    And check the therms and conditions
    And enters the catpcha code
    And enters their birthay <birthay>
    And enters their nickName <nickName>
    And enters their address <address>
    And enters their country <country>
    And enters their city <city>
    And enters their postalCode <postalCode>
    And enters their gender <gender>
    And enters their question <question>
    And enters the answer <answer>
    And enters their login <login>
    And click on Register button
    Then a congratulations sign up message should be displayed

    Examples:
      | email             | coin   | password   | name    | lastName   | middleName   |   birthay   | nickName   | address   | country   | city          | postalCode   | gender   | question                       | answer               |login   |
      |"test"|  "USD" |"Test123"   |"Michael"|  "Jackson" | "Second"     | "1995-10-15"| "Jack"     |"False123" |"Argentina"|"Buenos Aires" |"1758"        |"Male"    |"Your favorite actor or actress"|   "question answer"  |"Test"  |