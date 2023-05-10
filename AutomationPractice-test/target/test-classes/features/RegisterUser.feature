Feature: As a new user to Login My Store
  User needs to register to the system
  so that the user can obtain their services
  Background: User is on Login My Store Page

  Scenario Outline: navigate the register page
    Given User enter Email Address as "num11123412364@gmail.com"
    Then User click on create an account button
    Examples:

    Scenario:  new user registration
      Given User select title
      And User enter first name as "ABC"
      And User enter last name as "def"
      And User enter email as "num11123412364@gmail.com"
      And User enter password as "12345"
      And User select date
      And User select month
      And User select year
      And User select Sign up for our newsletter!
      And User select Receive special offers from our partners!
      And User enter firstname as "ABC"
      And User enter lastname as "def"
      And User enter company as "XXXX"
      And User enter addressOne as "ADFUJN"
      And User enter addressTwo as "fiflih"
      And User enter city as "iugdd"
      And User select state
      And User enter postal code as "12345"
      And User select country
      And User enter additional information as "ityougvcuog"
      And User enter home phone as "1234567823"
      And User enter mobile phone as "1234561234"
      And User enter alias as "uygbugupg"
      When User clicks on Register
      Then Salutation message will display as "Welcome to your account. Here you can manage all of your personal information and orders.


