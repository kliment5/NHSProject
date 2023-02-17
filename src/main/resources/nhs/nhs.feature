Feature: Testing login functionality of NHS application

  Background: Navigation for the website

  Scenario: Happy path for NHS login process
    Given User navigates to the NHS website
    When User enters username 'admin' and password 'admin'
    Then User validates title 'NHS patients' and url 'http://www.techtorialacademy.link/app'

  Scenario Outline: Negative path for NHS login process
    Given User navigates to the NHS website
    When User enters username '<userName>' and password '<passWord>'
    Then User validates title '<title>' and url '<url>'

    Examples:
      | userName | passWord  | title     | url                                |
      |          | admin     | LoginPage | http://www.techtorialacademy.link/ |
      | admin    | password1 | LoginPage | http://www.techtorialacademy.link/ |
      | admin1   | admin     | LoginPage | http://www.techtorialacademy.link/ |

    Scenario: Happy path for three cards validation
      Given User navigates to the NHS website
      When User enters username 'admin' and password 'admin'
      Then User validates title 'NHS patients' and url 'http://www.techtorialacademy.link/app'
      And User validates there are three cards visible