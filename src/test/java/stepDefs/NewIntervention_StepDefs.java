package stepDefs;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AdministrationPage;
import pageobjects.LoginPageObjects;
import pageobjects.MasterPage;
import pageobjects.NewInterventionPage;
import pageobjects.OverviewPage;

public class NewIntervention_StepDefs {
private static final Logger logger = LogManager.getLogger(NewIntervention_StepDefs.class);
	WebDriver driver;
	TestContext testContext;
	WebDriverWait wait;
	Scenario scn;
	//=======================================
	
	LoginPageObjects loginPageObjects;
	NewInterventionPage newInterventionPage;
	AdministrationPage administrationPage;
	MasterPage masterPage;
	OverviewPage overviewPage ;
	
	//==============================================
	public NewIntervention_StepDefs(TestContext testContext) {
		this.testContext = testContext;
		driver = testContext.getDriver();
		wait = testContext.getWebDriverWait();
		scn = testContext.getScenario();
		loginPageObjects= new LoginPageObjects(driver, scn);
        administrationPage=new AdministrationPage(driver, scn);
		masterPage =new MasterPage(driver, scn);
		overviewPage =new OverviewPage (driver, scn);
		newInterventionPage=new NewInterventionPage(driver, scn);
	}

//=========================================================================
		

@Given("User are able to import the intervention from Excel sheet {string} at the specified {int}")
		
public void user_are_able_to_import_the_intervention_from_excel_sheet_at_the_specified(String sheetName, Integer RowNumber) throws Exception {
		
	newInterventionPage.ImportExcel(sheetName, RowNumber);
	Thread.sleep(2000);
		
}



@Then("User are able to see there intervention in overview screen from given sheetname {string} and rownumber {int}")
public void user_are_able_to_see_there_intervention_in_overview_screen_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
	Thread.sleep(2000);
	newInterventionPage.TextFilter_Intervention_date1(sheetName, RowNumber);
	
	administrationPage.capturePassScreenshot(scn);
}

//=======================================================


@Given("User create the new intervention details from given spreadsheet named {string} at the specified {int}")
public void user_create_the_new_intervention_details_from_given_spreadsheet_named_at_the_specified(String sheetName, Integer RowNumber) throws Exception {

	newInterventionPage.ClickOn_Intervention_LeftMenu();
	newInterventionPage.ClickOn_Overview();
	//newInterventionPage.Create_Multiple_Intervention(sheetName);
	newInterventionPage.ClickOnNewInterventionyButton();
	newInterventionPage.Create_New_Intervention(sheetName, RowNumber);
	newInterventionPage.clickOnSave();	
}

@Given("User view the existing intervention details from given sheetname {string} and rownumber {int}")
public void user_view_the_existing_intervention_details_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
	
	newInterventionPage.TextFilter_Intervention(sheetName, RowNumber);
	newInterventionPage.edit_ClickOnSpeedDialButton();
	newInterventionPage.ClickOnViewButtonOnSpeedDial();
	Thread.sleep(2000);
	administrationPage.capturePassScreenshot(scn);
	Thread.sleep(2000);
	newInterventionPage.ClickOnClose();
    newInterventionPage.clickOnClearFilter();		
}
@Given("User edit the existing intervention from given sheetname {string} and rownumber {int}")
public void user_edit_the_existing_intervention_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
 
	newInterventionPage.TextFilter_Intervention(sheetName, RowNumber);
	newInterventionPage.edit_ClickOnSpeedDialButton();
	newInterventionPage.ClickOnEditButtonOnSpeedDial();
	newInterventionPage.edit_enter_new_InterventionDescription1(sheetName, RowNumber);
	newInterventionPage.edit_ClickOnUpdate();
	newInterventionPage.TextFilter_afterEdit_Intervention(sheetName, RowNumber);	
}
@Then("User delete the updated intervention")
public void user_delete_the_updatedintervention() {
 
	newInterventionPage.edit_ClickOnSpeedDialButton();
	newInterventionPage.ClickOnDeleteButtonOnSpeedDial();
	administrationPage.delete_Record_yes();
	administrationPage.clickOnClearFilter();
}

