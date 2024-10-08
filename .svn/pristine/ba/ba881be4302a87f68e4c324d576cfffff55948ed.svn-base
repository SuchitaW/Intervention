package pageobjects;

import java.awt.Robot;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import utility.ExcelReader;

public class OverviewPage {
	
	
	public WebDriver driver;
	Scenario scn;
	WebDriverWait wait;
	public List<String> items = new ArrayList<>();
	String path1 = System.getProperty("user.dir")+"//xls//Intervation.xlsx";
	ExcelReader reader = new ExcelReader();
	String importexcel = System.getProperty("user.dir")+"\\xls\\Report.xlsx";
	
//============= Locators for WebElements on Landing page============================================//
	
	

	@FindBy(xpath = "//a[contains(.,'Interventions')]")
	WebElement interventions_btn;
	
	@FindBy(xpath = "//span[contains(text(),'Overview')][1]")
	WebElement overview_screens;
	
	@FindBy(xpath = "//div[@role='tablist']")
			// "//div[contains(text(),'Advanced Filter')]")
	WebElement scroll_Up;
	@FindBy(id = "drpm__Overview__User")
	WebElement user;
    
	@FindBy(css = ".p-toast-detail")
	WebElement msg;
	
	@FindBy(xpath = "//textarea[@formcontrolname='description']")
	WebElement description1;

	@FindBy(xpath = "//textarea[@formcontrolname='description2']")
	WebElement description2;
	
	@FindBy(xpath = "//button[@class='p-element p-button-outlined p-button p-component']")
	WebElement updateandsave_btn;
	
	@FindBy(xpath = "//span[text()='Update']")
	WebElement update_btn;
	
	
@FindBy(xpath = "//p-sorticon[@id='icn__Overview__InterventionDate']//sortalticon[@class='p-element p-icon-wrapper ng-star-inserted']")
 WebElement sort_Overview_ascending;

@FindAll(@FindBy(xpath = "//p[contains(text(),'Overview')]//parent::div/following-sibling::div/table/tbody/tr/td[3]"))
List <WebElement> sort_Date_List;

@FindAll(@FindBy(xpath = "//tbody//tr//td[3]"))
List <WebElement> sort_Date_List1;


@FindAll(@FindBy(xpath = "//div[@role='checkbox']"))
List <WebElement> multiple_checkboxes;


@FindBy(css=".p-ripple.p-element.p-paginator-next")
WebElement Icn_nextPage;

   // By filterdd_bid_event_name = By.xpath("//label[contains(text(),'Event name')]//ancestor::tr/following-sibling::tr/th[4]/div/span/input");
	By btn_speedDial = By.xpath("//tbody//tr//td[2]//button//span");
	By btns_onSpeedDial = By.xpath("//div[contains(@class,'p-speeddial-linear p-speeddial-direction-right ')]//ul//li");
	//By EventName = By.xpath("//b[contains(text(),'Event name')]//ancestor::app-tooltiplabel//following-sibling::input");
	//By Edit_Singleevent_Carat = By.xpath("//th[contains(text(),'Carats')]/ancestor::thead/following-sibling::tbody/tr[2]/td[7]");
	By btn_ClearFilter = By.cssSelector(".p-badge");
	By deletePopupText = 	By.cssSelector(".p-confirm-dialog-message");
	By btn_DeleteYes =By.xpath("//span[normalize-space()='Yes']");
			
	@FindBy(xpath = "//button[@id='btn_dlt__Overview']")
	WebElement delete_btn;	
	
	@FindBy(xpath = "(//div[@class='p-multiselect p-component'])[1]")
	WebElement companyId;
	
	@FindBy(xpath = "//button[@class='p-element ui-button-success p-button p-component']")
	WebElement filter_btn;	
	
	
	@FindBy(xpath = "//a[@id='p-accordiontab-4']")
	WebElement advancefilter_btn;
	//By.cssSelector(".p-confirm-dialog-message");
	

	
//============= Constructor ========================================================================//
	public OverviewPage (WebDriver driver,Scenario scn)
	{
		this.driver= driver;
		this.scn=scn;
		
		PageFactory.initElements(driver, this);
	}
	

