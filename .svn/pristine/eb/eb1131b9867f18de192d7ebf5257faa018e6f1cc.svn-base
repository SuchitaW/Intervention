package pageobjects;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import utility.ExcelReader;

public class MasterPage {
	
	public WebDriver driver;
	Scenario scn;
	WebDriverWait wait;
	
	String path = System.getProperty("user.dir")+"//xls//Intervation.xlsx";
	ExcelReader reader = new ExcelReader();
	
	String importexcel = System.getProperty("user.dir")+"\\xls\\Report.xlsx";
	
	
		// TODO Auto-generated method stub

	
	
//============= Locators for WebElements on Landing page============================================//
	@FindBy(id="menu_Master")
	WebElement leftMenu_master;
	
	@FindBy(id="menu_Master_Projects")
	WebElement leftmenu_projects;
	
	@FindBy(id="menu_Master_InterventionTypes")
	WebElement leftmenu_InterventionTypes;
	
	@FindBy(id="menu_Master_InterventionCodes")
	WebElement leftmenu_InterventionCodes;
	
	@FindBy(id="btn_add__Intervention_code")
	WebElement btn_NewInterventionCodes;
	
	@FindBy(id="txt___INTERVENTION_CODE__Name")
	WebElement txt_InterventionCodesName;
	

	@FindBy (xpath="//ul/p-dropdownitem/li/div")
	List <WebElement> drps_Interventiontype;
	
	
	@FindBy(id="chk___INTERVENTION_CODE__Default")
	WebElement Chk_Default_Interventioncode;
	
	@FindBy(id="chk___INTERVENTION_CODE__IsDeleted")
	WebElement Chk_Inactive_Interventioncode;
	
	
	
	@FindBy(id="btn_reset___INTERVENTION_CODE")
	WebElement btn_InterventioncodeReset;
	
	@FindBy(id="btn_sub___INTERVENTION_CODE")
	WebElement btn_InterventioncodeSave;
	
	
	@FindBy(xpath="//input[@id='txt__Intervention_code__Name']")
	WebElement filter_InterventionCodesName;
	
	
	@FindBy(xpath="//tbody//tr//td[2]//button//span")
	WebElement btn_speedDial;
	
	
	@FindBy(id="spd_btn_edt__Intervention_code__0")
	WebElement btn_edit_Intervention_code;
	
	@FindBy(id="spd_btn_dtl__Intervention_code__0")
	WebElement btn_view_Intervention_code;
	
	
	@FindBy(id="spd_btn_del__Intervention_code__0")
	WebElement btn_delete;
	
	@FindBy(id="txt____Name")
	WebElement txt_editInterventionCodesName;
	
	
	@FindBy(id="btn_sub__")
	WebElement btn_editSaveInterventioncode;
	
	@FindBy(css=".p-badge")
	WebElement btn_ClearFilter;
  	
	@FindBy(xpath="//span[text()='Yes']")
	 WebElement btn_delete_yes;
	   
	 @FindBy(xpath="//button[contains(@class,'p-dialog-header-icon p-dialog-header-maximize p-link ng-star-inserted')]")
	  WebElement btn_close;
	 //=================================================================================================
		@FindBy(id="menu_Master_InterventionTypes")
		WebElement leftmenu_InterventionType;
		
		@FindBy(id="btn_add__Intervention_Type")
		WebElement btn_NewInterventionType;
		
		@FindBy(id="txt___INTERVENTION_TYPE__Name")
		WebElement txt_InterventionTypeName;
		
		@FindBy(id="chk___INTERVENTION_TYPE__IsDeleted")
		WebElement Chk_Inactive_Interventiontype;
		
		@FindBy(id="btn_reset___INTERVENTION_TYPE")
		WebElement btn_InterventiontypeReset;
		
		@FindBy(id="btn_sub___INTERVENTION_TYPE")
		WebElement btn_InterventiontypeSave;
		
