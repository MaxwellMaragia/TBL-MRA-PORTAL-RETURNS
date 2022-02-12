Feature: Verify the process of submitting Capital Gains Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "C0105078" and Password "Password@123"
    And Click on login button

  @CapitalGains
  Scenario: Submit Capital Gains Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Capital Gain Tax(CGT)"
    Then Click continue
    Then Fill in particulars of the person acquiring the asset
    Then Click new under transaction details
    Then Select type of asset and asset number
    Then Enter disposal selling date as "29/09/2020"
    Then Enter selling price as "9000"
    Then Enter value at disposal as "9000"
    Then Enter acquisition date as "01/09/2020"
    Then Enter acquisition cost as "9000"
    Then Click add to save transaction details
    Then Click next after adding transaction details
    Then Confirm information given for Capital gains tax is true
    Then Submit Capital Gains Tax returns
    Then Verify success message displayed as "Your Capital Gain Tax Returns request has been submitted successfully. Your reference number is: CGTR"



