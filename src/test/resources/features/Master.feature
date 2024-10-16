@ui
Feature: Master page feature

  Scenario: Login page title
    Given User is on the login page
    When User gets the title of the page
    Then The page title should be "Intervention"

  @interventioncode
  Scenario Outline: To verify the Intervention code page functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new Intervention code from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing Intervention code details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User edit the existing Intervention code from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated Intervention code

    Examples: 
      | SheetName         | RowNumber |
      | Intervention code |         0 |

  @interventiontype
  Scenario Outline: To verify the Intervention type page functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new Intervention type from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing Intervention type details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User edit the existing Intervention type from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated Intervention type

    Examples: 
      | SheetName         | RowNumber |
      | Intervention type |         0 |

  @projects
  Scenario Outline: To verify the Projects page functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User creates new projects from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing projects details from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User edit the existing projects from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User delete the updated projects

    Examples: 
      | SheetName | RowNumber |
      | Projects  |         0 |

  @User
  Scenario Outline: To verify the User page functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName_login>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName_login>" at the specified <RowNumber>
    And User creates new user from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User view the existing user details from given sheetname "<SheetName>" and rownumber <RowNumber>
    #And User edit the existing projects from given sheetname "<SheetName>" and rownumber <RowNumber>
    Then User change the role of the user

    Examples: 
      | SheetName | RowNumber | SheetName_login |
      | User      |         0 | Login           |
