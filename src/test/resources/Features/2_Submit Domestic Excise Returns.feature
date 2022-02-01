Feature: Verify the process of submitting Domestic Excise Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "C0104499" and Password "Password@123"
    And Click on login button

  @DomesticExcise
  Scenario: Submit Domestic Excise Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Domestic Excise"
    Then Select period as "2022/02"
    Then Click continue to upload domestic excise uploads
    Then Upload Transaction information on domestic excise tax computation on goods
    Then Verify alert success message "File uploaded successfully."
    Then Upload Transaction information on raw materials used calculation for goods
    Then Verify alert success message "File uploaded successfully."
    Then Upload Transaction information on domestic excise tax computation for services
    Then Verify alert success message "File uploaded successfully."
    Then Click next after uploading domestic excise details
    Then Confirm information given for Domestic Excise tax is true
    Then Submit Domestic Excise Tax returns
    Then Verify success message displayed as "Your Excise Returns request has been submitted successfully. Your reference number is: DEXR"
