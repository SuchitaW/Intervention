package stepDefs;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.AdministrationPage;
import pageobjects.LoginPageObjects;
import pageobjects.MasterPage;
import pageobjects.NewInterventionPage;
import pageobjects.OverviewPage;

public class Master_StepDefs {
	
	private static final Logger logger = LogManager.getLogger(Login_StepDefs.class);

	WebDriver driver;
	TestContext testContext;
	WebDriverWait wait;
	String base_url = "https://automationexercise.com/";
	Scenario scn;
	//=======================================
	LoginPageObjects loginPageObjects;
	AdministrationPage administrationPage;
	MasterPage masterPage;
	OverviewPage overviewPage ;
	NewInterventionPage newInterventionPage;
	//==============================================
	public Master_StepDefs(TestContext testContext) {
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

	
	//======================================================================Intervention code=====================================================
	

		@Given("User creates new Intervention code from given sheetname {string} and rownumber {int}")
		public void user_creates_new_intervention_code_from_given_sheetname_and_rownumber(String sheetName,Integer RowNumber) throws Exception {
			
			masterPage.ClickOn_Master_LeftMenu();
			masterPage.ClickOn_InterventionCodes();
			
		//	masterPage.ClickOnNewInterventionCodesButton();
			
			masterPage.Create_Multiple_Intervention_code(sheetName);
			
			//masterPage.Create_New_Intervention_code(sheetName, RowNumber);
			
			//masterPage.ClickOnSaveNewInterventioncode();
			
		}
		
		@Given("User view the existing Intervention code details from given sheetname {string} and rownumber {int}")
		public void user_view_the_existing_intervention_code_details_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
		    
			masterPage.TextFilter_Interventioncodename(sheetName, RowNumber);
			administrationPage.Edit_ClickOnSpeedDialButton();
			masterPage.ClickOnViewInterventionCodesButtonOnSpeedDial();
			Thread.sleep(2000);
			administrationPage.capturePassScreenshot(scn);
			Thread.sleep(2000);
			administrationPage.ClickOnClose();
			administrationPage.clickOnClearFilter();	
		}
		
		@Given("User edit the existing Intervention code from given sheetname {string} and rownumber {int}")
		public void user_edit_the_existing_intervention_code_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
		
			masterPage.TextFilter_Interventioncodename(sheetName, RowNumber);
			masterPage.edit_ClickOnSpeedDialButton();
			masterPage.ClickOnEditInterventionCodesButtonOnSpeedDial();
		    masterPage.edit_enter_new_InterventionCodesName(sheetName, RowNumber);
			masterPage.edit_ClickOnSaveToInterventioncode();
	        masterPage.TextFilter_afterEdit_Interventioncode_Name(sheetName, RowNumber );
			  
		}
		
		@Then("User delete the updated Intervention code")
		public void user_delete_the_updated_intervention_code() {
		
			masterPage.edit_ClickOnSpeedDialButton();
			masterPage.ClickOnDeleteButtonInterventioncodeOnSpeedDial();;
			administrationPage.delete_Record_yes();
			administrationPage.clickOnClearFilter();
		}



