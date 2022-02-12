Feature: Verify the process of submitting Domestic Vat Tax Returns

  Background: Navigate to login page and login
    Given Navigate to Portal login page
    When Enter username "C0105078" and Password "Password@123"
    And Click on login button

  @DomesticVat
  Scenario: Submit Domestic Vat Tax Returns
    Then Click on submit a return
    Then Select Taxtype as "Domestic VAT"
    Then Select period as "2022/01"
    Then Click continue
    Then Enter value of sales as "67000"
    Then Enter Vat on imported services as "2000"
    Then Enter VAT on Disposal of Capital items as "2000"
    Then Enter Value of Supplies exported under Customs Control as "2000"
    Then Enter Value of Zero Rated Supplies as "2000"
    Then Enter Value of Exempt Supplies "10000"
    Then Click next
    Then Click next
    Then Enter Value of Local Purchases and Other Expenses as "105000"
    Then Enter Value of Import Purchases as "0"
    Then Enter Value of Zero Rated Purchases and Other Expenses as "0"
    Then Enter Input VAT on Imported Services as "10000"
    Then Enter Value of EFD Machines as "0"
    Then Enter Value of Exempt Purchases and Other Expenses as "2000"
    Then Enter Value of Purchases from Non VAT Registered Traders as "2000"
    Then Enter Value of Capital Goods as "10000"
    Then Enter Vat as "23000"
    Then Click next
    Then Confirm information given for Domestic Vat tax is true
    Then Submit Provisional Domestic Vat Tax returns
    Then Verify success message displayed as "Your VAT Returns request has been submitted successfully. Your reference number is: VATR"
