@ui
Feature: Administration page feature

  Scenario: Login page title
    Given User is on the login page
    When User gets the title of the page
    Then The page title should be "Intervention"

  @company
  Scenario Outline: To verify the companies page functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new companies from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing company details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User edit the existing company from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated comapny

    Examples: 
      | SheetName | RowNumber |
      | Companies |         0 |
  
  @tourl
  Scenario Outline: To verify the tourl page functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new url from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing url details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User edit the existing url from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated url

    Examples: 
      | SheetName | RowNumber |
      | Url       |         0 |

  @contactperson
  Scenario Outline: To verify the contact person page functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new contact person from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing new contact person details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User edit the existing contact person from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated contact person

    Examples: 
      | SheetName      | RowNumber |
      | Contact person |         0 |

  @logins
  Scenario Outline: To verify the company login page functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new company login from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing company login details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User edit the existing company login from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated company login

    Examples: 
      | SheetName     | RowNumber |
      | Company login |         0 |
