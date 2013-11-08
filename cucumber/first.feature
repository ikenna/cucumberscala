
Feature: Cucumber
  In order to implement BDD in my Scala project
  As a developer
  I want to be able to run Cucumber from within SBT

  Scenario: Execute my first feature
    Given I have a homepage
    When I visit the homepage
    Then I should be welcome