Feature: Verify the process of submitting Provisional PIT Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "C0105078" and Password "Password@123"
    And Click on login button

  @ProvisionalPIT
  Scenario: Submit Provisional PIT Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Personal Income Tax"
    Then Select Provisional PIT with period "2020"
    Then Click continue
    Then Enter estimated chargable income or loss as "12000"
#    Then Enter quarter one Installment as "12000"
#    Then Enter quarter two Installment as "12000"
    Then Enter quarter three Installment as "0"
#    Then Enter quarter four Installment as "12000"
    Then Confirm information given for Provisional PIT tax is true
    Then Submit Provisional PIT Tax returns
    Then Verify success message displayed as "Your Provisional PIT Returns request has been submitted successfully. Your reference number is: PIRP"
