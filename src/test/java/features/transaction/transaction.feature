Feature: Verifying the Transaction functionality

  Background:
    Given login form is displayed
    When Enter username and password
    And Click on the login button

  @tc
  Scenario: Verify that the Billing functionality
    Given Check that the homepage is displayed
    When Click on the grid view button
    Then Check that the billing module is displayed