@ui
Feature: End to End Intervention feature

  @e2e
  Scenario Outline: To verify the e2e flow without company login of intervention functionality
    Given User is on the login page
    When User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new companies without creating login from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing company details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new contact person for newly created company from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing new contact person details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new projects for newly created company from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing projects details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new Intervention type for newly created compan from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing Intervention type details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new Intervention code for newly created company from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing Intervention code details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User create the new intervention details for newly created company from given spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User are able to filter the intervention by users and date "<SheetName>" at the specified <RowNumber>
    And User edit the existing  added intervention from given sheetname  "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated intervention

    Examples: 
      | SheetName | RowNumber |
      | e2e       |         0 |

  @e2elogin
  Scenario Outline: To verify the e2e flow with company login of intervention functionality
    Given User is on the login page
    When User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new companies from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new login for companies from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing company details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new contact person for newly created company from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing new contact person details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new projects for newly created company from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing projects details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new Intervention type for newly created compan from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing Intervention type details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new Intervention code for newly created company from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing Intervention code details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User create the new intervention details for newly created company from given spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User are able to filter the intervention by users and date "<SheetName>" at the specified <RowNumber>
    And User edit the existing  added intervention from given sheetname  "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated intervention

    Examples: 
      | SheetName | RowNumber |
      | e2e       |         0 |

  @e2eflow
  Scenario Outline: To verify the e2e flow with company login of intervention functionality
    Given User is on the login page
    When User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new url from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new companies from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new login for companies from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing company details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new contact person for newly created company from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing new contact person details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new projects for newly created company from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing projects details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new Intervention type for newly created compan from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing Intervention type details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User creates new Intervention code for newly created company from given sheetname "<SheetName>" and rownumber <RowNumber>
  Then User view the existing Intervention code details from given sheetname "<SheetName>" and rownumber <RowNumber>
    #And User create the new intervention details for newly created company from given spreadsheet named "<SheetName>" at the specified <RowNumber>
    #And User are able to filter the intervention by users and date "<SheetName>" at the specified <RowNumber>
    #And User edit the existing  added intervention from given sheetname  "<SheetName>" and rownumber <RowNumber>
    #Then User delete the updated intervention

    Examples: 
      | SheetName        | RowNumber |
      | Interventionflow |         0 |