@Given("User navigates to the intervention overview screen")
public void user_navigates_to_the_intervention_overview_screen() throws Exception {
  
	newInterventionPage.ClickOn_Intervention_LeftMenu();
    newInterventionPage.ClickOn_Overview();
   
}

@Given("User selects multiple checkboxes and deletes them simultaneously")
public void user_selects_multiple_checkboxes_and_deletes_them_simultaneously() throws Exception {
	Thread.sleep(3000);
	newInterventionPage.Overview_selectmultiple_checkbox();
    newInterventionPage.Overview_Deletepopup_ClickOnYesButton();
	Thread.sleep(3000);
    
}

@Given("User are able to filter the intervention by username {string} at the specified {int}")
public void user_are_able_to_filter_the_intervention_by_username_at_the_specified(String sheetName, Integer RowNumber) throws InterruptedException, Exception, Exception {
	
	Thread.sleep(2000);
	newInterventionPage.TextFilter_Intervention_date1(sheetName, RowNumber);
	Thread.sleep(2000);
	overviewPage.TextFilter_UserName(sheetName, RowNumber);
	Thread.sleep(2000);

	administrationPage.clickOnClearFilter();
	
}

//=================================================================


@Given("User navigates to the intervention overview screen and click on advance filter")
public void user_navigates_to_the_intervention_overview_screen_and_click_on_advance_filter() throws Exception {
	
	newInterventionPage.ClickOn_Intervention_LeftMenu();
    newInterventionPage.ClickOn_Overview();
    newInterventionPage.ClickOn_AdvanceFilter();
    
    
    
}


@Given("User able to filter the data as per there choice in a spreadsheet named {string} at the specified {int}")
public void user_able_to_filter_the_data_as_per_there_choice_in_a_spreadsheet_named_at_the_specified(String sheetName, Integer RowNumber) throws Exception {
  
	newInterventionPage.TextFilter_AdvanceFilter(sheetName, RowNumber);
	Thread.sleep(3000);
}

@Then("User click on filter")
public void user_click_on_filter() throws Exception {

	
	administrationPage.capturePassScreenshot(scn);
	Thread.sleep(2000);
}



///=====================================================================e2e flow===============================================================
   
	

@When("User creates new companies without creating login from given sheetname {string} and rownumber {int}")
public void user_creates_new_companies_without_creating_login_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
	administrationPage.ClickOn_Administration_LeftMenu();
    
    administrationPage.ClickOn_Companies();
    administrationPage.ClickOnNewCompanyButton();
    
    administrationPage.Create_New_Companies(sheetName, RowNumber);
  
    administrationPage.ClickOnSaveNewCompany();
    Thread.sleep(2000);
    administrationPage.ClickOnNoButton();
    
    Thread.sleep(2000);
}




@When("User creates new contact person for newly created company from given sheetname {string} and rownumber {int}")
public void user_creates_new_contact_person_for_newly_created_company_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
	Thread.sleep(2000); 
	
	administrationPage.ClickOn_Administration_LeftMenu();
	
	administrationPage.ClickOn_ContactPerson();
	

	administrationPage.Create_Multiple_Contact_Persons(sheetName);
	
	
//	administrationPage.ClickOnNewContactPersonButton();
//	administrationPage.Create_New_Contact_Person(sheetName, RowNumber);
//	administrationPage.ClickOnSaveNewContactPerson();
}



@When("User creates new projects for newly created company from given sheetname {string} and rownumber {int}")
public void user_creates_new_projects_for_newly_created_company_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
	Thread.sleep(2000); 
	masterPage.ClickOn_Master_LeftMenu();
	masterPage.ClickOn_Project();
	
	masterPage.Create_Multiple_Project(sheetName);
	
