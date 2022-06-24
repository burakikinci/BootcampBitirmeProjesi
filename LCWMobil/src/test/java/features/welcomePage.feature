@WelcomePage
Feature: Welcome Page

  @Check
  Scenario Outline: Check Welcome Page Components
    Given burak is opened LcWaikiki App
    Then should see "<title>" title
    Then should see "<desc>"  description
    When should see skip button
    Examples:
      |    title      |        desc        |
      |PRATİK ALT MENÜ| Yenilenen alt menü |

  @Click
  Scenario: Click Button
    Given burak is opened LcWaikiki App
    When click Skip button
    Then should see Home Page
    When click Profile button

  @FalseLogin
  Scenario: False login
    Given burak is opened LcWaikiki App
    When click Skip button
    Then should see Home Page
    When click Profile button
    When Write for e-mail address: "burak@lcw.com"
    When Write for password : "123abc"
    When Click Login button
    Then Check Message
    When Print Message

  @CorrectLogin
  Scenario: given by the LCW team
    Given burak is opened LcWaikiki App
    When click Skip button
    Then should see Home Page
    When click Profile button
    When Write for e-mail address: "fehaces107@syswift.com"
    When Write for password : "Yxd3jPGxevw8.Sb"
    When Click show password button
    When Click Login button
    When Click Category button

    @GivenScenario
    Scenario: given by the LCW team
      Given burak is opened LcWaikiki App
      When click Skip button
      Then should see Home Page
      When click Profile button
      When Write for e-mail address: "fehaces107@syswift.com"
      When Write for password : "Yxd3jPGxevw8.Sb"
      When Click Login button
      When Click Category button
      When Click Woman button
      When Click giyim button
      When Click bluz button
      When Click Filtering button
      When Click Size button and choose Medium then click Apply button
      When Click Colour button and choose siyah then click Apply button
      When Click List Results
      When Choose Product from list
      When Choose Medium Size and add to Chart then go to Chart Page
      Then Check Product Name and Size and Piece
      When Click go to Payment Page
      Then Check delivery method types on Payment Page







