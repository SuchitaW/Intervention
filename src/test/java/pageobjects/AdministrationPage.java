package pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.Scenario;
import utility.ExcelReader;

public class AdministrationPage {
	
	public WebDriver driver;
	Scenario scn;
	WebDriverWait wait;
	
	String path = System.getProperty("user.dir")+"//xls//Intervation.xlsx";
	ExcelReader reader = new ExcelReader();
	
	String importexcel = System.getProperty("user.dir")+"\\xls\\Report.xlsx";

	
//============= Locators============================================//companies====================================================
	
	
	@FindBy(xpath="//span[contains(text(),'Administration')]")
	WebElement leftMenu_administration;
	
	@FindBy(xpath="//span[contains(text(),'Companies')]")
	WebElement leftmenu_companies;
	
	@FindBy(id="btn_add__Companies")
	WebElement btn_NewCompany;
	
	@FindBy(id="btn_submit__Company")
	WebElement btn_SaveNewCompany;
	
	
	
	//====================================================================tourl-============================================
	
	@FindBy(xpath="//span[contains(text(),'To url')]")
	WebElement leftmenu_url;
	
	@FindBy(id="btn_add__To_Url")
	WebElement btn_NewUrl;
	
	@FindBy(id="txt___TO_URL__Name")
	WebElement txt_ToUrlName;
	
	@FindBy (id="txta___TO_URL__Description")
	WebElement txt_ToUrlDescription;
	
	@FindBy(id="chk___TO_URL__InActive")
	WebElement Chk_ToUrlInactive;
	
	@FindBy(id="btn_reset___TO_URL")
	WebElement btn_ToUrlReset;
	
	@FindBy(id="btn_sub___TO_URL")
	WebElement btn_ToUrlSave;
	
	
	@FindBy(xpath="//input[@id='txt__To_Url__Name']")
	WebElement filter_Url;
	
	
	@FindBy(xpath="//tbody//tr//td[2]//button//span")
	WebElement btn_speedDial;
	
	
	@FindBy(id="spd_btn_edt__To_Url__0")
	WebElement btn_edit_URL;
	
	@FindBy(id="spd_btn_dtl__To_Url__0")
	WebElement btn_view_URL;
	
	
	@FindBy(id="spd_btn_del__To_Url__0")
	WebElement btn_delete;
	
	@FindBy(id="txt____Name")
	WebElement txt_editUrlName;
	
	
	@FindBy(id="txta____Description")
	WebElement txt_editUrlDescription;
	
	@FindBy(id="btn_sub__")
	WebElement btn_editSaveUrl;
	
	@FindBy(css=".p-badge")
	WebElement btn_ClearFilter;
  	
	@FindBy(xpath="//span[text()='Yes']")
	 WebElement btn_delete_yes;
	   
	 @FindBy(xpath="//button[contains(@class,'p-dialog-header-icon p-dialog-header-maximize p-link ng-star-inserted')]")
	  WebElement btn_close;
	 @FindBy(css=".p-confirm-dialog-reject.p-button.p-component")
	  WebElement btn_No;
	 
	 @FindBy(css=".p-confirm-dialog-accept.p-button.p-component")
	  WebElement btn_Yes;
	
	//=========================================================contact person===================================
	
	@FindBy(xpath="//span[contains(text(),'Contact-person')]")
	WebElement leftmenu_contactperson;
	
	@FindBy(id="btn_add__Contact_Persons")
	WebElement btn_NewContactPerson;
	
	@FindBy(xpath="//input[@id='txt__Contact_Persons__Name']")
	WebElement filter_ContactPerson;

	@FindBy(id="txt___CONTACT_PERSON__Name")
	WebElement txt_ContactPersonName;
	
	@FindBy (xpath="//ul/p-dropdownitem/li/div")
	List <WebElement> drps_ContactPersonCompany;
	

	@FindBy (xpath="//ul[@role='listbox']//li//div")
	List <WebElement> drps_filterCompany;
	
	
	@FindBy (xpath="//ul[@role='listbox']//li")
	List <WebElement> drps_Companyfilter;
	
	
	@FindBy(id="chk___CONTACT_PERSON__IsDeleted")
	WebElement Chk_ContactPersonInactive;
	
//	@FindBy(id="btn_reset___TO_URL")
//	WebElement btn_ToUrlReset;
	
	@FindBy(id="btn_sub___CONTACT_PERSON")
	WebElement btn_ContactPersonSave;
	
	@FindBy(xpath="//input[@id='txt__Contact_Persons__Name']")
	WebElement filter_Name;
	
	@FindBy(xpath="//input[@id='txt__Contact_Persons__Name']")
	WebElement filter_Companies;

	@FindBy(id="spd_btn_edt__Contact_Persons__0")
	WebElement btn_edit_ContactPerson;
	
	@FindBy(id="spd_btn_dtl__Contact_Persons__0")
	WebElement btn_view_ContactPerson;
	
	
	@FindBy(id="spd_btn_del__Contact_Persons__0")
	WebElement btn_delete_ContactPerson;
	
	@FindBy(id="txt____Name")
	WebElement txt_editContactPersonName;
	
	
	@FindBy(id="txta____Description")
	WebElement txt_editContactPersonCompany;
	
	@FindBy(id="btn_sub__")
	WebElement btn_editSaveContactPerson;
	
	//=======================================================logins===============================================================================
	
	
	@FindBy(xpath="//span[contains(text(),'Logins')]")
	WebElement leftmenu_logins;
	
	@FindBy(id="btn_add__Logins")
	WebElement btn_NewLogins;
	
	@FindBy(xpath="//input[@id='txt__Contact_Persons__Name']")
	WebElement filter_Login;

	@FindBy(id="txt___COMPANY_LOGIN__LoginName")
	WebElement txt_LoginName;
	
	@FindBy(id="txt___COMPANY_LOGIN__Password")
	WebElement txt_Loginpassword;
	
