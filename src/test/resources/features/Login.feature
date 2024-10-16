@uilogin
Feature: Login page feature

  @login
  Scenario Outline: Login with correct credentials
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    Then User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>

    Examples: 
      | SheetName | RowNumber |
      | Login     |         0 |

  @forgotpass
  Scenario Outline: Forgot Password functionality
    Given User is on the login page
    When User clicks on the Forgot password button
    And User enters an email from the given sheet name "<SheetName>" and row number <RowNumber>
    Then User clicks on the forgot password button

    Examples: 
      | SheetName | RowNumber |
      | Login     |         1 |

  @backtohome
  Scenario Outline: Back to home and contact us button functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Back to home button
    Then User clicks on the Contact us button

    Examples: 
      | SheetName | RowNumber |
      | Login     |         0 |

  @changepassword
  Scenario Outline: Validate the Change Password functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User click on user icon
    And User click on change password
    And User enter Old password new password and confirm password	provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    Then User click on change password button

    Examples: 
      | SheetName | RowNumber |
      | Login     |         1 |

  @logout
  Scenario Outline: Validate the logout button functionality
    Given User is on the login page
    And User logs into the intervention application using the username and password provided in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User clicks on the Sign In button in a spreadsheet named "<SheetName>" at the specified <RowNumber>
    And User click on user icon
    Then User click on logout

    Examples: 
      | SheetName | RowNumber |
      | Login     |         1 |
