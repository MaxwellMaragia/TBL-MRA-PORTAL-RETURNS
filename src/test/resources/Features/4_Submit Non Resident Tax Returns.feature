Feature: Verify the process of submitting Fringe Non Resident Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "C0105078" and Password "Password@123"
    And Click on login button

  @NonResident
  Scenario: Submit Non Resident Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Non Resident Tax(NRT)"
    Then Click continue
    Then Upload NRT template
    Then Verify alert success message "File uploaded successfully."
    Then Confirm information given for Non Resident tax is true
    Then Submit Non Resident Tax returns
    Then Verify success message displayed as "Your Non Resident Tax Returns request has been submitted successfully. Your reference number is: NRTR"