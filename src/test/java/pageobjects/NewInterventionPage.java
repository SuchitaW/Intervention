package pageobjects;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import utility.ExcelReader;

public class NewInterventionPage {
	
	public WebDriver driver;
	Scenario scn;
	WebDriverWait wait;
	
	String path = System.getProperty("user.dir")+"//xls//Intervation.xlsx";
	ExcelReader reader = new ExcelReader();
	
	String importexcel = System.getProperty("user.dir")+"\\xls\\Import_From_Excel 3.xlsx";
	
	
	
	//NewInterventionPage newInterventionPage;
		// TODO Auto-generated method stub

	
	
//============= Locators for WebElements on Landing page============================================//
	
	@FindBy(id = "drps__Company__Intervention")
	WebElement company;
	
	@FindBy(id = "drps__ContactPerson__Intervention")
	WebElement contactperson;

	@FindBy(id = "drps__Project__Intervention")
	WebElement project;
	
	@FindBy(id = "drps__InterventionType__Intervention")
	WebElement interventiontype;

	@FindBy(css = ".p-toast-detail")
	WebElement msg;
	
	@FindBy(css = ".p-toast-summary")
	WebElement msg1;
	
	

	@FindBy(xpath = "//button[@class='p-element p-button-outlined p-button p-component']")
	WebElement saveandadd_btn;
	
	
	@FindBy(id = "drps__TimeSpent__Intervention")
	WebElement timespent;
	
	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	WebElement description1;

	@FindBy(xpath = "//textarea[@formcontrolname='description2']")
	WebElement description2;
	
	
	@FindBy(xpath="//p-checkbox[@formcontrolname='isCharged']")
	WebElement Chk_Type_IsCharged;
	
	@FindBy(xpath = "//button[@class='p-element p-button-danger p-button p-component']")
	WebElement reset_btn;
	
	
	@FindBy(id = "btn_Save__Intervention")
	WebElement save_btn;
	
	
	@FindBy(id = "btn_ImportFromExcel__Intervention")
	WebElement import_btn;

	@FindBy(id="menu_Interventions")
	WebElement leftMenu_intervention;
	
	@FindBy(id="menu_InterventionOverview")
	WebElement leftmenu_overview;
	
	@FindBy(id="btn_add__Overview")
	WebElement btn_NewIntervention;
	
	@FindBy(id="btn_Save&Add__Intervention")
	WebElement btn_SaveandNew;
	@FindBy(xpath="//p-accordiontab[@header='Advance filter']")
	WebElement advance_filter;
	
    @FindBy(xpath = "//button[@id='btn_dlt__Overview']")
    WebElement delete_btn;	
	
	@FindBy (xpath="//ul/p-dropdownitem/li")
	List <WebElement> drps_Company;
	
	@FindBy (xpath="//ul/p-dropdownitem/li")
	List <WebElement> drps_ContactPerson;
	@FindBy (xpath="//ul/p-dropdownitem/li")
	List <WebElement> drps_Project;
	@FindBy (xpath="//ul/p-dropdownitem/li")
	List <WebElement> drps_InterventionType;
	
	@FindBy (xpath="//ul/p-dropdownitem/li")
	List <WebElement> drps_timespent;
	
	@FindBy(xpath = "//input[@autocomplete='off']")
	 WebElement Date;

	@FindBy (xpath="//ul[@role='listbox']//li")
	List <WebElement> drps_filterCompany;
	
	@FindBy (xpath="//ul[@role='listbox']//li")
	List <WebElement> drps_advfilterUser;
	
	
	@FindBy(id="btn__Filter__AdvFilter")
	WebElement btn_advfilter;
	
	@FindBy (xpath="//ul[@role='listbox']//li")
	List <WebElement> drps_Companyfilter;
	
	@FindBy(xpath="//input[@id='txt__Contact_Persons__Name']")
	WebElement filter_Company;

	@FindBy(id="txt____Password")
	WebElement txt_editLoginPassword;
	
	@FindBy(id="btn_sub__")
	WebElement btn_editSaveLogin;
	
	@FindBy(xpath="//tbody//tr//td[2]//button//span")
	WebElement btn_speedDial;
	
	
	@FindBy(id="spd_btn_edt__Overview__0")
	WebElement btn_edit_Overview;
	
