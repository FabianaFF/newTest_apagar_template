Feature: test search
  Background: setup of test search
    Scenario: test search at google
      Given the user open google page
      And user fill the search with 'Selenium'
      When the user execute the search
      Then the result will be shown