	//==============================================================
	
	
	public void ClickOn_Intervention_Screen() {

		JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",interventions_btn  );
    	scn.log("Clicked on Intervention ");
				
			}		
	
	
	public void ClickOn_OverviewTab() throws InterruptedException {
    	
    	  
		JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",overview_screens  );
    	scn.log("Clicked on Overview ");
	
	}
	
	public void ClickOn_scrollup_Advancefiltetr() throws InterruptedException {
    	
		Thread.sleep(1000);
		//Utility.wait.untilvisible(driver, scroll_Up, 5000);  
		utility.Wait.clickOn(driver, scroll_Up, 5000);  
		
	}
	
	  
		 public void edit_ClickOnSpeedDialButton () throws InterruptedException {
			 
				Thread.sleep(1000);
			
		
			 utility.Wait.clickOn(driver, driver.findElement(btn_speedDial), 100);
			 scn.log("Clicked on speed dial button ");
			 // ExtentTestManager.reporterLog("Clicked on speed dial button");
		 }
		
		 public void ClickOnEditButtonOnSpeedDial() {
		
			    List<WebElement> AllButtonOnSpeedDial = driver.findElements(btns_onSpeedDial);
			   System.out.println(AllButtonOnSpeedDial.size());
			  
			   for (WebElement ButtonOnSpeedDial : AllButtonOnSpeedDial) {
				   
				WebElement Edit_button =   ButtonOnSpeedDial.findElement(By.xpath("//a[@id='spd_btn_edt__Overview__0']"));
				
		
			  
				 utility.Wait.clickOn(driver, Edit_button, 40); 
				 System.out.println("Click on edit button");
				// ExtentTestManager.reporterLog("Clicked on edit button");
				  break;
				  }      
			   }
		 
		 
		 
		 public void EditInterventionDescription(String sheetName, int RowNumber) throws InterruptedException, Exception, Exception {
			 List<Map<String,String>>testData = reader.getData(path1, sheetName);
			 Thread.sleep(1000);
			 
			 
			 description1.clear();
			 description1.sendKeys(testData.get(RowNumber).get("Edit_description 1"));

				scn.log("Entered description :" +testData.get(RowNumber).get("Edit_description 1"));
				
				description2.clear();
				description2.sendKeys(testData.get(RowNumber).get("Edit_description 2"));

				scn.log("Entered description :" +testData.get(RowNumber).get("Edit_description 2"));
			
			 
		 
		 }
		 
		
		 public void ClickOnViewDetailsOnSpeedDial() {
				
				WebElement view_button=driver.findElement(By.id("spd_btn_dtl__Overview__0"));
				utility.Wait.clickOn(driver, view_button, 20); 
				 System.out.println("Click on view button");
				  WebElement close_button=driver.findElement(By.cssSelector(".p-dialog-header-icon.p-dialog-header-maximize"));
				  utility.Wait.clickOn(driver, close_button, 50); 
				  
				scn.log("Clicked on view details button");
				//ExtentTestManager.reporterLog("Click on delete planner button.");
				      
				  }
		 
		 public void ClickOnDeleteButtonOnSpeedDial() {
			
			    List<WebElement> AllButtonOnSpeedDial = driver.findElements(btns_onSpeedDial);
			   System.out.println(AllButtonOnSpeedDial.size());
			  
			   for (WebElement ButtonOnSpeedDial : AllButtonOnSpeedDial) {
				   
				WebElement Delete_button =   ButtonOnSpeedDial.findElement(By.xpath("//a[@id='spd_btn_del__Overview__0']"));
				
				 utility.Wait.clickOn(driver, Delete_button, 40); 
				 System.out.println("Click on delete button");
				 //ExtentTestManager.reporterLog("Clicked on edit button");
				  break;
				  }      
			   }
	
	
		 