	@FindBy(id="txt____LoginName")
	WebElement txt_LoginNamecompanies;
	
	@FindBy(id="txt____Password")
	WebElement txt_Loginpasswordcompanies;
	
//	@FindBy(id="btn_reset___TO_URL")
//	WebElement btn_ToUrlReset;
	
	@FindBy(id="btn_sub__")
	WebElement btn_LoginSavecompanies;
	
	@FindBy(id="btn_sub___COMPANY_LOGIN")
	WebElement btn_LoginSave;
	
	@FindBy(xpath="//input[@id='txt__Logins__LoginName']")
	WebElement filter_LoginName;
	
	@FindBy(xpath="//input[@id='txt__Contact_Persons__Name']")
	WebElement filter_Company;

	@FindBy(id="spd_btn_edt__Logins__0")
	WebElement btn_edit_Login;
	
	@FindBy(id="spd_btn_dtl__Logins__0")
	WebElement btn_view_Login;
	
	
	@FindBy(id="spd_btn_del__Logins__0")
	WebElement btn_delete_Login;
	
	@FindBy(id="txt____LoginName")
	WebElement txt_editLoginName;
	
	
	@FindBy(id="txt____Password")
	WebElement txt_editLoginPassword;
	
	@FindBy(id="btn_sub__")
	WebElement btn_editSaveLogin;
	
	@FindBy (xpath="//ul/p-dropdownitem/li/div")
	List <WebElement> drps_LoginCompany;
	
	
	@FindBy (xpath="//ul/p-dropdownitem/li/div")
	List <WebElement> drps_Logintourl;
	
	
	//====================================Companies======================================
	@FindBy(id="txt__Username__Company")
	WebElement txt_Company_Name;
	
	@FindBy(id="txt__Address__Company")
	WebElement txt_Company_Address;
	
	@FindBy (xpath="//ul//li[@role='option']")
	List <WebElement> drps_Company_Country;
	
	@FindBy (xpath="//ul//p-dropdownitem/li//span")
	List <WebElement> drps_Parent_Company;
	
	
	@FindBy(id="txt__Telephone__Company")
	WebElement txt_Company_Telephone;
	
	@FindBy(id="txt__Location__Company")
	WebElement txt_Company_Location;
	
	@FindBy(id="txt__Mail__Company")
	WebElement txt_Company_Mail;
	
	@FindBy(id="txt__GSM__Company")
	WebElement txt_Company_GSM;
	
	@FindBy(id="txt__FAX__Company")
	WebElement txt_Company_FAX;
	
	@FindBy(id="txt__Boss__Company")
	WebElement txt_Company_Boss;
	
	@FindBy(id="txt__BTW__Company")
	WebElement txt_Company_BTW;
	
	@FindBy(id="txta__Remark__Company")
	WebElement txt_Company_Remark;
	
	
	@FindBy(id="chk__SendWeeklyMail__Company")
	WebElement Chk_Sendweeklymail;
	
	@FindBy(id="chk__SendWeeklyMail__Company")
	WebElement Edit_Chk_Sendweeklymail;
	
	@FindBy(id="chk__IsClient__Company")
	WebElement Chk_IsClient;
	
	@FindBy(id="chk__IsDisable__Company")
	WebElement Chk_IsDisable;
	
	
	@FindBy(xpath="//input[@id='txt__Companies__Name']")
	WebElement filter_CompanyName;
	
	@FindBy(id="btn_submit__Company")
	WebElement btn_editSaveCompanies;
	
	@FindBy(id="spd_btn_del__Companies__0")
	WebElement btn_delete_companies;
	
	
	
	
	@FindBy(id="spd_btn_edt__Companies__0")
	WebElement btn_edit_Companies;
	
	@FindBy(id="spd_btn_dtl__Companies__0")
	WebElement btn_view_Companies;
	
	
	@FindBy(id="txt__Username__Company")
	WebElement txt_editcompanyName;
	
	
//	@FindBy(id="txta____Description")
//	WebElement txt_editCompanyname;

	
	@FindBy(css = ".p-toast-detail")
	WebElement msg;
	
	@FindBy(id = "btn_reset__Company")
	WebElement reset_btn;
	
	@FindBy(xpath = "(//button[@type='button'])[7]")
	WebElement save_btn;
	