		@FindBy(xpath="//input[@id='txt__Intervention_Type__Name']")
		WebElement filter_InterventionTypeName;
		
		@FindBy(id="spd_btn_edt__Intervention_Type__0")
		WebElement btn_edit_Intervention_type;
		
		@FindBy(id="spd_btn_dtl__Intervention_Type__0")
		WebElement btn_view_Intervention_type;
		
		
		@FindBy(id="spd_btn_del__Intervention_Type__0")
		WebElement btn_delete_type;
		
		@FindBy(id="txt____Name")
		WebElement txt_editInterventiontypeName;
	 
	 //===================================================================
	 
		@FindBy(id="menu_Master_Projects")
		WebElement leftmenu_Projects;
		
		@FindBy(id="btn_add__Projects")
		WebElement btn_NewProjects;
		
		@FindBy(id="txt___PROJECTS__Username")
		WebElement txt_NewProjectsName;
		
		@FindBy(id="chk___PROJECTS__In_active")
		WebElement Chk_Inactive_Projects;
		
		@FindBy(id="chk___PROJECTSisAllCompany")
		WebElement Chk_Inactive_forallcompany;
		
		@FindBy(id="btn_reset___PROJECTS")
		WebElement btn_ProjectsReset;
		
		@FindBy(id="btn_submit___PROJECTS")
		WebElement btn_ProjectsSave;
		
		@FindBy(xpath="//input[@id='txt__Projects__Name']")
		WebElement filter_ProjectsName;
		
		@FindBy(id="spd_btn_edt__Projects__0")
		WebElement btn_edit_Projects;
		
		@FindBy(id="spd_btn_dtl__Projects__0")
		WebElement btn_view_Projects;
		
		
		@FindBy(id="spd_btn_del__Projects__0")
		WebElement btn_delete_Projects;
		
		@FindBy(id="txt___PROJECTS__Username")
		WebElement txt_editProjectsName;
	 
		@FindBy(id="spd_btn_del__Projects__0")
		WebElement btn_delete_project;
	//==================================================================================
		
		@FindBy(css = ".p-toast-detail")
		WebElement msg;
		
		@FindBy(xpath = "//button[@class='p-element p-button-danger p-button p-component']")
		WebElement reset_btn;
		
		
		@FindBy(xpath = "(//button[@type='button'])[7]")
		WebElement save_btn;
		
		@FindBy(xpath = "//button[@label='Import from Excel']")
		WebElement import_btn;

		
		@FindBy(id="menu_Master_Users")
		WebElement leftmenu_User;
		
		
		@FindBy(id="btn_add__Users")
		WebElement btn_NewUser;
		
		@FindBy(id="txt___USERS__Name")
		WebElement txt_UserName;
		
		
		@FindBy(id="txt___USERS__Email")
		WebElement txt_UserEmail;
		
		@FindBy(id="chk___USERS__IsDeleted")
		WebElement Chk_Inactive_User;
		
		@FindBy(id="btn_reset___USERS")
		WebElement btn_UserReset;
		
		@FindBy(id ="btn_sub___USERS")
		WebElement saveuser_btn;
		
		
		@FindBy(xpath="//input[@id='txt__Users__Name']")
		WebElement filter_Name;
		
		@FindBy(xpath="//input[@id='txt__Users__AspNetUsersEmail']")
		WebElement filter_UserEmail;
		
		
		@FindBy(id="chk__Users__IsDeleted")
		WebElement Chk_Inactive;
		
