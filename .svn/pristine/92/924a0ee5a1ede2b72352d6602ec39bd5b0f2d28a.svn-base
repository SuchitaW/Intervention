package stepDefs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

public class Login_StepDefs {
	
	
	private static final Logger logger = LogManager.getLogger(Login_StepDefs.class);

	WebDriver driver;
	TestContext testContext;
	WebDriverWait wait;
	
	Scenario scn;
	//=======================================
	
	LoginPageObjects loginPageObjects;
	AdministrationPage administrationPage;
	MasterPage masterPage;
	OverviewPage overviewPage ;
	NewInterventionPage newInterventionPage;
	
	//==============================================
	public Login_StepDefs(TestContext testContext) {
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
@Given("User is on the login page")
public void user_is_on_the_login_page() throws Exception {
	
loginPageObjects.navigateToURL();
loginPageObjects.clickOnIagree();
				 
}
@Given("User logs into the intervention application using the username and password provided in a spreadsheet named {string} at the specified {int}")
public void user_logs_into_the_intervention_application_using_the_username_and_password_provided_in_a_spreadsheet_named_at_the_specified(String sheetName, Integer RowNumber) throws Exception {
			   
loginPageObjects.login_method(sheetName, RowNumber);
}
@Then("User clicks on the Sign In button in a spreadsheet named {string} at the specified {int}")
public void user_clicks_on_the_sign_in_button_in_a_spreadsheet_named_at_the_specified(String sheetName, Integer RowNumber) throws Exception {
	 loginPageObjects.clickOnSignIn(sheetName, RowNumber);
}	

@When("User clicks on the Forgot password button")
public void user_clicks_on_the_forgot_password_button1() {
   loginPageObjects.clickOnForgotpassword();
}

@When("User enters an email from the given sheet name {string} and row number {int}")
public void user_enters_an_email_from_the_given_sheet_name_and_row_number(String sheetName, Integer RowNumber) throws Exception, Exception {
	loginPageObjects.clickOnforgotpassword(sheetName, RowNumber);
}
@Then("User clicks on the forgot password button")
public void user_clicks_on_the_forgot_password_button() {
    loginPageObjects.clickOnForgotpassword();
}


@When("User clicks on the Back to home button")
public void user_clicks_on_the_back_to_home_button() {
    loginPageObjects.clickOnBacktohome();
  //  loginPageObjects.capturePassScreenshot(scn);
    driver.navigate().back();
}
@Then("User clicks on the Contact us button")
public void user_clicks_on_the_contact_us_button() {
    loginPageObjects.clickOnContactUs();
  // loginPageObjects.capturePassScreenshot(scn);
}

@Given("User click on user icon")
public void user_click_on_user_icon() throws Exception {
 loginPageObjects.clickOnUsericon();
 Thread.sleep(2000);
}


@Given("User click on change password")
public void user_click_on_change_password1() throws InterruptedException {
    loginPageObjects.clickOnChangePassword();
    Thread.sleep(2000);
}
@Given("User enter Old password new password and confirm password	provided in a spreadsheet named {string} at the specified {int}")
public void user_enter_old_password_new_password_and_confirm_password_provided_in_a_spreadsheet_named_at_the_specified(String sheetName, Integer RowNumber) throws Exception, Exception {
   loginPageObjects.enteredChangePassword(sheetName, RowNumber);
}
@Then("User click on change password button")
public void user_click_on_change_password_button() throws Exception {
   loginPageObjects.clickOnChangePasswordButton();
   Thread.sleep(2000);
}

@Then("User click on logout")
public void user_click_on_logout() {

loginPageObjects.clickOnLogout();
}

	
	
	
	
	
	
	
	
	
	
	
	

}
