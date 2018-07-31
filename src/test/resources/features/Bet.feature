# Scenario describe using Gherkin

Feature: BetFeature
  This Feature enable an user to bet for events from William Hill website

  Scenario: As a WH Customer, I want the ability to place a bet on a English Premier League event
    Given I navigate to the main page
    And I search for Premier League events
    And I select English Premier League
    And I bet on a match for the home team
    And I put the stake at "0.05"
    Then I should have the odds or my bet