	@FindBy(id="spd_btn_dtl__Overview__0")
	WebElement btn_view_Overview;
	
	
	@FindBy(id="spd_btn_del__Overview__0")
	WebElement btn_delete;
	
	@FindBy(id="txt____Name")
	WebElement txt_editUrlName;
	
	
	@FindBy(id="txta_Description1__Intervention")
	WebElement txt_editUrlDescription;
	
	@FindBy(id="btn_Save__Intervention")
	WebElement btn_editupdate;
	
	@FindBy(css=".p-badge")
	WebElement btn_ClearFilter;
  	
	@FindBy(xpath="//span[text()='Yes']")
	 WebElement btn_delete_yes;
	   
	 @FindBy(xpath="//button[contains(@class,'p-dialog-header-icon p-dialog-header-maximize p-link ng-star-inserted')]")
	  WebElement btn_close;
	
	 @FindBy(xpath="//span[@draggable='false']")
	 List<WebElement> dates ;
	 
	 @FindBy(id="hed__Overview")
	 WebElement date ;
	 

   @FindBy(css=".p-datepicker-title")
    WebElement monthYearDisplay;
      @FindBy(xpath="//p-calendar[@id='Cal_From_To__Overview__InterventionDate']")
     WebElement dateInput1;

      @FindBy(xpath="//span[text()='Own']")
      WebElement btn_own;
      
      @FindBy(xpath="//span[text()='Others']")
      WebElement btn_others;
      
      @FindBy (xpath="//ul[@role='listbox']//li")
  	List <WebElement> drps_user;
      
      
   
      
      @FindBy(xpath=" //li[@role='option']")
      WebElement select_user;
      
