Feature: Verify the process of submitting Turnover Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "C0104837" and Password "Password@123"
    And Click on login button

  @Turnover
  Scenario: Submit Turnover Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Turnover Tax(TOT)"
    Then Select period as "2022/01"
    Then Click continue
    Then Click new to add turnover details
    Then Enter source of income as "Sales" description as "Business" and amount as "20000"
    Then Click add to save turnover details
    Then Click next
    Then Confirm information given for Turnover tax is true
    Then Submit Turnover Tax returns
    Then Verify success message displayed as "Your TOT Returns request has been submitted successfully. Your reference number is: TOTR: "
