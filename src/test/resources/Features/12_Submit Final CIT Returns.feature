Feature: Verify the process of submitting Company Income Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "V0105100" and Password "Password@123"
    And Click on login button

  @CIT
  Scenario: Submit Company Income Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Company Income Tax"
    Then Select CIT return with period "2020"
    Then Click continue
    Then Check corporate income checkbox
    Then Click next
    Then Enter CIT Business income as "1000000"
    Then Enter CIT Opening stock as "20000"
    Then Enter CIT Purchases as "20000"
    Then Enter CIT Closing stock as "20000"
    Then Click next
    Then Enter CIT Salary and wages as "20000"
    Then Click next
    Then Click next
    Then Enter Share Capital as "37000"
    Then Click next
    Then Upload directors pension fund information
    Then Verify alert success message "File uploaded successfully."
    Then Click next
    Then Confirm information given for CIT tax is true
    Then Submit CIT Tax returns
    Then Verify success message displayed as "Your CIT Return request has been submitted successfully. Your reference number is: CIRF"

