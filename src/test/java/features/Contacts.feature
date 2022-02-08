Feature: Send message from 'Contacts' page
  This feature test Contact page

  Scenario Outline: Send correct messagge from Contacts
    Given the user is on the home page
    And click on MORE button
    And click on CONTACTS button
    And contacts page should be visible
    When the user enters their name <name>
    And enters their email <email>
    And enters their topyc <topyc>
    And enters a category <category>
    And enters a messagge <messagge>
    And enters the contact catpcha code
    And click on Send button
    Then a thanks message should be displayed


    Examples:
      | name  | email             | topyc   | category   | messagge            |
      |"Jack" |  "test@gmail.com" |"Help"   |"Game rules"|  "I need help test" |