		 public void TextFilter_UserName(String sheetName, int RowNumber) throws InterruptedException, Exception, IOException {
			   
			 List<Map<String,String>>testData = reader.getData(path1, sheetName);
 
			utility.Wait.clickOn(driver, user, 2000); 
			utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-multiselect-filter-container.ng-star-inserted")), 2000);
			WebElement search_program = driver.findElement(By.xpath("//input[@role='textbox']"));
			search_program.sendKeys((testData.get(RowNumber).get("Filter_User")));
				
			WebElement close=driver.findElement(By.xpath("//button[@class='p-ripple p-element p-multiselect-close p-link p-button-icon-only ng-star-inserted']"));
				
			List<WebElement> drp = driver.findElements(By.xpath("//p-multiselectitem//li"));
				System.out.println(drp.size());
		

				for (int i=0; i<=drp.size()-1;i++) {
					String drp_name = drp.get(i).getText();
					if (drp_name.equalsIgnoreCase(testData.get(RowNumber).get("Filter_User")))
					
					{
						drp.get(i).click();
						close.click();
						break;
							
					}
					
					}	
		   }




		 public void clickOnClearFilter() throws InterruptedException {
				Thread.sleep(1000);			
				WebElement btn_filter =  driver.findElement(btn_ClearFilter);
				  btn_filter.click();
			  }
		 

		 public void Deletepopup_ClickOnYesButton() {
			  
				WebElement deletePopupTxt = driver.findElement(deletePopupText);
				String Text = deletePopupTxt.getText();
				//ExtentTestManager.reporterLog(Text);
				System.out.println(Text);
				WebElement btn_deleteYes = driver.findElement(btn_DeleteYes);
			utility.Wait.clickOn(driver, btn_deleteYes, 20);
				//ExtentTestManager.reporterLog("Clicked on delete button");
			  
	        try {
	    		
	    	    String actualText=msg.getText();
	    	    Thread.sleep(2000);
	    	     String expectedText = "Data deleted successfully.";
	    	     
	    	     Assert.assertEquals(actualText,expectedText);
	    	     
	    	    scn.log("Toast message after clicked on yes button : " + actualText);
	    	    System.out.println("Assert passed");
	    	     Thread.sleep(2000);
	    		} catch (InterruptedException e) {
	    			e.printStackTrace();
	    		}
	    	   }
		 
		 

		 public void clickOnUpdateAndClose()
		    {
		    	
		    	JavascriptExecutor A = (JavascriptExecutor) driver;
				A.executeScript("arguments[0].click();",updateandsave_btn);
		    	scn.log("Clicked on Update & Close");
		    	
		    	  
		        try {
		    		
		    	    String actualText=msg.getText();
		    	    Thread.sleep(2000);
		    	     String expectedText = "Intervention updated successfully.";
		    	     
		    	     Assert.assertEquals(actualText,expectedText);
		    	     
		    	    scn.log("Toast message after clicked on Update & Close button : " + actualText);
		    	    System.out.println("Assert passed");
		    	     Thread.sleep(2000);
		    		} catch (InterruptedException e) {
		    			e.printStackTrace();
		    		}
		    	   }
		    	

		 public void clickOnUpdate()
		    {
		    	
		    	JavascriptExecutor A = (JavascriptExecutor) driver;
				A.executeScript("arguments[0].click();",update_btn  );
		    	scn.log("Clicked on Update");
		    	
		    	  
		        try {
		    		
		    	    String actualText=msg.getText();
		    	    Thread.sleep(2000);
		    	     String expectedText = "Intervention updated successfully.";
		    	     
		    	     Assert.assertEquals(actualText,expectedText);
		    	     
		    	    scn.log("Toast message after clicked on Update button : " + actualText);
		    	    System.out.println("Assert passed");
		    	     Thread.sleep(2000);
		    		} catch (InterruptedException e) {
		    			e.printStackTrace();
		    		}
		    	   }
		    	
		    	
	//===================================Sorting===============================================================
		 
		 
		 public void Overview_Sorting_Date() throws InterruptedException {
			 
			 utility.Wait.untilvisible(driver, sort_Overview_ascending, 2000);
			 sort_Overview_ascending.click();
			 
		
			 int rowCount = sort_Date_List1.size();		 
			 System.out.println(rowCount);
			 
			   for (WebElement Overview_Date : sort_Date_List1) {
				
					String item1 = Overview_Date.getText();
					items.add(item1);
		   
//					if (Icn_nextPage.isEnabled()) {
//						Icn_nextPage.click();
//						i++;
//					}
//					else {
//						break;
//					}
			  // }
			 	System.out.println(items);		
			 	
		 }}
		 