	@FindBy(xpath = "//button[@label='Import from Excel']")
	WebElement import_btn;


//============= Constructor ========================================================================//
	public AdministrationPage (WebDriver driver,Scenario scn)
	{
		this.driver= driver;
		this.scn=scn;
		
		PageFactory.initElements(driver, this);
	}
//===============================================================================================================
	
public void capturePassScreenshot(Scenario scn) {
		
		TakesScreenshot srnshot= ((TakesScreenshot)driver);
		byte [] data =srnshot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", "Name of passed step is: "+ scn.getName());
		scn.log("Attach a screenshot as step get passed");	
	}
//===========================================================Companies===============================================================

public void ClickOn_Administration_LeftMenu() throws IOException {
		
		utility.Wait.clickOn(driver, leftMenu_administration, 30);
		
		scn.log("Clicked on Administration");
	
	      }

public void ClickOn_Companies() {
		utility.Wait.clickOn(driver, leftmenu_companies, 30);
		
		scn.log("Clicked on Companies");
	    
}

public void  ClickOnNewCompanyButton() {
		

		utility.Wait.clickOn(driver, btn_NewCompany, 30);

		scn.log("Clicked on New company");
		   }
	
public void ClickOnSaveNewCompany () throws Exception {
    
       	 JavascriptExecutor executor = (JavascriptExecutor)driver;
    	 executor.executeScript("arguments[0].click();", btn_SaveNewCompany);
    	 scn.log("Clicked on save new company");
    	 Thread.sleep(1000);
    	 
    	 //
    	 try {
    	 String actualText=msg.getText();
    	    Thread.sleep(1500);
    	     String expectedText ="Data saved successfully.";
    	     Assert.assertEquals(actualText,expectedText);
    	     System.out.println("Toast message after click on save button :"   +actualText);
    	     scn.log("Toast message after click on save button : " + actualText);
    	     
    	     Thread.sleep(1500);
    	     
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		} 	 
     }

public void Create_New_Companies(String sheetName, int rowNumber) throws Exception {
	  
  	List<Map<String,String>> testData = reader.getData(path, sheetName);
  	
  	utility.Wait.sendKeys(driver, txt_Company_Name, 40,testData.get(rowNumber).get("Company_Name") );
  	scn.log("Entered Company Name : " + testData.get(rowNumber).get("Company_Name"));
  	
  	reset_btn.click();
  	
  	utility.Wait.sendKeys(driver, txt_Company_Name, 40,testData.get(rowNumber).get("Company_Name") );
  	scn.log("Entered Company Name : " + testData.get(rowNumber).get("Company_Name"));
  	
    utility.Wait.sendKeys(driver, txt_Company_Address, 40,testData.get(rowNumber).get("Company_Address") );
  	scn.log("Entered Company Address : " + testData.get(rowNumber).get("Company_Address"));
  	
  	Thread.sleep(1000);
  	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drp__Country__Company']/div/span")), 3000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 2000);
	WebElement search_CC = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_CC.sendKeys(testData.get(rowNumber).get("Company_Country"));
	Dropdown_Search(drps_Company_Country, testData.get(rowNumber).get("Company_Country"));
	scn.log("Selected Company Country is: "+testData.get(rowNumber).get("Company_Country"));
	
	
    utility.Wait.sendKeys(driver, txt_Company_Telephone, 40,testData.get(rowNumber).get("Company_Telephone") );
  	scn.log("Entered Company Telephone : " + testData.get(rowNumber).get("Company_Telephone"));
  	
    utility.Wait.sendKeys(driver, txt_Company_Location, 40,testData.get(rowNumber).get("Company_Location") );
  	scn.log("Entered Company Location : " + testData.get(rowNumber).get("Company_Location"));
  	
    utility.Wait.sendKeys(driver, txt_Company_Mail, 40,testData.get(rowNumber).get("Company_Mail") );
  	scn.log("Entered Company Mail: " + testData.get(rowNumber).get("Company_Mail"));
  	
    utility.Wait.sendKeys(driver, txt_Company_GSM, 40,testData.get(rowNumber).get("Company_GSM") );
  	scn.log("Entered Company GSM : " + testData.get(rowNumber).get("Company_GSM"));
  	
    utility.Wait.sendKeys(driver, txt_Company_FAX, 40,testData.get(rowNumber).get("Company_FAX") );
  	scn.log("Entered Company FAX : " + testData.get(rowNumber).get("Company_FAX"));
  	
  	utility.Wait.sendKeys(driver, txt_Company_BTW, 40,testData.get(rowNumber).get("Company_BTW") );
  	scn.log("Entered Company BTW : " + testData.get(rowNumber).get("Company_BTW"));
  	
  	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drp__ParentCompany__Company']/div/span")), 2000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 2000);
	WebElement search_PC = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_PC.sendKeys(testData.get(rowNumber).get("Company_Parent company"));
	Dropdown_Search(drps_Parent_Company, testData.get(rowNumber).get("Company_Parent company"));
	scn.log("Selected Parent company is: "+testData.get(rowNumber).get("Company_Parent company"));
	Thread.sleep(1000);
  	
  	utility.Wait.sendKeys(driver, txt_Company_Remark, 40,testData.get(rowNumber).get("Company_Remark") );
  	scn.log("Entered Company Remark : " + testData.get(rowNumber).get("Company_Remark"));
  	
  	if(testData.get(rowNumber).get("Chk_Send weekly mail").equalsIgnoreCase("Yes")) {
  		Chk_Sendweeklymail.click();
  		scn.log("Send weekly mail is Inactive");
		Thread.sleep(1000);
	}
	
	else {
		scn.log("Send weekly mail is active");
		System.out.println("Send weekly mail is active");
	} 	
//---------------------------------------------------------------------------------------------------
  	if(testData.get(rowNumber).get("Chk_Is Client").equalsIgnoreCase("Yes")) {
  		Chk_IsClient.click();
  		scn.log("Is Client is Inactive");
		Thread.sleep(1000);
	}
	
	else {
		
		scn.log("Is Client is active");
		System.out.println("Is Client is active");
	} 	
//--------------------------------------------------------------------------------------------------------------------
  	if(testData.get(rowNumber).get("Chk_Is Disable").equalsIgnoreCase("Yes")) {
  		Chk_IsDisable.click();
  		scn.log("Is Disable is Inactive");
		Thread.sleep(1000);
	}
	
	else {
		
		scn.log("Is Disable is active");
		System.out.println("Is Disable is active");
	} 	

}

 //============================================================  

	 public void TextFilter_Companies(String sheetName, int rowNumber) throws Exception {
		
		Thread.sleep(1500);
		List<Map<String,String>> testData = reader.getData(path, sheetName);	
		filter_CompanyName.sendKeys(testData.get(rowNumber).get("Company_Name"),Keys.TAB);
		scn.log("Enter filter text : " +testData.get(rowNumber).get("Company_Name"));
		scn.log("Filtered company name From the table");
		Thread.sleep(1500);
	 }
	 