		@FindBy(id="spd_btn_dtl__Users__0")
		WebElement btn_view_User;
		
		
		@FindBy(id="spd_btn_dtl__Users__0")
		WebElement btn_inactive;
		
		
		@FindBy(xpath="//Input[@role='switch']")
		WebElement chk_InActiveTrue;
		
		
//		@FindBy(xpath="//button[@type='button']//timesicon")
//		WebElement btn_close;
		
//============= Constructor ========================================================================//
	public MasterPage (WebDriver driver,Scenario scn)
	{
		this.driver= driver;
		this.scn=scn;
		
		PageFactory.initElements(driver, this);
	}
	
//=======================================================================
public void capturePassScreenshot(Scenario scn) {
		
		TakesScreenshot srnshot= ((TakesScreenshot)driver);
		byte [] data =srnshot.getScreenshotAs(OutputType.BYTES);
		scn.attach(data, "image/png", "Name of passed step is: "+ scn.getName());
		scn.log("Attach a screenshot as step get passed");	
	}
//===========================================================Companies===============================================================
	
public void ClickOn_Master_LeftMenu() throws IOException {
		
		utility.Wait.clickOn(driver, leftMenu_master, 30);
		
		scn.log("Clicked on Master");
	
	      }

public void ClickOn_InterventionCodes() {
	
	utility.Wait.clickOn(driver, leftmenu_InterventionCodes, 30);
	
	scn.log("Clicked on Intervention Codes ");
    
}

public void  ClickOnNewInterventionCodesButton() {
	

	utility.Wait.clickOn(driver, btn_NewInterventionCodes, 60);

	scn.log("Clicked on New Intervention Codes");
	   }



public void Dropdown_Search(List <WebElement> element, String Text) {
	try {
	
for (int i=0;i<=element.size()-1;i++) {
	Thread.sleep(2000);
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


public void Create_Multiple_Intervention_code(String sheetName) throws Exception {

    	
	// Get all data from the sheet
    List<Map<String, String>> testData = reader.getData(path, sheetName);
// Loop through each row and create a contact person
    for (int rowNumber = 0; rowNumber < testData.size(); rowNumber++) {
    	
    	 // Check if the necessary data is empty
        String InterventionCodesName = testData.get(rowNumber).get("InterventionCodes_Name");
        String DrpsInterventiontype = testData.get(rowNumber).get("Drps_Interventiontype");
        
        String Chk_DefaultInterventioncode = testData.get(rowNumber).get("Chk_Default_Interventioncode");
        String Chk_InactiveInterventioncode = testData.get(rowNumber).get("Chk_Inactive_Interventioncode");

        // If either contact person name or company name is empty, break the loop
        if (InterventionCodesName == null || InterventionCodesName.isEmpty() || DrpsInterventiontype == null || DrpsInterventiontype.isEmpty()|| Chk_DefaultInterventioncode == null || Chk_DefaultInterventioncode.isEmpty()|| Chk_InactiveInterventioncode == null || Chk_InactiveInterventioncode.isEmpty()) {
            scn.log("Empty data found at row " + rowNumber + ". Stopping the process.");
            break;
        }
    	
       
     	 ClickOnNewInterventionCodesButton();
     	
         Create_New_Intervention_code(sheetName, rowNumber);
         
         ClickOnSaveNewInterventioncode();
         
      
         Thread.sleep(2000);
     }      
    }


public void Create_New_Intervention_code(String sheetName, int rowNumber) throws Exception {
	Thread.sleep(2000);
  	List<Map<String,String>> testData = reader.getData(path, sheetName);
  	utility.Wait.sendKeys(driver, txt_InterventionCodesName, 40,testData.get(rowNumber).get("InterventionCodes_Name") );
  	scn.log("Entered Intervention code name : " + testData.get(rowNumber).get("InterventionCodes_Name"));
  	Thread.sleep(2000);
  	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps___INTERVENTION_CODE__ProgramId']/div/span")), 3000);
	
	Thread.sleep(2000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 3000);
	WebElement search_Company = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_Company.sendKeys(testData.get(rowNumber).get("Drps_Interventiontype"));
	Dropdown_Search(drps_Interventiontype, testData.get(rowNumber).get("Drps_Interventiontype"));
	
	scn.log("Selected Intervention type  is: "+testData.get(rowNumber).get("Drps_Interventiontype"));
	Thread.sleep(2000);
	
	if(testData.get(rowNumber).get("Chk_Default_Interventioncode").equalsIgnoreCase("Yes")) {
		Chk_Default_Interventioncode.click();
		Thread.sleep(1000);
	}
	
	else {
		
		scn.log(" Intervention code is default");
		System.out.println(" Intervention code is default");
	} 	
	

  	if(testData.get(rowNumber).get("Chk_Inactive_Interventioncode").equalsIgnoreCase("Yes")) {
		Chk_Inactive_Interventioncode.click();
		Thread.sleep(1000);
	}
	
	else {
		
		scn.log(" Intervention code is active");
		System.out.println(" Intervention code is active");
	} 	
}

public void ClickOnSaveNewInterventioncode () {

	utility.Wait.clickOn(driver, btn_InterventioncodeSave, 60);
	 scn.log("Clicked on save to  Intervention code");

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
   

	 public void TextFilter_Interventioncodename(String sheetName, int rowNumber) throws Exception {
		
		 Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		
		Thread.sleep(1000);		
		filter_InterventionCodesName.sendKeys(testData.get(rowNumber).get("InterventionCodes_Name"),Keys.TAB);
		
		scn.log("Enter filter text : " +testData.get(rowNumber).get("InterventionCodes_Name"));
		
		scn.log("Filtered Intervention code nam From the table");
		
	   }
	 
	  public void TextFilter_afterEdit_Interventioncode_Name(String sheetName, int rowNumber) throws Exception {
		  Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		 System.out.println("Enter filter text : "+testData.get(rowNumber).get("Edit_InterventionCodes_Name")); 
			Thread.sleep(1000);	
			filter_InterventionCodesName.clear();
			filter_InterventionCodesName.sendKeys(testData.get(rowNumber).get("Edit_InterventionCodes_Name"),Keys.TAB);
			scn.log("Filtered Intervention code name After edit");  
	  }
	  
	  
	  public void ClickOnEditButtonOnSpeedDial() {

			utility.Wait.clickOn(driver, btn_edit_Intervention_code, 90);
			  System.out.println("Click on edit to Intervention code");
			  scn.log("Clicked on edit to url");
		  }   
	  
	  
	public void editInterventioncode_ClickOnSpeedDialButton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {	
		e.printStackTrace();
	}
	utility.Wait.untilvisible(driver, btn_speedDial, 150);
		  utility.Wait.clickOn(driver, btn_speedDial, 60);
		  scn.log("Clicked on SpeedDial button");
	  }
	  
	  public void ClickOnEditInterventionCodesButtonOnSpeedDial() {

		utility.Wait.clickOn(driver, btn_edit_Intervention_code, 90);
		  System.out.println("Click on edit Intervention Codes");
		  scn.log("Clicked on edit Intervention Codes");
	  }   
	 
	  
	  public void ClickOnViewInterventionCodesButtonOnSpeedDial() {

			utility.Wait.clickOn(driver, btn_view_Intervention_code, 90);
			  System.out.println("Click on view to Intervention Codes");
			  scn.log("Clicked on view to Intervention Codes");
		  }   
	  
	
	 
	  
	  public  void edit_enter_new_InterventionCodesName(String sheetName, int RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = reader.getData(path, sheetName); 	
		utility.Wait.clickOn(driver, txt_editInterventionCodesName, 40);
		txt_editInterventionCodesName.clear(); 
		txt_editInterventionCodesName.sendKeys(testData.get(RowNumber).get("Edit_InterventionCodes_Name"));
	  	scn.log("Enter Updated/edited Intervention Codes name : " +testData.get(RowNumber).get("Edit_InterventionCodes_Name"));	  	
	  }
	  
		public void edit_ClickOnSpeedDialButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {	
			e.printStackTrace();
		}
		utility.Wait.untilvisible(driver, btn_speedDial, 150);
			  utility.Wait.clickOn(driver, btn_speedDial, 60);
			  scn.log("Clicked on SpeedDial button");
		  }
		
	  public void edit_ClickOnSaveToInterventioncode () {
		  utility.Wait.clickOn(driver, btn_editSaveInterventioncode, 50);
		
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
	  
  
	  public void ClickOnDeleteButtonInterventioncodeOnSpeedDial() {		  
			 utility.Wait.clickOn(driver, btn_delete, 300); 
			 System.out.println("Click on delete button");  
			 scn.log("Clicked on delete  button");
	  }
 
	  

	  public void ClickOnclose() {

			utility.Wait.clickOn(driver, btn_close, 90);
			  System.out.println("Click on close ");
			  scn.log("Clicked on close ");
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
				   	     System.out.println("Toast message after clicked on yes button :"   +actualText);
				   	      scn.log("Toast message after clicked on yes button : " + actualText);
				   	     
				   	     Thread.sleep(1500);
				   	     
				   		} catch (InterruptedException e) {
				   			e.printStackTrace();
				   		} 					
		}
		  


//===================================================================================================InterventionType ==================
	  
	  
	  
	  public void ClickOn_InterventionType() {
			
			utility.Wait.clickOn(driver, leftmenu_InterventionType, 30);
			
			scn.log("Clicked on Intervention Type ");
		    
		}

		public void  ClickOnNewInterventionTypeButton() {
			

			utility.Wait.clickOn(driver, btn_NewInterventionType, 30);

			scn.log("Clicked on New Intervention Type");
			   }



		public void Create_New_Intervention_type(String sheetName, int rowNumber) throws Exception {
			  
		  	List<Map<String,String>> testData = reader.getData(path, sheetName);
		  	
		  	utility.Wait.sendKeys(driver, txt_InterventionTypeName, 40,testData.get(rowNumber).get("InterventionType_Name") );
		  	
		  	scn.log("Entered Intervention type name : " + testData.get(rowNumber).get("InterventionType_Name"));
		  	
		  

		  	if(testData.get(rowNumber).get("Chk_Inactive_Interventiontype").equalsIgnoreCase("Yes")) {
		  		Chk_Inactive_Interventiontype.click();
				Thread.sleep(1000);
			}
			
			else {
				
				scn.log(" Intervention type is active");
				System.out.println(" Intervention type is active");
			} 	
		}

		public void ClickOnSaveNewInterventiontype () {

			utility.Wait.clickOn(driver, btn_InterventiontypeSave, 60);
			 scn.log("Clicked on save to  Intervention type");

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
		   

			 public void TextFilter_Interventiontypename(String sheetName, int rowNumber) throws Exception {
				
				 Thread.sleep(1500);
				 List<Map<String,String>> testData = reader.getData(path, sheetName);
				
				Thread.sleep(1000);		
				filter_InterventionTypeName.sendKeys(testData.get(rowNumber).get("InterventionType_Name"),Keys.TAB);
				
				scn.log("Enter filter text : " +testData.get(rowNumber).get("InterventionType_Name"));
				
				scn.log("Filtered Intervention type name From the table");
				
			   }
			 
			  public void TextFilter_afterEdit_Interventiontype_Name(String sheetName, int rowNumber) throws Exception {
				  Thread.sleep(1500);
				 List<Map<String,String>> testData = reader.getData(path, sheetName);
				 System.out.println("Enter filter text : "+testData.get(rowNumber).get("Edit_InterventionType_Name")); 
					Thread.sleep(1000);	
					filter_InterventionTypeName.clear();
					filter_InterventionTypeName.sendKeys(testData.get(rowNumber).get("Edit_InterventionType_Name"),Keys.TAB);
					scn.log("Filtered Intervention type name After edit");  
			  }
			  
			  
			  public void ClickOnEditButtonInterventiontypeOnSpeedDial() {

					utility.Wait.clickOn(driver, btn_edit_Intervention_type, 90);
					  System.out.println("Click on edit to Intervention type");
					  scn.log("Clicked on edit to Intervention type");
				  }   
			  
			  
			public void editInterventiontype_ClickOnSpeedDialButton() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {	
				e.printStackTrace();
			}
			utility.Wait.untilvisible(driver, btn_speedDial, 150);
				  utility.Wait.clickOn(driver, btn_speedDial, 60);
				  scn.log("Clicked on SpeedDial button");
			  }
			  
			  public void ClickOnEditInterventionTypeButtonOnSpeedDial() {

				utility.Wait.clickOn(driver, btn_edit_Intervention_type, 90);
				  System.out.println("Click on edit Intervention Type");
				  scn.log("Clicked on edit Intervention Type");
			  }   
			 
			  
			  public void ClickOnViewInterventionTypeButtonOnSpeedDial() {

					utility.Wait.clickOn(driver, btn_view_Intervention_type, 90);
					  System.out.println("Click on view to Intervention Type");
					  scn.log("Clicked on view to Intervention Type");
				  }   
			  
		 
			  public  void edit_enter_new_InterventionTypeName(String sheetName, int RowNumber) throws InvalidFormatException, IOException {
				List<Map<String,String>> testData = reader.getData(path, sheetName); 	
				utility.Wait.clickOn(driver, txt_editInterventiontypeName, 40);
				txt_editInterventiontypeName.clear(); 
				txt_editInterventiontypeName.sendKeys(testData.get(RowNumber).get("Edit_InterventionType_Name"));
			  	scn.log("Enter Updated/edited Intervention type name : " +testData.get(RowNumber).get("Edit_InterventionType_Name"));	  	
			  }
			  

				
			  public void edit_ClickOnSaveToInterventionType () {
				  utility.Wait.clickOn(driver, btn_editSaveInterventioncode, 50);
				
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
			  
		  
			  public void ClickOnDeleteButtonInterventiontypeOnSpeedDial() {		  
					 utility.Wait.clickOn(driver, btn_delete_type, 300); 
					 System.out.println("Click on delete button");  
					 scn.log("Clicked on delete  button");
			  }
		 
			  

			 

//===============================================================================Projects--------=======================================


public void ClickOn_Project() {
		utility.Wait.clickOn(driver, leftmenu_projects, 30);
		
		scn.log("Clicked on Project");
	    
}
public void  ClickOnNewProjectsButton() {
	

	utility.Wait.clickOn(driver, btn_NewProjects, 30);

	scn.log("Clicked on New Projects");
	   }

//==========================

public void Create_Multiple_Project(String sheetName) throws Exception {
    // Get all data from the sheet
    List<Map<String, String>> testData = reader.getData(path, sheetName);
// Loop through each row and create a contact person
    for (int rowNumber = 0; rowNumber < testData.size(); rowNumber++) {
    	
    	 // Check if the necessary data is empty
        String ProjectsName = testData.get(rowNumber).get("Projects_Name");
        String ChkInactiveProjects = testData.get(rowNumber).get("Chk_Inactive_Projects");

        // If either contact person name or company name is empty, break the loop
        if (ProjectsName == null || ProjectsName.isEmpty() || ChkInactiveProjects == null || ChkInactiveProjects.isEmpty()) {
            scn.log("Empty data found at row " + rowNumber + ". Stopping the process.");
            break;
        }
    	
        // Create a new contact person
    	
    	ClickOnNewProjectsButton();
    	
    	Create_New_Projects(sheetName, rowNumber);
        
        // Click save for the new contact person
        ClickOnSaveNewProjects();
        
        // Optional: Add a small delay between creations
        Thread.sleep(2000);
        

    }
}

//=======================================

public void Create_New_Projects(String sheetName, int rowNumber) throws Exception {
	  
  	List<Map<String,String>> testData = reader.getData(path, sheetName);
  	
  	utility.Wait.sendKeys(driver, txt_NewProjectsName, 40,testData.get(rowNumber).get("Projects_Name") );
  	
  	scn.log("Entered project name : " + testData.get(rowNumber).get("Projects_Name"));
  	
  	if(testData.get(rowNumber).get("Chk_Inactive_Projects").equalsIgnoreCase("Yes")) {
  		Chk_Inactive_Projects.click();
		Thread.sleep(1000);
	}
	
	else {
		
		scn.log(" Projects is active");
		System.out.println(" Projects is active");
	} 	


  	if(testData.get(rowNumber).get("Chk_Inactive_forallcompany").equalsIgnoreCase("Yes")) {
  		Chk_Inactive_forallcompany.click();
		Thread.sleep(1000);
	}
	
	else {
		
		WebElement search_Companies = driver.findElement(By.xpath("(//input[@placeholder='Search by name'])[1]"));
		search_Companies.sendKeys(testData.get(rowNumber).get("Companies"));
		scn.log("Selected companies is: "+testData.get(rowNumber).get("Companies"));
		WebElement select_Companies = driver.findElement(By.xpath("//span[@class='font-bold']"));
		select_Companies.click();
		Thread.sleep(2000);
		WebElement assign_Companies = driver.findElement(By.xpath("//div[@class='p-picklist-buttons p-picklist-transfer-buttons']//button[1]"));
		
		assign_Companies.click();
		Thread.sleep(2000);
	
		scn.log(" Companies is active");
		System.out.println(" Companies is active");
	} 		
}

public void ClickOnSaveNewProjects () {

	utility.Wait.clickOn(driver, btn_ProjectsSave, 60);
	 scn.log("Clicked on save to project");

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
   

	 public void TextFilter_Project_Name(String sheetName, int rowNumber) throws Exception {
		
		 Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		
		Thread.sleep(1000);		
		filter_ProjectsName.sendKeys(testData.get(rowNumber).get("Projects_Name"),Keys.TAB);
		
		scn.log("Enter filter text : " +testData.get(rowNumber).get("Projects_Name"));
		
		scn.log("Filtered project name From the table");
		
	   }
	 
	  public void TextFilter_afterEdit_Projects_Name(String sheetName, int rowNumber) throws Exception {
		  Thread.sleep(1500);
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		 System.out.println("Enter filter text : "+testData.get(rowNumber).get("Edit_Projects_Name")); 
			Thread.sleep(1000);	
			filter_ProjectsName.clear();
			filter_ProjectsName.sendKeys(testData.get(rowNumber).get("Edit_Projects_Name"),Keys.TAB);
			scn.log("Filtered project name After edit");  
	  }
	  
	  
	  public void ClickOnEditButtonProjectOnSpeedDial() {

			utility.Wait.clickOn(driver, btn_edit_Projects, 90);
			 System.out.println("Click on edit to project");
			 scn.log("Clicked on edit to project");
		  }   
	  
	  
	public void editProjects_ClickOnSpeedDialButton() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {	
		e.printStackTrace();
	}
	utility.Wait.untilvisible(driver, btn_speedDial, 150);
		  utility.Wait.clickOn(driver, btn_speedDial, 60);
		  scn.log("Clicked on SpeedDial button");
	  }
	  
	  public void ClickOnEditProjectButtonOnSpeedDial() {

		utility.Wait.clickOn(driver, btn_edit_Projects, 90);
		  System.out.println("Click on edit project");
		  scn.log("Clicked on edit project");
	  }   
	 
	  
	  public void ClickOnViewProjectsButtonOnSpeedDial() {

			utility.Wait.clickOn(driver, btn_view_Projects, 90);
			  System.out.println("Click on view to project");
			  scn.log("Clicked on view to project");
		  }   
	  

	  public  void edit_enter_new_ProjectName(String sheetName, int RowNumber) throws InvalidFormatException, IOException {
		List<Map<String,String>> testData = reader.getData(path, sheetName); 	
		utility.Wait.clickOn(driver, txt_editProjectsName, 40);
		txt_editProjectsName.clear(); 
		txt_editProjectsName.sendKeys(testData.get(RowNumber).get("Edit_Projects_Name"));
	  	scn.log("Enter Updated/edited project name : " +testData.get(RowNumber).get("Edit_Projects_Name"));	  	
	  }
	  
	  public void edit_ClickOnSaveToProject () {
		  utility.Wait.clickOn(driver, btn_ProjectsSave, 50);
		
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
	  

	  public void ClickOnDeleteButtonProjectOnSpeedDial() {		  
			 utility.Wait.clickOn(driver, btn_delete_project, 300); 
			 System.out.println("Click on delete button");  
			 scn.log("Clicked on delete  button");
	  }
 
	  

//=================================================================User=============================




	  public void ClickOn_User() {
			
			utility.Wait.clickOn(driver, leftmenu_User, 30);
			
			scn.log("Clicked on User ");
		    
		}

		public void  ClickOnNewUsersButton() {
			

			utility.Wait.clickOn(driver, btn_NewUser, 30);

			scn.log("Clicked on New Users");
			   }


		
		
		public void Create_New_User(String sheetName, int rowNumber) throws Exception {
			  
			
			utility.Wait.clickOn(driver, btn_NewUser, 30);

			scn.log("Clicked on New Users");
			
			
		  	List<Map<String,String>> testData = reader.getData(path, sheetName);
		  	
		  	utility.Wait.sendKeys(driver, txt_UserName, 40,testData.get(rowNumber).get("Name") );
		  	
		  	scn.log("Entered  name : " + testData.get(rowNumber).get("Name"));
		  	
		  	Thread.sleep(1000);
         utility.Wait.sendKeys(driver, txt_UserEmail, 40,testData.get(rowNumber).get("Email") );
		  	
		  	scn.log("Entered email : " + testData.get(rowNumber).get("Email"));
		  	
		  	Thread.sleep(1000);
		  	
		  	
		  	if(testData.get(rowNumber).get("Chk_Inactive_User").equalsIgnoreCase("Yes")) {
		  		Chk_Inactive_User.click();
				Thread.sleep(1000);
			}
			
			else {
				
				scn.log(" Usser is active");
				System.out.println(" User is active");
			} 	
		}

		public void ClickOnSaveNewUser () {

			utility.Wait.clickOn(driver, saveuser_btn, 60);
			 scn.log("Clicked on save");

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
		   

			 public void TextFilter(String sheetName, int rowNumber) throws Exception {
				
				 Thread.sleep(1500);
				 List<Map<String,String>> testData = reader.getData(path, sheetName);
				
				Thread.sleep(1000);		
				filter_Name.sendKeys(testData.get(rowNumber).get("Name"),Keys.TAB);
				
				scn.log("Enter filter text : " +testData.get(rowNumber).get("Name"));
				
				scn.log("Filtered name From the table");
				
			   }
			  

			 

			 public void UserBlockUnblock(String sheetName, int rowNumbe) throws Exception, Exception {

				
				 utility.Wait.clickOn(driver, btn_view_User, 90);
				  System.out.println("Click on view to user");
				  scn.log("Clicked on view to user");
				 
				 List<Map<String,String>> testData = reader.getData(path, sheetName);
				
				 
				 
				 if(chk_InActiveTrue.getAttribute("aria-checked").equalsIgnoreCase("true")) {
						
						 Assert.assertTrue(true);
						scn.log("User blocked successfully");
						
					}
				 else {
						Assert.assertFalse(false);
						scn.log("User unblocked successfully");
					}

				 
				 btn_close.click();
				 
				  }   
			  
			 

			 
			 

}

		