		 public void Overview_Sorting_Date_Compare() throws InterruptedException {
			 
			 List<String> items1 = new ArrayList<>(items);
		//	 items1.sort(String::compareTo);
			 Collections.sort(items1, String.CASE_INSENSITIVE_ORDER);
			 
			 System.out.println(items1);	
			 
			 if(items.equals(items1)) {
				 System.out.println("Sorting done");
			 }
			 else {
				 System.out.println("Sorting not done");
			 }
			 
			 
		 }
		 
		 
		 
		 
public void Overview_selectmultiple_checkbox() throws InterruptedException {
			 
			 List<WebElement> checkboxes= driver.findElements(By.xpath("//p-tablecheckbox[starts-with(@id,chk__Overview__)]"));
             System.out.println("Total no of checkboxes:"+checkboxes.size());
            
             
             utility.Wait.untilvisible_List(driver, driver.findElements(By.xpath("//p-tablecheckbox[starts-with(@id,chk__Overview__)]")),3000);
		
			 for(int i=0;i<checkboxes.size();i++)
				 
			 {
			 
			if(checkboxes.get(i).getAttribute("id").equalsIgnoreCase("chk__Overview__0")||checkboxes.get(i).getAttribute("id").equalsIgnoreCase("chk__Overview__2") )
			{
			 
			checkboxes.get(i).click();
			 
			 }
		}}



public void Overview_Deletepopup_ClickOnYesButton() throws Exception {
	  
	
	delete_btn.click();
	 Thread.sleep(2000);
	WebElement deletePopupTxt = driver.findElement(deletePopupText);
	String Text = deletePopupTxt.getText();
	//ExtentTestManager.reporterLog(Text);
	System.out.println(Text);
	WebElement btn_deleteYes = driver.findElement(btn_DeleteYes);
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


public  void enterTxt_FilterByCompanyId (String sheetName, int RowNumber) throws Exception, IOException {

	 List<Map<String,String>>testData = reader.getData(path1, sheetName);
	    utility.Wait.clickOn(driver, companyId, 2000);
	    utility.Wait.untilvisible(driver, driver.findElement(By.cssSelector(".p-multiselect-filter-container.ng-star-inserted")), 2000);
	    WebElement search_company = driver.findElement(By.xpath("//input[@role='textbox']"));
		search_company.sendKeys((testData.get(RowNumber).get("Filter_Company")));
		WebElement close=driver.findElement(By.xpath("//button[@class='p-ripple p-element p-multiselect-close p-link p-button-icon-only ng-star-inserted']"));
	    List<WebElement> drp = driver.findElements(By.xpath("//p-multiselectitem//li"));
		System.out.println(drp.size());


		for (int i=0; i<=drp.size()-1;i++) {
			String drp_name = drp.get(i).getText();
			if (drp_name.equalsIgnoreCase(testData.get(RowNumber).get("Filter_Company")))
			
			{
				drp.get(i).click();
				close.click();
				break;
			
					
			}
			
			}}
	   

		 public void clickOnFilter()
		    {
		    	
		    	JavascriptExecutor A = (JavascriptExecutor) driver;
				A.executeScript("arguments[0].click();",filter_btn  );
		    	scn.log("Clicked on Update");
		    }



		 
		 
		 
		 
		 
		 
		 
		 


} 
		
	 



