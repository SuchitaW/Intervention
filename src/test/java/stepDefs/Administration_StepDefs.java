package stepDefs;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
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

public class Administration_StepDefs {
	
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
	NewInterventionPage newInterventionPage;;
	//==============================================
	public Administration_StepDefs(TestContext testContext) {
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

	//======================================================================================
	
	@When("User gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		driver.getTitle();
	}
	@Then("The page title should be {string}")
	public void page_title_should_be(String applicationLandingPageTitle) {
		Assert.assertEquals(applicationLandingPageTitle, driver.getTitle());
	scn.log("Application title is found as :- " + driver.getTitle());
	}
	
	
	//=============================================================Companies================================================

	
		@Given("User creates new companies from given sheetname {string} and rownumber {int}")
		public void user_creates_new_companies_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
			administrationPage.ClickOn_Administration_LeftMenu();
		    administrationPage.ClickOn_Companies();
		    administrationPage.ClickOnNewCompanyButton();
		    administrationPage.Create_New_Companies(sheetName, RowNumber);
		    administrationPage.ClickOnSaveNewCompany();
		    Thread.sleep(1000);
            administrationPage.ClickOnYesButton();
		}

		@Given("User view the existing company details from given sheetname {string} and rownumber {int}")
		public void user_view_the_existing_company_details_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
           
			
			administrationPage.TextFilter_Companies(sheetName, RowNumber);
			administrationPage.Edit_ClickOnSpeedDialButton();
			administrationPage.ClickOnViewButtonCompaniesOnSpeedDial();
			Thread.sleep(2000);
			administrationPage.capturePassScreenshot(scn);
			Thread.sleep(2000);
			administrationPage.ClickOnClose();
			administrationPage.clickOnClearFilter();
		}
		@Given("User edit the existing company from given sheetname {string} and rownumber {int}")
		public void user_edit_the_existing_company_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
			administrationPage.TextFilter_Companies(sheetName, RowNumber);
			administrationPage.Edit_ClickOnSpeedDialButton();
			administrationPage.ClickOnEditButtonCompaniesOnSpeedDial();
			administrationPage.Edit_CompaniesDetails(sheetName, RowNumber);
			administrationPage.Edit_ClickOnSaveToCompanies();
			administrationPage.TextFilter_afterEdit_Companies(sheetName, RowNumber);
		}
		@Then("User delete the updated comapny")
		public void user_delete_the_updated_comapny() {
			administrationPage.Edit_ClickOnSpeedDialButton();
			administrationPage.ClickOnDeleteButtonCompaniesOnSpeedDial();
			administrationPage.delete_Record_yes();
			administrationPage.clickOnClearFilter();
		}



	
	//==============================================To Url=============================================================================
	

			@Given("User creates new url from given sheetname {string} and rownumber {int}")
			public void user_creates_new_url_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
			    
				administrationPage.ClickOn_Administration_LeftMenu();
				
				administrationPage.ClickOn_ToUrl();
				
				administrationPage.ClickOnNewUrlButton();
				
				administrationPage.Create_New_to_url(sheetName, RowNumber);
				
				administrationPage.ClickOnSaveNewToUrl();
				
			}

			@Given("User view the existing url details from given sheetname {string} and rownumber {int}")
			public void user_view_the_existing_url_details_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
			   
				administrationPage.TextFilter_Url(sheetName, RowNumber);
				administrationPage.Edit_ClickOnSpeedDialButton();
				administrationPage.ClickOnViewButtonOnSpeedDial();
				Thread.sleep(2000);
				administrationPage.capturePassScreenshot(scn);
				Thread.sleep(2000);
				administrationPage.ClickOnClose();
				administrationPage.clickOnClearFilter();
				
			}
			@Given("User edit the existing url from given sheetname {string} and rownumber {int}")
			public void user_edit_the_existing_url_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
				
				administrationPage.TextFilter_Url(sheetName, RowNumber);
				administrationPage.Edit_ClickOnSpeedDialButton();
				administrationPage.ClickOnEditButtonOnSpeedDial();
				administrationPage.edit_enter_new_ToUrlName(sheetName, RowNumber);
				administrationPage.edit_enter_newToUrlDescription(sheetName, RowNumber);
				administrationPage.edit_ClickOnSaveToUrl();
				administrationPage.TextFilter_afterEdit_URL(sheetName, RowNumber);
			
			
			}
			@Then("User delete the updated url")
			public void user_delete_the_updated_url() {
			  
				administrationPage.Edit_ClickOnSpeedDialButton();
				administrationPage.ClickOnDeleteButtonOnSpeedDial();
				administrationPage.delete_Record_yes();
				administrationPage.clickOnClearFilter();
			}


