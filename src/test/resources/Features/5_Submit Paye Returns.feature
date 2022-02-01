Feature: Verify the process of submitting PAYE Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "C0104499" and Password "Password@123"
    And Click on login button

  @PAYE
  Scenario: Submit PAYE Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "PAYE"
    Then Select period as "2022/03"
    Then Click continue
    Then Upload PAYE template
    Then Verify alert success message "File uploaded successfully."
    Then Confirm information given for paye tax is true
    Then Submit PAYE Tax returns
    Then Verify success message displayed as "Your PAYE Returns request has been submitted successfully. Your reference number is: EPMR"