//	masterPage.ClickOnNewProjectsButton();
//	
//	masterPage.Create_New_Projects(sheetName, RowNumber);
//	
//	masterPage.ClickOnSaveNewProjects();
	
}
@When("User creates new Intervention type for newly created compan from given sheetname {string} and rownumber {int}")
public void user_creates_new_intervention_type_for_newly_created_compan_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
	Thread.sleep(2000); 
	masterPage.ClickOn_Master_LeftMenu();
	masterPage.ClickOn_InterventionType();;
	
	masterPage.ClickOnNewInterventionTypeButton();
	
	masterPage.Create_New_Intervention_type(sheetName, RowNumber);
	
	masterPage.ClickOnSaveNewInterventiontype();
}
@When("User creates new Intervention code for newly created company from given sheetname {string} and rownumber {int}")
public void user_creates_new_intervention_code_for_newly_created_company_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
	 
	Thread.sleep(2000); 
	masterPage.ClickOn_Master_LeftMenu();
	masterPage.ClickOn_InterventionCodes();
	
	masterPage.Create_Multiple_Intervention_code(sheetName);
	
//	masterPage.ClickOnNewInterventionCodesButton();
//	
//	masterPage.Create_New_Intervention_code(sheetName, RowNumber);
//	
//	masterPage.ClickOnSaveNewInterventioncode();
}
@When("User create the new intervention details for newly created company from given spreadsheet named {string} at the specified {int}")
public void user_create_the_new_intervention_details_for_newly_created_company_from_given_spreadsheet_named_at_the_specified(String sheetName, Integer RowNumber) throws Exception {
	Thread.sleep(2000); 
	
	newInterventionPage.ClickOn_Intervention_LeftMenu();
	newInterventionPage.ClickOn_Overview();
	newInterventionPage.ClickOnNewInterventionyButton();
	newInterventionPage.Create_New_Intervention(sheetName, RowNumber);
	newInterventionPage.clickOnSave();	

}



@When("User are able to filter the intervention by users and date {string} at the specified {int}")
public void user_are_able_to_filter_the_intervention_by_users_and_date_at_the_specified(String sheetName, Integer RowNumber) throws Exception {
    
	
	Thread.sleep(2000);
	newInterventionPage.TextFilter_Intervention_date(sheetName, RowNumber);
	Thread.sleep(2000);
	overviewPage.TextFilter_UserName(sheetName, RowNumber);
	Thread.sleep(2000);

//	administrationPage.clickOnClearFilter();
	
}


@When("User edit the existing  added intervention from given sheetname  {string} and rownumber {int}")
public void user_edit_the_existing_added_intervention_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
    
//	newInterventionPage.TextFilter_Intervention(sheetName, RowNumber);
	newInterventionPage.edit_ClickOnSpeedDialButton();
	newInterventionPage.ClickOnEditButtonOnSpeedDial();
	newInterventionPage.edit_enter_new_InterventionDescription1(sheetName, RowNumber);
	newInterventionPage.edit_ClickOnUpdate();
	newInterventionPage.TextFilter_afterEdit_Intervention(sheetName, RowNumber);	
	
}


//=================================================



@When("User creates new login for companies from given sheetname {string} and rownumber {int}")
public void user_creates_new_login_for_companies_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
    
	administrationPage.ClickOnYesButton();
	
	administrationPage.Create_New_Logins_fromCompanies(sheetName, RowNumber);
	
	administrationPage.ClickOnSaveNewLoginCompanies();
	
}



//==================================export excel================================================


@Given("User are able to filter the intervention by username and date {string} at the specified {int}")
public void user_are_able_to_filter_the_intervention_by_username_and_date_at_the_specified(String sheetName, Integer RowNumber) throws Exception {

	Thread.sleep(1000);
	newInterventionPage.TextFilter_Intervention_date1(sheetName, RowNumber);
	Thread.sleep(1000);
	overviewPage.TextFilter_UserName(sheetName, RowNumber);
	Thread.sleep(2000);

	//administrationPage.clickOnClearFilter();
	
	
	
}




@Then("User are able to export the intervention in overview screen")
public void user_are_able_to_export_the_intervention_in_overview_screen() throws Exception {
	
	newInterventionPage.Overview_selectmultiple_checkbox();
	
	newInterventionPage.Export_Excel();
	Thread.sleep(1000); 
	
	newInterventionPage.Dragthesection();
	
	administrationPage.capturePassScreenshot(scn);
	
	
	
}














}