//=======================================================================
		
		
		
			@Given("User creates new Intervention type from given sheetname {string} and rownumber {int}")
			public void user_creates_new_intervention_type_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
			    
				masterPage.ClickOn_Master_LeftMenu();
				masterPage.ClickOn_InterventionType();;
				
				masterPage.ClickOnNewInterventionTypeButton();
				
				masterPage.Create_New_Intervention_type(sheetName, RowNumber);
				
				masterPage.ClickOnSaveNewInterventiontype();
			}

			@Given("User view the existing Intervention type details from given sheetname {string} and rownumber {int}")
			public void user_view_the_existing_intervention_type_details_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
				masterPage.TextFilter_Interventiontypename(sheetName, RowNumber);
				administrationPage.Edit_ClickOnSpeedDialButton();
				masterPage.ClickOnViewInterventionTypeButtonOnSpeedDial();
				Thread.sleep(2000);
				administrationPage.capturePassScreenshot(scn);
				Thread.sleep(2000);
				administrationPage.ClickOnClose();
				administrationPage.clickOnClearFilter();	

			}
			@Given("User edit the existing Intervention type from given sheetname {string} and rownumber {int}")
			public void user_edit_the_existing_intervention_type_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
				masterPage.TextFilter_Interventiontypename(sheetName, RowNumber);
				masterPage.edit_ClickOnSpeedDialButton();
				masterPage.ClickOnEditInterventionTypeButtonOnSpeedDial();
			    masterPage.edit_enter_new_InterventionTypeName(sheetName, RowNumber);
				masterPage.edit_ClickOnSaveToInterventionType();
		        masterPage.TextFilter_afterEdit_Interventiontype_Name(sheetName, RowNumber );

			}
			@Then("User delete the updated Intervention type")
			public void user_delete_the_updated_intervention_type() {

				masterPage.edit_ClickOnSpeedDialButton();
				masterPage.ClickOnDeleteButtonInterventiontypeOnSpeedDial();;
				administrationPage.delete_Record_yes();
				administrationPage.clickOnClearFilter();
				
				
				
			}


///==================================================================Projects====================================================
			
	
				@Given("User creates new projects from given sheetname {string} and rownumber {int}")
				public void user_creates_new_projects_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
					masterPage.ClickOn_Master_LeftMenu();
					masterPage.ClickOn_Project();
					masterPage.Create_Multiple_Project(sheetName);
					
//					masterPage.ClickOnNewProjectsButton();
//					
//					masterPage.Create_New_Projects(sheetName, RowNumber);
//					
//					masterPage.ClickOnSaveNewProjects();
				}

				@Given("User view the existing projects details from given sheetname {string} and rownumber {int}")
				public void user_view_the_existing_projects_details_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
					masterPage.TextFilter_Project_Name(sheetName, RowNumber);
					administrationPage.Edit_ClickOnSpeedDialButton();
					masterPage.ClickOnViewProjectsButtonOnSpeedDial();
					Thread.sleep(2000);
					administrationPage.capturePassScreenshot(scn);
					Thread.sleep(2000);
					administrationPage.ClickOnClose();
					administrationPage.clickOnClearFilter();	
				}
				@Given("User edit the existing projects from given sheetname {string} and rownumber {int}")
				public void user_edit_the_existing_projects_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
					masterPage.TextFilter_Project_Name(sheetName, RowNumber);
					masterPage.edit_ClickOnSpeedDialButton();
					masterPage.ClickOnEditButtonProjectOnSpeedDial();
				    masterPage.edit_enter_new_ProjectName(sheetName, RowNumber);
					masterPage.edit_ClickOnSaveToProject();
			        masterPage.TextFilter_afterEdit_Projects_Name(sheetName, RowNumber );
				}
				@Then("User delete the updated projects")
				public void user_delete_the_updated_projects() {
				    
					masterPage.edit_ClickOnSpeedDialButton();
					masterPage.ClickOnDeleteButtonProjectOnSpeedDial();;
					administrationPage.delete_Record_yes();
					administrationPage.clickOnClearFilter();
					
					
					
				}


		//===========================================================User=========================================
			
	
				
					@Given("User creates new user from given sheetname {string} and rownumber {int}")
					public void user_creates_new_user_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
					   
						masterPage.ClickOn_Master_LeftMenu();
						
						masterPage.ClickOn_User();
						
						masterPage.Create_New_User(sheetName, RowNumber);
						
						masterPage.ClickOnSaveNewUser();
						
					}


					@Given("User view the existing user details from given sheetname {string} and rownumber {int}")
					public void user_view_the_existing_user_details_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
					   
						masterPage.TextFilter(sheetName, RowNumber);
						
						masterPage.UserBlockUnblock(sheetName, RowNumber);
					}
					
					@Then("User change the role of the user")
					public void user_change_the_role_of_the_user() {
					   
						masterPage.capturePassScreenshot(scn);
					}



	

}
