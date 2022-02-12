Feature: Verify the process of submitting Personal Income Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "C0105096" and Password "Password@123"
    And Click on login button

  @PIT
  Scenario: Submit Personal Income Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Personal Income Tax"
    Then Select PIT return with period "2020"
    Then Click continue
    Then Click next
    Then Enter Business income as "1000000"
    Then Enter Opening stock as "20000"
    Then Enter Purchases as "20000"
    Then Enter Closing stock as "20000"
    Then Click next
    Then Enter Salary and wages as "20000"
    Then Click next
    Then Enter Opening capital as "34000"
    Then Enter Net profit as "100000"
    Then Enter Less drawings as "0"
    Then Click next
    Then Click next
    Then Click next
    Then Confirm information given for PIT tax is true
    Then Submit PIT Tax returns
    Then Verify success message displayed as "Your PIT Return request has been submitted successfully. Your reference number is: PIRF"
