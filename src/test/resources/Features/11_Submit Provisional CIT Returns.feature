Feature: Verify the process of submitting Provisional CIT Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "V0104816" and Password "Password@123"
    And Click on login button

  @ProvisionalCIT
  Scenario: Submit Provisional CIT Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Company Income Tax"
    Then Select Provisional CIT with period "2021"
    Then Click continue
    Then Enter estimated chargable income or loss for CIT as "0"
#    Then Enter CIT quarter one Installment as "12000"
#    Then Enter CIT quarter two Installment as "12000"
#    Then Enter CIT quarter three Installment as "0"
#    Then Enter CIT quarter four Installment as "12000"
    Then Confirm information given for Provisional CIT tax is true
    Then Submit Provisional CIT Tax returns
    Then Verify success message displayed as "Your Provisional CIT Returns request has been submitted successfully. Your reference number is: CIRP"