package pageobjects;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import utility.ConfigReader;
import utility.ExcelReader;


public class LoginPageObjects extends ConfigReader {
	
	

	 WebDriver driver;
	Scenario scn;
	WebDriverWait wait;
	
	String path =System.getProperty("user.dir")+"//xls//Intervation.xlsx";
	ExcelReader reader = new ExcelReader();
	

	
//============= Locators for WebElements on Landing page============================================//
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;

	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy(xpath = "//button[@label='Sign In']")
	WebElement signin_btn;

	@FindBy(css = ".p-toast-detail")
	WebElement msg;

	@FindBy(xpath = "//button[@class='p-element p-button-danger p-button p-component']")
	WebElement forgotpassword_btn;
	
	
	@FindBy(xpath = "//button[@class='p-element p-button-Primary p-button p-component']")
	WebElement Forgotpassword_btn;
	
	@FindBy(xpath = "//button[@class='p-element p-button-danger p-button p-component']")
	WebElement backtologin_btn;

	@FindBy(xpath = "//button[@label='Back to home']")
	WebElement backtohome_btn;

	@FindBy(xpath = "//button[@class='p-element p-button-warning p-button p-component']")
	WebElement contactus_btn;
	
	
	@FindBy(xpath = "//button[@label='Back to home']")
	WebElement changepassword_btn;

	@FindBy(css = ".layout-menu-profile-toggler.pi.pi-fw")
	WebElement usericon;
	
	@FindBy(xpath = "//li[@ptooltip='Change password']//button")
	WebElement changepass_btn;
	
	@FindBy(xpath = "//p-password[@formcontrolname='oldPassword']//input")
	WebElement oldpass_txt;
	
	@FindBy(xpath = "//p-password[@formcontrolname='newpassword']//input")
	WebElement newpass_txt;
	
	@FindBy(xpath = "//p-password[@formcontrolname='confirm_password']//input")
	WebElement confirmpass_txt;
	
	@FindBy(css = ".p-element.p-button-Primary.p-button.p-component")
	WebElement changepass_btn1;
	@FindBy(xpath = "//button[@label='Reset']")
	WebElement reset_btn;
	@FindBy(xpath = "//li[@ptooltip='Logout']//button")
	WebElement logout_btn;
	@FindBy(xpath = "//button[normalize-space()='I agree']")
	WebElement agree;
//============= Expected Results ====================================================================//
	
	String base_url = "https://test-interventions.xss.be/login";
//============= Constructor ========================================================================//
	
	//============= Constructor ========================================================================//
		public LoginPageObjects(WebDriver driver,Scenario scn)
		{
			this.driver= driver;
			this.scn=scn;
			
			PageFactory.initElements(driver, this);
		}
		
	
	//========================================================================
	
		
		
		 public void clickOnIagree()
		    {
		    	
		    	JavascriptExecutor A = (JavascriptExecutor) driver;
				A.executeScript("arguments[0].click();",agree  );
		    	//logger.info("Clicked on I agree button");
		    	scn.log("Clicked on I agree button");
		    }
		    
		    
		    
	
	public  void navigateToURL() throws IOException
	{
		
//		final JPanel panel = new JPanel();
//	    final JRadioButton TestUrl_Btn = new JRadioButton("Test");
//	    final JRadioButton LiveURL_Btn = new JRadioButton("Live");
//	    panel.add(TestUrl_Btn);
//	    panel.add(LiveURL_Btn);
//	    JOptionPane.showMessageDialog(null, panel);
//
//	    if(TestUrl_Btn.isSelected()) {
//			driver.get(setProperty("testUrl"));
//			scn.log("Browser navigated to url");
//		}
//		
//		else if(LiveURL_Btn.isSelected())  {
//			
//			driver.get(setProperty("liveUrl"));
//			scn.log("Browser navigated");
//		}
	
		
		
		
		driver.get(base_url);
	    
	    
	    
	}
	

    //============================================EXCEL LOGIN============================================================
    
    public  void login_method(String sheetName, Integer RowNumber) throws Exception, Exception {
    	
    	List<Map<String,String>> testData = reader.getData(path, sheetName);
    	if(testData.get(RowNumber).get("User_Type").equalsIgnoreCase("Admin")) {
    	utility.Wait.sendKeys(driver, username, 2000, testData.get(RowNumber).get("Username"));
    	scn.log("Entered Username :" +testData.get(RowNumber).get("Username"));
		utility.Wait.sendKeys(driver, password, 3000, testData.get(RowNumber).get("Password"));
		scn.log("Entered Password :" +testData.get(RowNumber).get("Password"));
			
    	}	
else if ((testData.get(RowNumber).get("User_Type").equalsIgnoreCase("FreeUser"))) 
      { 
	
	utility.Wait.sendKeys(driver, username, 2000, testData.get(RowNumber).get("Username_FreeUser"));
	scn.log("Entered Username :" +testData.get(RowNumber).get("Username_FreeUser"));
	utility.Wait.sendKeys(driver, password, 3000, testData.get(RowNumber).get("Password_FreeUser"));
	scn.log("Entered Password :" +testData.get(RowNumber).get("Password_FreeUser"));
	
	
}
    else {
    	
    	if(testData.get(RowNumber).get("User_Type").equalsIgnoreCase("Client")) {
        	utility.Wait.sendKeys(driver, username, 2000, testData.get(RowNumber).get("Username_Client"));
        	scn.log("Entered Username :" +testData.get(RowNumber).get("Username_Client"));
    		utility.Wait.sendKeys(driver, password, 3000, testData.get(RowNumber).get("Password_Client"));
    		scn.log("Entered Password :" +testData.get(RowNumber).get("Password_Client"));
		
    	
    	
	}	
    }}
	
		   
public void clickOnSignIn(String sheetName, Integer RowNumber) throws Exception
	    
