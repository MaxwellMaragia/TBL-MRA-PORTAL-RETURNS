Feature: Verify the process of submitting Fringe Benefit Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "C0105078" and Password "Password@123"
    And Click on login button

  @FringeBenefit
  Scenario: Submit Fringe Benefit Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Fringe Benefit Tax"
    Then Select period as "2022/01"
    Then Click continue to fill fringe benefit details
    Then Click new to add fringe benefit details
    Then Select fringe benefit as "Household Items"
    Then Enter benefit value as "300"
    Then Click add to save fringe benefit details
    Then Click next after adding fringe benefit details
    Then Click next after adding fringe benefit details
    Then Confirm information given for Fringe benefit tax is true
    Then Submit Fringe Benefit Tax returns
    Then Verify success message displayed as "Your FBT Returns request has been submitted successfully. Your reference number is: FBTR"