	  public void TextFilter_afterEdit_Companies(String sheetName, int rowNumber) throws Exception {
		  Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		 System.out.println("Enter filter text : "+testData.get(rowNumber).get("Edit_Company_Name")); 
			Thread.sleep(1000);	
			filter_CompanyName.clear();
			filter_CompanyName.sendKeys(testData.get(rowNumber).get("Edit_Company_Name"),Keys.TAB);
			scn.log("Filtered company name After edit");  
	  }
	  
	  
	  public void ClickOnEditButtonCompaniesOnSpeedDial() {

		utility.Wait.clickOn(driver, btn_edit_Companies, 50);
		  scn.log("Clicked on edit to companies");
	  }   
	 
	  
	  public void ClickOnViewButtonCompaniesOnSpeedDial() {

			utility.Wait.clickOn(driver, btn_view_Companies, 50);
			  scn.log("Clicked on view to cpmpanies");
		  }   
	  

	  public void Edit_CompaniesDetails(String sheetName, int RowNumber) throws InvalidFormatException, IOException, Exception {
		List<Map<String,String>> testData = reader.getData(path, sheetName); 	
		utility.Wait.clickOn(driver, txt_editcompanyName, 40);
		txt_editcompanyName.clear(); 
		txt_editcompanyName.sendKeys(testData.get(RowNumber).get("Edit_Company_Name"));
	  	scn.log("Enter Updated/edited to company name : " +testData.get(RowNumber).get("Edit_Company_Name"));	
	  	

	  	if(testData.get(RowNumber).get("Edit_Chk_Send weekly mail").equalsIgnoreCase("Yes")) {
	  		Chk_Sendweeklymail.click();
	  		scn.log("Checkbox Updated/edited : " +testData.get(RowNumber).get("Edit_Company_Name"));
	  		scn.log("Send weekly mail is Inactive");
			Thread.sleep(1000);
		}
		
		else {
			
			scn.log("Send weekly mail is active");
			System.out.println("Send weekly mail is active");
		} 	
	  	
	  }
	  
	  public void Edit_ClickOnSaveCompanies () {
	  utility.Wait.clickOn(driver, btn_editSaveCompanies, 50);
		
		scn.log("Clicked on save button");
		
		//==============assertion==================
	   	 try {
	   		 Thread.sleep(1000);
	   	 String actualText=msg.getText();
	   	    Thread.sleep(1500);
	   	     String expectedText = "Data updated successfully.";
	   	     Assert.assertEquals(actualText,expectedText);
	   	     System.out.println("Toast message after click on save button :"   +actualText);
	   	   scn.log("Toast message after click on save button : " + actualText);
	   	     
	   	     Thread.sleep(1500);
	   	     
	   		} catch (InterruptedException e) {
	   			e.printStackTrace();
	   		} 		

	  }
	  
	  
	  public void ClickOnDeleteButtonCompaniesOnSpeedDial() {		  
			 utility.Wait.clickOn(driver, btn_delete_companies, 300); 
			 System.out.println("Click on delete button");  
			 scn.log("Clicked on delete  button");
		  }
	  
	  public void ClickOnNoButton() {

			utility.Wait.clickOn(driver, btn_No, 90);
			  System.out.println("Click on No ");
			  scn.log("Clicked on No ");
		  }   
	  
	  
	  public void ClickOnYesButton() {

			utility.Wait.clickOn(driver, btn_Yes, 90);
			  System.out.println("Click on Yes ");
			  scn.log("Clicked on Yes ");
		  }   
	  
	  
	  
		  
	  public void Edit_ClickOnSaveToCompanies () {
		  utility.Wait.clickOn(driver, btn_editSaveCompanies, 50);
		
		scn.log("Clicked on Save Button");
		
		//==============assertion==================
	   	 try {
	   		 Thread.sleep(1000);
	   	 String actualText=msg.getText();
	   	    Thread.sleep(1500);
	   	     String expectedText = "Data updated successfully.";
	   	     Assert.assertEquals(actualText,expectedText);
	   	     System.out.println("Toast message after click on save button :"   +actualText);
	   	   scn.log("Toast message after click on save button : " + actualText);
	   	     
	   	     Thread.sleep(1500);
	   	     
	   		} catch (InterruptedException e) {
	   			e.printStackTrace();
	   		} 		

	  }
	  

//=====================================To URL==========================================================================


public void ClickOn_ToUrl() {
	
	utility.Wait.clickOn(driver, leftmenu_url, 30);
	
	scn.log("Clicked on To Url ");
    
}

public void  ClickOnNewUrlButton() {
	

	utility.Wait.clickOn(driver, btn_NewUrl, 30);

	scn.log("Clicked on New Url");
	   }

public void Create_New_to_url(String sheetName, int rowNumber) throws Exception {
	  
  	List<Map<String,String>> testData = reader.getData(path, sheetName);
  	
  	utility.Wait.sendKeys(driver, txt_ToUrlName, 30,testData.get(rowNumber).get("Name_ToUrl") );
  	
  	scn.log("Entered name of url : " + testData.get(rowNumber).get("Name_ToUrl"));

    utility.Wait.sendKeys(driver, txt_ToUrlDescription, 30,testData.get(rowNumber).get("Description_ToUrl") );
  	
  	scn.log("Entered description of url : " + testData.get(rowNumber).get("Description_ToUrl"));

  	if(testData.get(rowNumber).get("Chk_ToUrl").equalsIgnoreCase("Yes")) {
		Chk_ToUrlInactive.click();
		Thread.sleep(1000);
	}
	
	else {
		
		scn.log("Url is active");
		System.out.println("To Url is active");
	} 	
}

public void ClickOnSaveNewToUrl () {

	utility.Wait.clickOn(driver, btn_ToUrlSave, 60);
	 scn.log("Clicked on save to url");

	 try {
		 Thread.sleep(1500);
	    String actualText=msg.getText();
	    Thread.sleep(1000);
	    scn.log("Toast message after click on save button : " + actualText);
	     String expectedText = "Data saved successfully.";
	     Assert.assertEquals(actualText,expectedText);
	     System.out.println("Toast message after click on save button : "   +actualText);

	     Thread.sleep(1500);
	     
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 	 
}
   

	 public void TextFilter_Url(String sheetName, int rowNumber) throws Exception {
		
		 Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		
		Thread.sleep(1000);		
		filter_Url.sendKeys(testData.get(rowNumber).get("Name_ToUrl"),Keys.TAB);
		
		scn.log("Enter filter text : " +testData.get(rowNumber).get("Name_ToUrl"));
		
		scn.log("Filtered To Url From the table");
	   }
	 
	  public void TextFilter_afterEdit_URL(String sheetName, int rowNumber) throws Exception {
		  Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		 System.out.println("Enter filter text : "+testData.get(rowNumber).get("Edit_Name_ToUrl")); 
			Thread.sleep(1000);	
			filter_Url.clear();
			filter_Url.sendKeys(testData.get(rowNumber).get("Edit_Name_ToUrl"),Keys.TAB);
			scn.log("Filtered To url After edit");
		  
	  }
	  
	  
	public void Edit_ClickOnSpeedDialButton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {	
		e.printStackTrace();
	}
	utility.Wait.untilvisible(driver, btn_speedDial, 150);
		  utility.Wait.clickOn(driver, btn_speedDial, 60);
		  scn.log("Clicked on SpeedDial button");
	  }
	  