//================================================================Contact Person==================================================================
			
	
				@Given("User creates new contact person from given sheetname {string} and rownumber {int}")
				public void user_creates_new_contact_person_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
					
					administrationPage.ClickOn_Administration_LeftMenu();
					
					administrationPage.ClickOn_ContactPerson();
					
//					administrationPage.ClickOnNewContactPersonButton();
					
					administrationPage.Create_Multiple_Contact_Persons(sheetName);
					
					Thread.sleep(2000);
					
					//administrationPage.Create_New_Contact_Person(sheetName, RowNumber);

				//	administrationPage.ClickOnSaveNewContactPerson();
				}

				@Given("User view the existing new contact person details from given sheetname {string} and rownumber {int}")
				public void user_view_the_existing_new_contact_person_details_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
					Thread.sleep(2000);
					administrationPage.TextFilter_ContactPerson(sheetName, RowNumber);
					administrationPage.Edit_ClickOnSpeedDialButton();
					administrationPage.ClickOnViewContactPersonButtonOnSpeedDial();
					Thread.sleep(2000);
					administrationPage.capturePassScreenshot(scn);
					Thread.sleep(2000);
					administrationPage.ClickOnClose();
					administrationPage.clickOnClearFilter();
				}
				
				@Given("User edit the existing contact person from given sheetname {string} and rownumber {int}")
				public void user_edit_the_existing_contact_person_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
					
					administrationPage.TextFilter_ContactPerson(sheetName, RowNumber);
					administrationPage.Edit_ClickOnSpeedDialButton();
					administrationPage.ClickOnEditContactPersonButtonOnSpeedDial();
					administrationPage.edit_enter_new_ContactPersonName(sheetName, RowNumber);
//					administrationPage.edit_enter_newContactPersonCompany(sheetName, RowNumber);
					administrationPage.edit_ClickOnSaveToContactPerson();
					administrationPage.TextFilter_afterEdit_ContactPerson(sheetName, RowNumber);
				}
				
				@Then("User delete the updated contact person")
				public void user_delete_the_updated_contact_person() {
					
					administrationPage.Edit_ClickOnSpeedDialButton();
					administrationPage.ClickOnDeleteButtonContactPersonOnSpeedDial();;
					administrationPage.delete_Record_yes();
					administrationPage.clickOnClearFilter();
				}


//======================================================================================Logins===============================================================
	
				
					@Given("User creates new company login from given sheetname {string} and rownumber {int}")
					public void user_creates_new_company_login_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
						administrationPage.ClickOn_Administration_LeftMenu();
						
						administrationPage.ClickOn_Logins();
						
						administrationPage.ClickOnNewLoginsButton();
						
						administrationPage.Create_New_Logins(sheetName, RowNumber);
						
						administrationPage.ClickOnSaveNewLogin();
					}
					@Given("User view the existing company login details from given sheetname {string} and rownumber {int}")
					public void user_view_the_existing_company_login_details_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
						
						administrationPage.TextFilter_Login(sheetName, RowNumber);
						administrationPage.Edit_ClickOnSpeedDialButton();
						administrationPage.ClickOnViewLoginButtonOnSpeedDial();
						Thread.sleep(2000);
						administrationPage.capturePassScreenshot(scn);
						Thread.sleep(2000);
						administrationPage.ClickOnClose();
						administrationPage.clickOnClearFilter();
					
					}
					@Given("User edit the existing company login from given sheetname {string} and rownumber {int}")
					public void user_edit_the_existing_company_login_from_given_sheetname_and_rownumber(String sheetName, Integer RowNumber) throws Exception {
					    
						administrationPage.TextFilter_Login(sheetName, RowNumber);
						administrationPage.Edit_ClickOnSpeedDialButton();
						administrationPage.ClickOnEditLoginButtonOnSpeedDial();
						administrationPage.edit_enter_new_LoginName(sheetName, RowNumber);
					    administrationPage.edit_ClickOnSaveToLogin();
						administrationPage.TextFilter_afterEdit_Login(sheetName, RowNumber);
						
						
						
					}
					@Then("User delete the updated company login")
					public void user_delete_the_updated_company_login() {
						administrationPage.Edit_ClickOnSpeedDialButton();
						administrationPage.ClickOnDeleteButtonLoginOnSpeedDial();;
						administrationPage.delete_Record_yes();
						administrationPage.clickOnClearFilter();
					}



	

}