	    {
	    	
		utility.Wait.clickOn(driver, signin_btn, 20);
		Thread.sleep(3000);
		
		try {
			List<Map<String,String>> testData = reader.getData(path, sheetName);
		    String actualText=msg.getText();
		    Thread.sleep(2000);
		     String expectedText = testData.get(RowNumber).get("SignInExpectedResult");
		     
		     Assert.assertEquals(actualText,expectedText);
		     scn.log("Assert passed");
		    scn.log("Toast message after clicked on sign in button : " + actualText);
		    System.out.println("Assert passed");
		     Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   }
    
    
    public void clickOnForgotpassword()
    {
    	
    	JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",forgotpassword_btn  );
    	scn.log("Clicked on Forgot password");
    }
    
    
    
    public void clickOnforgotpassword(String sheetName, Integer rowNumber) throws Exception, IOException
    {
    	
    	List<Map<String,String>> testData = reader.getData(path, sheetName);
	   	
    	utility.Wait.sendKeys(driver, email, 200, testData.get(rowNumber).get("Email"));
    	
    	scn.log("Entered email :" +testData.get(rowNumber).get("Email"));
    	
    	Thread.sleep(1500);
    	
    	JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",Forgotpassword_btn  );
    	
    	scn.log("Clicked on Forgot password");
    	
    	Thread.sleep(1500);
 
    
    try {
		
	    String actualText=msg.getText();
	    Thread.sleep(2000);
	     String expectedText = testData.get(rowNumber).get("ForgotpassExpectedResult");
	     
	     Assert.assertEquals(actualText,expectedText);
	     scn.log("Assert passed");
	    scn.log("Toast message after clicked on Forgot password button : " + actualText);
	    System.out.println("Assert passed");
	     Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	   }
    
    
    
    public void getLoginPageTitle() {
	 driver.getTitle();
	}


    
    public void clickOnBacktohome()
    {
    	
    	JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",backtohome_btn  );
    	scn.log("Clicked on Back to home");
    }
    
    public void clickOnContactUs()
    {
    	
    	JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",contactus_btn  );
    	scn.log("Clicked on Contact us");
    }
   
    
    public void clickOnUsericon()
    {
    	
    	JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",usericon  );
    	scn.log("Clicked on User Icon");
    }
    
    
    public void clickOnChangePassword()
    {
    	
    	JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",changepass_btn  );
    	scn.log("Clicked on Change Password");
    }
    
    
    public void enteredChangePassword(String sheetName, Integer RowNumber) throws Exception, IOException
    {
        List<Map<String,String>> testData = reader.getData(path, sheetName);
	   	
    	utility.Wait.sendKeys(driver, oldpass_txt, 2000, testData.get(RowNumber).get("Old_password"));
    	
    	scn.log("Entered old password :" +testData.get(RowNumber).get("Old_password"));
    	
        utility.Wait.sendKeys(driver, newpass_txt, 2000, testData.get(RowNumber).get("New_password"));
    	
    	scn.log("Entered new password :" +testData.get(RowNumber).get("New_password"));
    	
          utility.Wait.sendKeys(driver, confirmpass_txt, 2000, testData.get(RowNumber).get("Confirm_password"));
    	
    	scn.log("Entered confirmed password :" +testData.get(RowNumber).get("Confirm_password"));
    	
  	
    }
    
    
    public void clickOnChangePasswordButton()
    {
    	
    	JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",changepass_btn1  );
    	scn.log("Clicked on Change Password");
    	
    	try {
		    String actualText=msg.getText();
		    Thread.sleep(1500);
		     String expectedText = "Password changed successfully.";
		     Assert.assertEquals(actualText,expectedText);
		     scn.log("Assert passed");
		    scn.log("Toast message after clicked on change password : " + actualText);
		     
		     Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    }
    
    public void clickOnReset()
    {
    	
    	JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",reset_btn  );
    	scn.log("Clicked on Reset Button");
    }
    
   
    public void clickOnLogout()
    {
    	
    	JavascriptExecutor A = (JavascriptExecutor) driver;
		A.executeScript("arguments[0].click();",logout_btn  );
    	scn.log("Clicked on Logout Button");
    }
    
    }
    
    
    
   