	  public void ClickOnEditButtonOnSpeedDial() {

		utility.Wait.clickOn(driver, btn_edit_URL, 90);
		  System.out.println("Click on edit to url");
		  scn.log("Clicked on edit to url");
	  }   
	 
	  
	  public void ClickOnViewButtonOnSpeedDial() {

			utility.Wait.clickOn(driver, btn_view_URL, 90);
			  System.out.println("Click on view to url");
			  scn.log("Clicked on view to url");
		  }   
	 
	  
	  public void ClickOnClose() {

			utility.Wait.clickOn(driver, btn_close, 90);
			  System.out.println("Click on close ");
			  scn.log("Clicked on close ");
		  }   
	  
	  public  void edit_enter_new_ToUrlName(String sheetName, int RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = reader.getData(path, sheetName); 	
		utility.Wait.clickOn(driver, txt_editUrlName, 40);
		txt_editUrlName.clear(); 
		txt_editUrlName.sendKeys(testData.get(RowNumber).get("Edit_Name_ToUrl"));
	  	scn.log("Enter Updated/edited to url name : " +testData.get(RowNumber).get("Edit_Name_ToUrl"));	  	
	  }
	  
	  public void edit_enter_newToUrlDescription(String sheetName, int rowNumber) throws Exception {
		List<Map<String,String>> testData = reader.getData(path, sheetName); 
 
	  	utility.Wait.clickOn(driver, txt_editUrlDescription, 40);
	  	txt_editUrlDescription.clear();
	  	txt_editUrlDescription.sendKeys(testData.get(rowNumber).get("Edit_Description_ToUrl"));
		scn.log("Enter Updated/edited to url description : " +testData.get(rowNumber).get("Edit_Description_ToUrl"));
	 	Thread.sleep(1500);
	  }
	 
	  public void edit_ClickOnSaveToUrl () {
		  utility.Wait.clickOn(driver, btn_editSaveUrl, 50);
		
		scn.log("Clicked on Save");
		
		//==============assertion==================
	   	 try {
	   		 Thread.sleep(1000);
	   	 String actualText=msg.getText();
	   	    Thread.sleep(1500);
	   	     String expectedText = "Data updated successfully.";
	   	     Assert.assertEquals(actualText,expectedText);
	   	     System.out.println("Toast message after click on save button :"   +actualText);
	   	   scn.log("Toast message after click on save button : " + actualText);
	   	     
	   	     Thread.sleep(1500);
	   	     
	   		} catch (InterruptedException e) {
	   			e.printStackTrace();
	   		} 		

	  }
	  
	  public void clickOnClearFilter() {
	
		  utility.Wait.untilvisible(driver, btn_ClearFilter, 90);
		  utility.Wait.clickOn(driver, btn_ClearFilter, 50);
		  
	  }
	  
	  
	  public void ClickOnDeleteButtonOnSpeedDial() {		  
			 utility.Wait.clickOn(driver, btn_delete, 300); 
			 System.out.println("Click on delete button");  
			 scn.log("Clicked on delete  button");
		  }
	  
	  
	  public void delete_Record_yes() {
		  	
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				utility.Wait.clickOn(driver, btn_delete_yes, 100);
				
				scn.log("Clicked on Yes button on Confirmation popup message.");
				
				try {Thread.sleep(1500);
				   	 String actualText=msg.getText();
				   	    Thread.sleep(1500);
				   	     String expectedText = "Data deleted successfully.";
				   	     Assert.assertEquals(actualText,expectedText);
				   	   scn.log("Assert passed");
				   	     System.out.println("Toast message after clicked on yes button :"   +actualText);
				   	      scn.log("Toast message after clicked on yes button : " + actualText);
				   	     
				   	     Thread.sleep(1500);
				   	     
				   		} catch (InterruptedException e) {
				   			e.printStackTrace();
				   		} 					
		}
		  
//======================================================================================logins====================================
  

public void ClickOn_Logins() {
	
	utility.Wait.clickOn(driver, leftmenu_logins, 30);
	scn.log("Clicked on Logins ");
    
}

public void  ClickOnNewLoginsButton() {
	
	utility.Wait.clickOn(driver, btn_NewLogins, 30);

	scn.log("Clicked on new logins");
	   }



public void Create_New_Logins(String sheetName, int rowNumber) throws Exception {
	  
  	List<Map<String,String>> testData = reader.getData(path, sheetName);
  	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps___COMPANY_LOGIN__CompanyId']/div/span")), 3000);
	Thread.sleep(2000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 3000);
	WebElement search_Company = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_Company.sendKeys(testData.get(rowNumber).get("Company_Login"));
	Dropdown_Search(drps_LoginCompany, testData.get(rowNumber).get("Company_Login"));
	scn.log("Selected comapany is: "+testData.get(rowNumber).get("Company_Login"));
	  Thread.sleep(2000);

     utility.Wait.sendKeys(driver, txt_LoginName, 40,testData.get(rowNumber).get("Login_Name") );
  	
  	scn.log("Entered Login name : " + testData.get(rowNumber).get("Login_Name"));
  	
     utility.Wait.sendKeys(driver, txt_Loginpassword, 40,testData.get(rowNumber).get("Login_Password") );
  	
  	scn.log("Entered Password : " + testData.get(rowNumber).get("Login_Password"));
 
  	
  	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,200)", "");
    utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps___COMPANY_LOGIN__TsUrlId']/div/span")), 3000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 3000);
	WebElement search_tourl = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_tourl.sendKeys(testData.get(rowNumber).get("ToUrl"));
	Dropdown_Search(drps_Logintourl, testData.get(rowNumber).get("ToUrl"));
	
