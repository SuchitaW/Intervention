@ui
Feature: Login page feature

  Scenario: Login page title
    Given User is on the login page
    When User gets the title of the page
    Then The page title should be "Intervention"

  @newIntervention
  Scenario Outline: Validate the New Intervention functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User create the new intervention details from given spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User view the existing intervention details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User edit the existing intervention from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated intervention

    Examples: 
      | SheetName        | RowNumber |
      | New Intervention |         0 |

  @importfromExcel
  Scenario Outline: Validate the Import from Excel functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User are able to import the intervention from Excel sheet "<SheetName>" at the specified <RowNumber>
    Then User are able to see there intervention in overview screen from given sheetname "<SheetName>" and rownumber <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Login     |         0 |

  @overview
  Scenario Outline: Validate the Intervention Overview module functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User navigates to the intervention overview screen
    And User are able to filter the intervention by username "<SheetName>" at the specified <RowNumber>
    Then User selects multiple checkboxes and deletes them simultaneously

    #And User are able to sort the interview overview screen
    #And User edit the existing intervention from given sheetname "<SheetName>" at the specified <RowNumber>
    #Then User deletes the updated intervention
    Examples: 
      | SheetName | RowNumber |
      | Login     |         0 |
      
      
      
    

      
    @exportExcel
   Scenario Outline: Validate export to excel in Overview screen functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User navigates to the intervention overview screen
    And User are able to filter the intervention by username and date "<SheetName>" at the specified <RowNumber>
    Then User are able to export the intervention in overview screen
    #And User edit the existing intervention from given sheetname "<SheetName>" at the specified <RowNumber>
    #Then User deletes the updated intervention
    Examples: 
      | SheetName | RowNumber |
      | Login     |         0 |
      
      
      
      
      
      
      

  @advancefilter
  Scenario Outline: Validate the Advance filter functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User navigates to the intervention overview screen and click on advance filter
    And User able to filter the data as per there choice in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    Then User click on filter

    Examples: 
      | SheetName        | RowNumber |
      | New Intervention |         0 |
