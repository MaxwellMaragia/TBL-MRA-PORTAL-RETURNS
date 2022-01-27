Feature: Verify the process of submitting Dividend Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "V0104816" and Password "Password@123"
    And Click on login button

  @Dividend
  Scenario: Submit Dividend Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Dividend Tax"
    Then Click continue
    Then Upload dividend tax csv template
    Then Verify alert success message "File uploaded successfully."
    Then Enter dividend declaration date as today
    Then Confirm information given for Dividend tax is true
    Then Submit Dividend Tax returns
    Then Verify success message displayed as "Your DIVIDEND Returns request has been submitted successfully. Your reference number is: DIVR"