      @FindBy(id="sub__SELECT_USER")
      WebElement btn_save;
	
//============= Constructor ========================================================================//
	public NewInterventionPage (WebDriver driver,Scenario scn)
	{
		this.driver= driver;
		this.scn=scn;
		
		PageFactory.initElements(driver, this);
	
	}
	
public void ClickOn_Intervention_LeftMenu() throws IOException {
		
		utility.Wait.clickOn(driver, leftMenu_intervention, 30);
		
		scn.log("Clicked on Intervention");
	
	      }

public void ClickOn_Overview() 

{
		utility.Wait.clickOn(driver, leftmenu_overview, 30);
		
		scn.log("Clicked on Overview");
	    
}

public void  ClickOnNewInterventionyButton() {
		
		utility.Wait.clickOn(driver, btn_NewIntervention, 30);

		scn.log("Clicked on New Intervention");
		   }
	
	
public void ClickOn_AdvanceFilter() {
	utility.Wait.clickOn(driver, advance_filter, 30);
	
	scn.log("Clicked on Advance Filter");
    
}


public void clickAndSelectDropdown(WebElement DropdownElement, String drpdownValue) throws InterruptedException, Exception, IOException {
		
		utility.Wait.clickOn(driver, DropdownElement, 2000);
		
		utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext.p-component")), 5000);
	    WebElement search_company = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext.p-component"));
		search_company.sendKeys(drpdownValue) ; 
		
		List<WebElement> txt_filter = driver.findElements(By.xpath("//div[@class='p-dropdown-items-wrapper']//li"));
	
		for (int i = 0; i <= txt_filter.size(); i++) {
			String drp_value = txt_filter.get(i).getText();
			
			if (drp_value.equalsIgnoreCase(drpdownValue)) {
	
				txt_filter.get(i).click();
			
				break; 
			}
		}
	
	
	}
		
	


public void Dropdown_Search(List <WebElement> element, String Text) {
	try {
	
    for (int i=0;i<=element.size()-1;i++) {
	Thread.sleep(1000);
	WebElement singleElement = element.get(i);
	utility.Wait.untilvisible(driver, singleElement, 1000);  

	String singleText = singleElement.getText();

	  if(singleText.equalsIgnoreCase(Text)) {
		  Thread.sleep(1000);
		  singleElement.click(); 
		  break;
		  
	  }
	}
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
 }
	
	 public void clickOnSaveAndNew() throws Exception
	    {
	    	
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
    	 executor.executeScript("arguments[0].click();", btn_SaveandNew);
    	 scn.log("Clicked on save new company");
    	 Thread.sleep(1000);
    	 
    	 //
    	 try {
    	 String actualText=msg.getText();
    	    Thread.sleep(1500);
    	     String expectedText = "Intervention added successfully.";
    	     Assert.assertEquals(actualText,expectedText);
    	     
    	     System.out.println("Toast message after click on save button :"   +actualText);
    	     scn.log("Toast message after click on save button : " + actualText);
    	     
    	     Thread.sleep(1500);
    	     
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		} 	 
 
	    }
	 
	 public void clickOnSave() throws Exception
	    {
	    	
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
    	 executor.executeScript("arguments[0].click();", save_btn);
    	 scn.log("Clicked on save new company");
    	 Thread.sleep(1000);
    	 
    	 //
    	 try {
    	 String actualText=msg.getText();
    	    Thread.sleep(1500);
    	     String expectedText = "Intervention added successfully.";
    	     Assert.assertEquals(actualText,expectedText);
    	     System.out.println("Toast message after click on save button :"   +actualText);
    	     scn.log("Toast message after click on save button : " + actualText);
    	     
    	     Thread.sleep(1500);
    	     
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		} 	 
 
	    }
	    	
	     	 
	 public void clickOnReset()
	    {
	    	
	    	JavascriptExecutor A = (JavascriptExecutor) driver;
			A.executeScript("arguments[0].click();",reset_btn  );
	    	scn.log("Clicked on Reset");
	    }
	
	 public void ImportExcel(String sheetName, int RowNumber) throws Exception
	    {
			
		 System.out.println(importexcel);
			Thread.sleep(1000);
			import_btn.click();
			Thread.sleep(2000);
			
			
			  List<Map<String,String>> testData =reader.getData(path, sheetName);
				 
			  if(testData.get(RowNumber).get("ImportExcel").equalsIgnoreCase("Own")) 
			  
			  {
					 
			    btn_own.click();
			  
			  }
			  
			  else 
			  
			  {
				
				  
				  btn_others.click();
				  Thread.sleep(1000);
				  utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps__SELECT_USER']")), 1000);
					
					Thread.sleep(2000);
					utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext.p-component")), 1000);
					WebElement filter_user = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext.p-component"));
					filter_user.sendKeys(testData.get(RowNumber).get("Userlist"));
					Dropdown_Search(drps_user, testData.get(RowNumber).get("Userlist"));
		
					scn.log("Enter user is: "+testData.get(RowNumber).get("Userlist"));
					
					select_user.click();
					Thread.sleep(1000);
					btn_save.click();
					  
					Thread.sleep(1000);
			}
			
			Robot rb =new Robot();
			 rb.delay(1000);
			//PUT PATH OF FILE IN CLIBBOARD
			StringSelection ss=new StringSelection(importexcel);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			//CTRL+V
			rb.keyPress(KeyEvent.VK_CONTROL); //PRESS ON CONTROL KEY
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(1000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.delay(1000);
			//enter key press
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			

         try {
        	 Thread.sleep(2000);
	    	    String actualText=msg1.getText();
	    	    
	    	    System.out.println(actualText);
	    	    Thread.sleep(2000);
	    	    String expectedText ="Imported successfully.";
	    	    String failedexpectedText ="Error while importing.";
	    	    if(actualText.equalsIgnoreCase(expectedText))
	    	    {
	    	    	System.out.println("Assert passed");
	    	    	 Assert.assertEquals(actualText,expectedText);
	    	    	 scn.log("Toast message after click On click On Import from Excel : " + actualText);
	    	    	// TextFilter_Intervention_date(sheetName, RowNumber);
	    	    }
	    	    else {
					
	    
	    	     Assert.assertEquals(actualText,failedexpectedText);
	    	   	 scn.log("Toast message after click On click On Import from Excel : " + actualText);
	    	    	
	    	ScrollDown(); 
				}  
	    		} 
         catch (InterruptedException e) {
	    			e.printStackTrace();
	    		} 
         }
//	 
	 
	 
	 public void ScrollDown() {
		 
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		//Locating element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.xpath("//div[@class='card-header']"));

	        // Scrolling down the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
		 
		 
	 }
	    
		
	 
	 public void TextFilter_Intervention_date1(String sheetName, int RowNumber) throws Exception {
	 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		 js.executeScript("window.scrollBy(0,200)"," ");

		 Thread.sleep(3000);
		 
		   List<Map<String,String>> testData_Date =reader.getData_Date(path, sheetName);
		 
        
		     utility.Wait.calendar_DatePicker(dateInput1, monthYearDisplay, testData_Date.get(RowNumber).get("Filter_Date"), dates);
		     
		    // date.sendKeys(Keys.ENTER);
		     
		     Actions act = new Actions(driver);
             act.moveToElement(date).click().build().perform();
		     
		     System.out.println("Current Month and Year: " +testData_Date.get(RowNumber).get("Filter_Date"));
		     
		  /// utility.Wait.calendar_DatePicker(dateInput1, monthYearDisplay, testData_Date.get(RowNumber).get("Filter_Date"), dates);
		   Thread.sleep(3000);
	 
	 }
	 
			
	 public void TextFilter_Intervention_date(String sheetName, int RowNumber) throws Exception {
			
		 List<Map<String,String>> testData = reader.getData(path, sheetName);
		
	  
		 WebElement dateInput = driver.findElement(By.xpath("//p-calendar[@id='Cal_From_To__Overview__InterventionDate']//input"));
         
		 dateInput.click();
		 Thread.sleep(2000);
         // Find the next and previous month navigation buttons
         WebElement nextMonthButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".p-element.p-datepicker-next.p-link")));
         WebElement previousMonthButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".p-ripple.p-element.p-datepicker-prev.p-link")));

         // Loop to reach the desired month and year
         while (true) {
             WebElement monthYearDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".p-datepicker-title")));
             String monthYearText1 = monthYearDisplay.getText();

             System.out.println("Current Month and Year: " + monthYearText1);
             System.out.println("Desired Month and Year: " + testData.get(RowNumber).get("MonthYearText2"));

             // Compare month and year with testData
             if (monthYearText1.equalsIgnoreCase(testData.get(RowNumber).get("MonthYearText2"))) {
                 break;
             } else {
                 if (isPreviousMonth(monthYearText1, testData.get(RowNumber).get("MonthYearText2"))) {
                     previousMonthButton.click();
                 } else {
                     nextMonthButton.click();
                 }
                 // Add a small delay to let the date picker update
                 Thread.sleep(500);
             }
         }

      // Select the specific date
         List<WebElement> dates = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@draggable='false']")));

         for (WebElement date : dates) {
             // Compare the date with testData
             if (date.getText().equals(testData.get(RowNumber).get("Date"))) {
                 Actions act = new Actions(driver);
                 act.doubleClick(date).build().perform();
                 break;
             }
         }

     } 
		
		

 // Function to check if current month is previous to desired month
 private static boolean isPreviousMonth(String currentMonthYear, String desiredMonthYear) {
     // Parse month and year from strings
     String[] current = currentMonthYear.split(" ");
     String[] desired = desiredMonthYear.split(" ");

     String currentMonth = current[0];
     int currentYear = Integer.parseInt(current[1]);

     String desiredMonth = desired[0];
     int desiredYear = Integer.parseInt(desired[1]);

     // Compare years first
     if (currentYear < desiredYear) {
         return true;
     } else if (currentYear == desiredYear) {
         // Compare months
         String[] months = {"January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};
         int currentMonthIndex = Arrays.asList(months).indexOf(currentMonth);
         int desiredMonthIndex = Arrays.asList(months).indexOf(desiredMonth);

         if (currentMonthIndex < desiredMonthIndex) {
             return true;
         }
     }
     return false;
 }

	 //=============================================================================================
	 public void Overview_selectmultiple_checkbox() throws InterruptedException {
		 
		 List<WebElement> checkboxes= driver.findElements(By.xpath("//p-tablecheckbox[starts-with(@id,chk__Overview__)]"));
         System.out.println("Total no of checkboxes:"+checkboxes.size());
         Thread.sleep(3000);
		 for(int i=0;i<checkboxes.size();i++)
			 
		 {
		 
		if(checkboxes.get(i).getAttribute("id").equalsIgnoreCase("chk__Overview__0")||checkboxes.get(i).getAttribute("id").equalsIgnoreCase("chk__Overview__2") )
		{
		 
		checkboxes.get(i).click();
		 
		 }
	}}
	 
	 
	 //=========================================download button
	 
	 
 public void Export_Excel() throws InterruptedException {
		 
		 WebElement export_btn= driver.findElement(By.id("btn_expt__Overview"));
		 export_btn.click();
		 scn.log("Clicked on export button");
		 
 }
	 public void Dragthesection() throws InterruptedException {	 
			 
		 WebElement DragInNotSelectedSection = driver.findElement(By.xpath("//div[@class='p-picklist-buttons p-picklist-transfer-buttons']//button[4]"));
		 
         DragInNotSelectedSection.click();
         
         Thread.sleep(2000);
         
         WebElement DragInSelectedSection = driver.findElement(By.xpath("//div[@class='p-picklist-buttons p-picklist-transfer-buttons']//button[2]"));
		 
         DragInSelectedSection.click();
         
         scn.log("Export overview screen is shown");
         
     WebElement btn_Export= driver.findElement(By.xpath("//div[@class='rightButton']//span[text()='Export']"));
         
          btn_Export.click();
     
		 scn.log("Clicked on export button");
         
			
		// Thread.sleep(2000);
		 
		 
	}
	 
	 
	 
	 
	 
	//============================================================================================= 
	 public void Overview_Deletepopup_ClickOnYesButton() throws Exception {
		  
			delete_btn.click();
			 Thread.sleep(2000);
			WebElement deletePopupTxt = driver.findElement(By.cssSelector(".p-confirm-dialog-message"));
			String Text = deletePopupTxt.getText();
			//ExtentTestManager.reporterLog(Text);
			System.out.println(Text);
			WebElement btn_deleteYes = driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
		    utility.Wait.clickOn(driver, btn_deleteYes, 20);
			//ExtentTestManager.reporterLog("Clicked on delete button");
		  
		try {
			
		    String actualText=msg.getText();
		    Thread.sleep(3000);
		    String expectedText = "Data deleted successfully.";
		    Assert.assertEquals(actualText,expectedText);
		    scn.log("Toast message after clicked on yes button : " + actualText);
		    System.out.println("Assert passed");
		     Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   }

	 
	 
	 
			
public void Create_New_Intervention(String sheetName, int RowNumber) throws Exception {
	
	List<Map<String,String>> testData = reader.getData(path, sheetName);
	
    utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps__Company__Intervention']/div/span")), 1000);
	//Thread.sleep(2000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 1000);
	WebElement search_Company = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_Company.sendKeys(testData.get(RowNumber).get("Company"));
	Dropdown_Search(drps_Company, testData.get(RowNumber).get("Company"));
	scn.log("Selected comapany is: "+testData.get(RowNumber).get("Company"));
	
	Thread.sleep(1000);
	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps__ContactPerson__Intervention']/div/span")), 1000);
	//Thread.sleep(2000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 1000);
	WebElement search_contactperson = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_contactperson.sendKeys(testData.get(RowNumber).get("Contact_person"));
	Dropdown_Search(drps_ContactPerson, testData.get(RowNumber).get("Contact_person"));
	scn.log("Selected Contact person is: "+testData.get(RowNumber).get("Contact_person"));
	Thread.sleep(1000);
	
	//===============================================================================================================
	
	List<Map<String,String>> testData_Date =reader.getData_Date(path, sheetName);
	WebElement dateInput = driver.findElement(By.xpath("//p-calendar[@formcontrolname='interventionDate']"));
     dateInput.click();
     List<WebElement> dates = driver.findElements(By.xpath("//span[@draggable='false']"));
     WebElement monthYearDisplay = driver.findElement(By.cssSelector(".p-datepicker-title"));
   utility.Wait.calendar_DatePicker(dateInput, monthYearDisplay, testData_Date.get(RowNumber).get("Intervention_date"), dates);
   
   
   
   
     

//=================================================================================
	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps__Project__Intervention']/div/span")), 2000);
	Thread.sleep(1000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 1000);
	WebElement search_Project  = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_Project.sendKeys(testData.get(RowNumber).get("Project"));
	Dropdown_Search(drps_Project, testData.get(RowNumber).get("Project"));
	scn.log("Selected Project is: "+testData.get(RowNumber).get("Project"));
	Thread.sleep(1000);
	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps__InterventionType__Intervention']/div/span")), 2000);
	Thread.sleep(1000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 1000);
	WebElement search_Interventiontype  = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_Interventiontype.sendKeys(testData.get(RowNumber).get("Intervention_type"));
	Dropdown_Search(drps_InterventionType, testData.get(RowNumber).get("Intervention_type"));
	scn.log("Selected intervention type is: "+testData.get(RowNumber).get("Intervention_type"));
	
	
	Thread.sleep(1000);
	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps__InterventionCode__Intervention']/div/span")), 2000);
	Thread.sleep(1000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 1000);
	WebElement search_Interventioncode  = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_Interventioncode.sendKeys(testData.get(RowNumber).get("Intervention_code"));
	Dropdown_Search(drps_InterventionType, testData.get(RowNumber).get("Intervention_code"));
	scn.log("Selected intervention code is: "+testData.get(RowNumber).get("Intervention_code"));
	
	
	
	
	

	utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-dropdown[@id='drps__TimeSpent__Intervention']/div/span")), 2000);
	Thread.sleep(1000);
	utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext")), 1000);
	WebElement search_timespent  = driver.findElement(By.cssSelector(".p-dropdown-filter.p-inputtext"));
	search_timespent.sendKeys(testData.get(RowNumber).get("Time_spent"));
	Dropdown_Search(drps_timespent, testData.get(RowNumber).get("Time_spent"));
	scn.log("Selected Time spent is: "+testData.get(RowNumber).get("Time_spent"));
	Thread.sleep(1000);
	

  	if(testData.get(RowNumber).get("Chk_Type_IsCharged").equalsIgnoreCase("Yes")) {
  		Chk_Type_IsCharged.click();
		Thread.sleep(1000);
	}
	
	else {
		
		scn.log("Is Non Charged");
		System.out.println("Is Non Charged");
	} 	
  	
  	
  	description1.sendKeys(testData.get(RowNumber).get("Description 1"));

	scn.log("Entered description 1 :" +testData.get(RowNumber).get("Description 1"));
	Thread.sleep(2000);
	description2.sendKeys(testData.get(RowNumber).get("Description 2"));

	scn.log("Entered description 2 :" +testData.get(RowNumber).get("Description 2"));
  	
	Thread.sleep(2000);
  	
  	
  	
}
	

public void Create_Multiple_Intervention(String sheetName) throws Exception {

	 ClickOnNewInterventionyButton();
	// Get all data from the sheet
    List<Map<String, String>> testData = reader.getData(path, sheetName);
// Loop through each row and create a contact person
    for (int rowNumber = 0; rowNumber < testData.size(); rowNumber++) {
    	
    	 // Check if the necessary data is empty
        String Company1 = testData.get(rowNumber).get("Company");
        String Contactperson = testData.get(rowNumber).get("Contact_person");
        
//        String Chk_DefaultInterventioncode = testData.get(rowNumber).get("Chk_Default_Interventioncode");
//        String Chk_InactiveInterventioncode = testData.get(rowNumber).get("Chk_Inactive_Interventioncode");

        // If either contact person name or company name is empty, break the loop
        if (Company1 == null || Company1.isEmpty() || Contactperson == null || Contactperson.isEmpty()) {
            scn.log("Empty data found at row " + rowNumber + ". Stopping the process.");
            break;
        }
    	
       
     	
     	
         Create_New_Intervention(sheetName, rowNumber);
         
         clickOnSaveAndNew();
         
      
         Thread.sleep(2000);
     }      
    }







public void TextFilter_Intervention(String sheetName, int rowNumber) throws Exception {
	
	 Thread.sleep(1500);
	 List<Map<String,String>> testData = reader.getData(path, sheetName);
	 
	 
	 //TextFilter_Intervention_date1(sheetName, rowNumber);
	 
     utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-multiselect[@id='drpm__Overview__Company']")), 1000);
		
		Thread.sleep(2000);
		utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-multiselect-filter-container.ng-star-inserted")), 1000);
		WebElement filter_Company = driver.findElement(By.xpath("//input[@role='textbox']"));
		filter_Company.sendKeys(testData.get(rowNumber).get("Company"));
		Dropdown_Search(drps_filterCompany, testData.get(rowNumber).get("Company"));
		
		scn.log("Enter filter comapany is: "+testData.get(rowNumber).get("Company"));
		
		WebElement close = driver.findElement(By.xpath("//timesicon[@class='p-element p-icon-wrapper ng-star-inserted']"));

        close.click();
        Thread.sleep(1000);
        
        
        
	
        
  }

 public void TextFilter_afterEdit_Intervention(String sheetName, int rowNumber) throws Exception {
	  Thread.sleep(1500);
	  
	  
	  utility.Wait.untilvisible(driver, btn_ClearFilter, 90);
	  utility.Wait.clickOn(driver, btn_ClearFilter, 50);
	   List<Map<String,String>> testData = reader.getData(path, sheetName);
	

	    utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-multiselect[@id='drpm__Overview__Company']")), 2000);
		
		Thread.sleep(2000);
		utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-multiselect-filter-container.ng-star-inserted")), 2000);
		WebElement filter_Company = driver.findElement(By.xpath("//input[@role='textbox']"));
		filter_Company.sendKeys(testData.get(rowNumber).get("Filter_Company"));
		Dropdown_Search(drps_filterCompany, testData.get(rowNumber).get("Filter_Company"));
		
		scn.log("Enter filter comapany is: "+testData.get(rowNumber).get("Filter_Company"));
		
		WebElement close = driver.findElement(By.xpath("//timesicon[@class='p-element p-icon-wrapper ng-star-inserted']"));

        close.click();
        Thread.sleep(1000);
        
		//filter_Url.sendKeys(testData.get(rowNumber).get("Edit_Name_ToUrl"),Keys.TAB);
		scn.log("Filtered To company After edit");
	  
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
 
 public void ClickOnEditButtonOnSpeedDial() {

	utility.Wait.clickOn(driver, btn_edit_Overview, 90);
	  System.out.println("Click on edit to overview");
	  scn.log("Clicked on edit to overview");
 }   

 
 public void ClickOnViewButtonOnSpeedDial() {

		utility.Wait.clickOn(driver, btn_view_Overview, 90);
		  System.out.println("Click on view to overview");
		  scn.log("Clicked on view to overview");
	  }   
 

 public void ClickOnClose() {

		utility.Wait.clickOn(driver, btn_close, 90);
		  System.out.println("Click on close ");
		  scn.log("Clicked on close ");
	  }   
 
 public  void edit_enter_new_InterventionDescription1 (String sheetName, int RowNumber) throws InvalidFormatException, IOException {
	List<Map<String,String>> testData = reader.getData(path, sheetName); 	
	utility.Wait.clickOn(driver, txt_editUrlDescription, 40);
	txt_editUrlDescription.clear(); 
	txt_editUrlDescription.sendKeys(testData.get(RowNumber).get("Edit_description 1"));
 	scn.log("Enter Updated/edited to description : " +testData.get(RowNumber).get("Edit_description 1"));	  	
 }
 


 public void edit_ClickOnUpdate () {
	  utility.Wait.clickOn(driver, btn_editupdate, 50);
	
	scn.log("Clicked on Save");
	
	//==============assertion==================
  	 try {
  		 Thread.sleep(1000);
  	 String actualText=msg.getText();
  	    Thread.sleep(1500);
  	     String expectedText = "Intervention updated successfully.";
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
			   	     System.out.println("Toast message after clicked on yes button :"   +actualText);
			   	      scn.log("Toast message after clicked on yes button : " + actualText);
			   	     
			   	     Thread.sleep(1500);
			   	     
			   		} catch (InterruptedException e) {
			   			e.printStackTrace();
			   		} 					
	}



 public void TextFilter_AdvanceFilter(String sheetName, int rowNumber) throws Exception {
	  Thread.sleep(1500);
	  
	    
	   List<Map<String,String>> testData = reader.getData(path, sheetName);
	
	   utility.Wait.clickOn(driver, driver.findElement(By.xpath("//p-multiselect[@id='drps__MultiSel__User']")), 3000);
		
		Thread.sleep(2000);
		utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-multiselect-filter-container.ng-star-inserted")), 3000);
		WebElement filter_User = driver.findElement(By.xpath("//input[@role='textbox']"));
		 filter_User.sendKeys(testData.get(rowNumber).get("Filter_User"));
		Dropdown_Search(drps_advfilterUser, testData.get(rowNumber).get("Filter_User"));
		
		scn.log("Enter filter User name is: "+testData.get(rowNumber).get("Filter_User"));
		
		WebElement close = driver.findElement(By.xpath("//timesicon[@class='p-element p-icon-wrapper ng-star-inserted']"));

         close.click();
         Thread.sleep(1000);
       
         btn_advfilter.click();
       
		
		scn.log("Filtered by user");
	  
}
 
 
























}