	scn.log("Selected To url is: "+testData.get(rowNumber).get("ToUrl"));
	Thread.sleep(2000);
  	
  	
  
}


public void ClickOnSaveNewLogin () {

	utility.Wait.clickOn(driver, btn_LoginSave, 60);
	 scn.log("Clicked on save to login");

	 try {
		 Thread.sleep(1500);
	    String actualText=msg.getText();
	    Thread.sleep(1000);
	    scn.log("Toast message after click on save button : " + actualText);
	     String expectedText = "Data saved successfully.";
	     Assert.assertEquals(actualText,expectedText);
	     System.out.println("Toast message after click on save button : "   +actualText);

	     Thread.sleep(1500);
	     
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 	 
}
   

public void Create_New_Logins_fromCompanies(String sheetName, int rowNumber) throws Exception {
	  
  	List<Map<String,String>> testData = reader.getData(path, sheetName);
  
  	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps____CompanyId']/div/span")), 3000);
	
	Thread.sleep(2000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 3000);
	WebElement search_Company = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_Company.sendKeys(testData.get(rowNumber).get("Company_Login"));
	Dropdown_Search(drps_LoginCompany, testData.get(rowNumber).get("Company_Login"));
	scn.log("Selected comapany is: "+testData.get(rowNumber).get("Company_Login"));
	  Thread.sleep(2000);
    
	utility.Wait.sendKeys(driver, txt_LoginNamecompanies, 40,testData.get(rowNumber).get("Login_Name") );
  	scn.log("Entered Login name : " + testData.get(rowNumber).get("Login_Name"));
  	
  	utility.Wait.sendKeys(driver, txt_Loginpasswordcompanies, 40,testData.get(rowNumber).get("Login_Password") );
  	scn.log("Entered Password : " + testData.get(rowNumber).get("Login_Password"));
  	
    Thread.sleep(2000);
    
    utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps____TsUrlId']/div/span")), 3000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 3000);
	WebElement search_tourl = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_tourl.sendKeys(testData.get(rowNumber).get("ToUrl"));
	Dropdown_Search(drps_Logintourl, testData.get(rowNumber).get("ToUrl"));
	
	scn.log("Selected To url is: "+testData.get(rowNumber).get("ToUrl"));
	Thread.sleep(2000);
  	
  	
  
}

public void ClickOnSaveNewLoginCompanies () {

	utility.Wait.clickOn(driver, btn_LoginSavecompanies, 60);
	 scn.log("Clicked on save to company login");

	 try {
		 Thread.sleep(1500);
	    String actualText=msg.getText();
	    Thread.sleep(1000);
	    scn.log("Toast message after click on save button : " + actualText);
	     String expectedText = "Data saved successfully.";
	     Assert.assertEquals(actualText,expectedText);
	     System.out.println("Toast message after click on save button : "   +actualText);

	     Thread.sleep(1500);
	     
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 	 
}
   

	 public void TextFilter_Login(String sheetName, int rowNumber) throws Exception {
		
		
	Thread.sleep(1500);
	List<Map<String,String>> testData = reader.getData(path, sheetName);
		 
	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-multiselect[@id='drpm__Logins__Company']")), 3000);		
	Thread.sleep(2000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-multiselect-filter-container.ng-star-inserted")), 3000);
			WebElement filter_Company = driver.findElement(By.xpath("//input[@role='textbox']"));
			filter_Company.sendKeys(testData.get(rowNumber).get("Company_Login"));
			Dropdown_Search(drps_filterCompany, testData.get(rowNumber).get("Company_Login"));
			
			scn.log("Enter filter comapany is: "+testData.get(rowNumber).get("Company_Login"));
			
			WebElement close = driver.findElement(By.xpath("//timesicon[@class='p-element p-icon-wrapper ng-star-inserted']"));

            close.click();
            Thread.sleep(1000);
		
		
		Thread.sleep(1000);		
		filter_LoginName.sendKeys(testData.get(rowNumber).get("Login_Name"),Keys.TAB);
		
		scn.log("Enter filter text : " +testData.get(rowNumber).get("Login_Name"));
		
		scn.log("Filtered login name From the table");
		
		
		
  
		
	   }
	 
	  public void TextFilter_afterEdit_Login(String sheetName, int rowNumber) throws Exception {
		  Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		 System.out.println("Enter filter text : "+testData.get(rowNumber).get("Edit_Login_Name")); 
			Thread.sleep(1000);	
			filter_LoginName.clear();
			filter_LoginName.sendKeys(testData.get(rowNumber).get("Edit_Login_Name"),Keys.TAB);
			scn.log("Filtered login name After edit");  
	  }
	  
	  
	public void editLogin_ClickOnSpeedDialButton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {	
		e.printStackTrace();
	}
	utility.Wait.untilvisible(driver, btn_speedDial, 150);
		  utility.Wait.clickOn(driver, btn_speedDial, 60);
		  scn.log("Clicked on SpeedDial button");
	  }
	  
	  public void ClickOnEditLoginButtonOnSpeedDial() {

		utility.Wait.clickOn(driver, btn_edit_Login, 90);
		  System.out.println("Click on edit Login");
		  scn.log("Clicked on edit Login");
	  }   
	 
	  
	  public void ClickOnViewLoginButtonOnSpeedDial() {

			utility.Wait.clickOn(driver, btn_view_Login, 90);
			  System.out.println("Click on view to Login");
			  scn.log("Clicked on view to Login");
		  }   
	  
	
	  public void ClickOnLoginclose() {

			utility.Wait.clickOn(driver, btn_close, 90);
			  System.out.println("Click on close ");
			  scn.log("Clicked on close ");
		  }   
	  
	  public  void edit_enter_new_LoginName(String sheetName, int RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = reader.getData(path, sheetName); 	
		utility.Wait.clickOn(driver, txt_editLoginName, 40);
		txt_editLoginName.clear(); 
		txt_editLoginName.sendKeys(testData.get(RowNumber).get("Edit_Login_Name"));
	  	scn.log("Enter Updated/edited login name : " +testData.get(RowNumber).get("Edit_Login_Name"));	  	
	  }
	  
	  public void edit_enter_new_LoginPassword(String sheetName, int rowNumber) throws Exception {
		List<Map<String,String>> testData = reader.getData(path, sheetName); 
 
	  	utility.Wait.clickOn(driver, txt_editLoginPassword, 40);
	  	txt_editLoginPassword.clear();
	  	txt_editLoginPassword.sendKeys(testData.get(rowNumber).get("Edit_Login_Password"));
		scn.log("Enter Updated/edited password : " +testData.get(rowNumber).get("Edit_Login_Password"));
	 	Thread.sleep(1500);
	  }
	 
	  public void edit_ClickOnSaveToLogin () {
		  utility.Wait.clickOn(driver, btn_editSaveLogin, 50);
		
		scn.log("Clicked on Save");
		
		//==============assertion==================
	   	 try {
	   		 Thread.sleep(1000);
	   	 String actualText=msg.getText();
	   	    Thread.sleep(1500);
	   	     String expectedText = "Data updated successfully.";
	   	     Assert.assertEquals(actualText,expectedText);
	   	     System.out.println("Toast message after click on save button :"   +actualText);
	   	   scn.log("Toast message after click on save button : " + actualText);
	   	     
	   	     Thread.sleep(1500);
	   	     
	   		} catch (InterruptedException e) {
	   			e.printStackTrace();
	   		} 		

	  }
	  
  
	  public void ClickOnDeleteButtonLoginOnSpeedDial() {		  
			 utility.Wait.clickOn(driver, btn_delete_Login, 300); 
			 System.out.println("Click on delete button");  
			 scn.log("Clicked on delete  button");
	  }

	  
//=======================================================Logins	  
	  
	  
	  

public void ClickOn_ContactPerson() {
	
	utility.Wait.clickOn(driver, leftmenu_contactperson, 30);
	scn.log("Clicked on Contact Person ");
    
}

public void  ClickOnNewContactPersonButton() {
	
	utility.Wait.clickOn(driver, btn_NewContactPerson, 30);

	scn.log("Clicked on Contact Person");
	   }


public void Dropdown_Search(List <WebElement> element, String Text) {
	try {
	
for (int i=0;i<=element.size()-1;i++) {
	Thread.sleep(1000);
	WebElement singleElement = element.get(i);
	utility.Wait.untilvisible(driver, singleElement, 2000);  

	String singleText = singleElement.getText();

	  if(singleText.equalsIgnoreCase(Text)) {
		  singleElement.click(); 
		  break;
	  }
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
 }

public void Create_New_Contact_Person(String sheetName, int rowNumber) throws Exception {
	  
  	List<Map<String,String>> testData = reader.getData(path, sheetName);
  	
  	utility.Wait.sendKeys(driver, txt_ContactPersonName, 40,testData.get(rowNumber).get("Name_ContactPerson") );
  	
  	scn.log("Entered Contact person name : " + testData.get(rowNumber).get("Name_ContactPerson"));
  	
  	Thread.sleep(2000);
  	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps___CONTACT_PERSON__CompanyId']/div/span")), 3000);
	Thread.sleep(2000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 3000);
	WebElement search_Company = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_Company.sendKeys(testData.get(rowNumber).get("Company_ContactPerson"));
	Dropdown_Search(drps_ContactPersonCompany, testData.get(rowNumber).get("Company_ContactPerson"));
	
	scn.log("Selected comapany is: "+testData.get(rowNumber).get("Company_ContactPerson"));
	Thread.sleep(2000);

  	if(testData.get(rowNumber).get("Chk_In active_ContactPerson").equalsIgnoreCase("Yes")) {
		Chk_ContactPersonInactive.click();
		Thread.sleep(1000);
	}
	
	else {
		
		scn.log("Contact Person is active");
		System.out.println("Contact Person is active");
	} 	
}

//=================================================================================



public void Create_Multiple_Contact_Persons(String sheetName) throws Exception {
    // Get all data from the sheet
    List<Map<String, String>> testData = reader.getData(path, sheetName);
// Loop through each row and create a contact person
    for (int rowNumber = 0; rowNumber < testData.size(); rowNumber++) {
    	
    	 // Check if the necessary data is empty
        String contactPersonName = testData.get(rowNumber).get("Name_ContactPerson");
        String companyName = testData.get(rowNumber).get("Company_ContactPerson");

        // If either contact person name or company name is empty, break the loop
        if (contactPersonName == null || contactPersonName.isEmpty() || companyName == null || companyName.isEmpty()) {
            scn.log("Empty data found at row " + rowNumber + ". Stopping the process.");
            break;
        }
    	
        // Create a new contact person
    	
    	ClickOnNewContactPersonButton();
    	
        Create_New_Contact_Person(sheetName, rowNumber);
        
        // Click save for the new contact person
        ClickOnSaveNewContactPerson();
        
        // Optional: Add a small delay between creations
        Thread.sleep(2000);
        

    }
}

//=====================================================================================
public void ClickOnSaveNewContactPerson () {

	utility.Wait.clickOn(driver, btn_ContactPersonSave, 60);
	 scn.log("Clicked on save to Contact Person");

	 try {
		 Thread.sleep(1500);
	    String actualText=msg.getText();
	    Thread.sleep(1000);
	    scn.log("Toast message after click on save button : " + actualText);
	     String expectedText = "Data saved successfully.";
	     Assert.assertEquals(actualText,expectedText);
	     System.out.println("Toast message after click on save button : "   +actualText);

	     Thread.sleep(1500);
	     
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 	 
}
   

	 public void TextFilter_ContactPerson(String sheetName, int rowNumber) throws Exception {
		
		 Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		
		Thread.sleep(1000);		
		filter_ContactPerson.sendKeys(testData.get(rowNumber).get("Name_ContactPerson"),Keys.TAB);
		
		scn.log("Enter filter text : " +testData.get(rowNumber).get("Name_ContactPerson"));
		
		scn.log("Filtered Contact person name From the table");
	
		utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-multiselect[@id='drpm__Contact_Persons__Company']")), 3000);
		
		Thread.sleep(2000);
		utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-multiselect-filter-container.ng-star-inserted")), 3000);
		WebElement filter_Company = driver.findElement(By.xpath("//input[@role='textbox']"));
		filter_Company.sendKeys(testData.get(rowNumber).get("Company_ContactPerson"));
		Dropdown_Search(drps_filterCompany, testData.get(rowNumber).get("Company_ContactPerson"));
		
		scn.log("Enter filter comapany is: "+testData.get(rowNumber).get("Company_ContactPerson"));
		
		WebElement close = driver.findElement(By.xpath("//timesicon[@class='p-element p-icon-wrapper ng-star-inserted']"));

            close.click();
            Thread.sleep(1000);
		
	   }
	 
	  public void TextFilter_afterEdit_ContactPerson(String sheetName, int rowNumber) throws Exception {
		  Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		 System.out.println("Enter filter text : "+testData.get(rowNumber).get("Edit_Name_ContactPerson")); 
			Thread.sleep(1000);	
			filter_ContactPerson.clear();
			filter_ContactPerson.sendKeys(testData.get(rowNumber).get("Edit_Name_ContactPerson"),Keys.TAB);
			scn.log("Filtered Contact person name After edit");  
	  }
	  
	  
	public void editContactPerson_ClickOnSpeedDialButton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {	
		e.printStackTrace();
	}
	utility.Wait.untilvisible(driver, btn_speedDial, 150);
		  utility.Wait.clickOn(driver, btn_speedDial, 60);
		  scn.log("Clicked on SpeedDial button");
	  }
	  
	  public void ClickOnEditContactPersonButtonOnSpeedDial() {

		utility.Wait.clickOn(driver, btn_edit_ContactPerson, 90);
		  System.out.println("Click on edit Contact Person");
		  scn.log("Clicked on edit Contact Person");
	  }   
	 
	  
	  public void ClickOnViewContactPersonButtonOnSpeedDial() {

			utility.Wait.clickOn(driver, btn_view_ContactPerson, 90);
			  System.out.println("Click on view to Contact Person");
			  scn.log("Clicked on view to Contact Person");
		  }   
	  
	
	  public void ClickOnContactPersonClose() {

			utility.Wait.clickOn(driver, btn_close, 90);
			  System.out.println("Click on close ");
			  scn.log("Clicked on close ");
		  }   
	  
	  public  void edit_enter_new_ContactPersonName(String sheetName, int RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = reader.getData(path, sheetName); 	
		utility.Wait.clickOn(driver, txt_editContactPersonName, 40);
		txt_editContactPersonName.clear(); 
		txt_editContactPersonName.sendKeys(testData.get(RowNumber).get("Edit_Name_ContactPerson"));
	  	scn.log("Enter Updated/edited contact person name : " +testData.get(RowNumber).get("Edit_Name_ContactPerson"));	  	
	  }
	  
	  public void edit_enter_newContactPersonCompany(String sheetName, int rowNumber) throws Exception {
		List<Map<String,String>> testData = reader.getData(path, sheetName); 
 
	  	utility.Wait.clickOn(driver, txt_editContactPersonCompany, 40);
	  	txt_editContactPersonCompany.clear();
	  	txt_editContactPersonCompany.sendKeys(testData.get(rowNumber).get("Edit_Company_ContactPerson"));
		scn.log("Enter Updated/edited company : " +testData.get(rowNumber).get("Edit_Company_ContactPerson"));
	 	Thread.sleep(1500);
	  }
	 
	  public void edit_ClickOnSaveToContactPerson () {
		  utility.Wait.clickOn(driver, btn_editSaveContactPerson, 50);
		
		scn.log("Clicked on Save");
		
		//==============assertion==================
	   	 try {
	   		 Thread.sleep(1000);
	   	 String actualText=msg.getText();
	   	    Thread.sleep(1500);
	   	     String expectedText = "Data updated successfully.";
	   	     Assert.assertEquals(actualText,expectedText);
	   	     System.out.println("Toast message after click on save button :"   +actualText);
	   	   scn.log("Toast message after click on save button : " + actualText);
	   	     
	   	     Thread.sleep(1500);
	   	     
	   		} catch (InterruptedException e) {
	   			e.printStackTrace();
	   		} 		

	  }
	  
  
	  public void ClickOnDeleteButtonContactPersonOnSpeedDial() {		  
			 utility.Wait.clickOn(driver, btn_delete_ContactPerson, 300); 
			 System.out.println("Click on delete button");  
			 scn.log("Clicked on delete  button");
	  }
 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
