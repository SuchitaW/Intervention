package utility;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;

public class Wait {
	


	private static final Logger logger= LogManager.getLogger(Wait.class);
	static WebDriver driver;
	Scenario scn;
	WebDriverWait wait;
	JavascriptExecutor js;


	public Wait(WebDriver driver,Scenario scn)
	{
		this.driver= driver;
		this.scn=scn;
	}
	
	public static void shortWait() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	public static void MediumWait() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method will pause the script for 10000 milliseconds
	 */
	public static void LognWait() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value, Keys.TAB);
		}
		public static void clickOn(WebDriver driver, WebElement element, int timeout){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();	
		}		
		public static void untilvisible(WebDriver driver, WebElement element,int timeout) {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		}
		
		public static void untilvisible_List(WebDriver driver1, List <WebElement> element,int timeout) {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOfAllElements(element));
		}

		
		public static void calendar_DatePicker(WebElement Cal, WebElement monthYear, String date, List<WebElement> days ) {
			
			   Cal.click();
		        String monthYearText = monthYear.getText();
		        
		        System.out.println("Month of year1: "+monthYearText);          
		       System.out.println(date);            

		        String s2 = date.split(" ")[0];  
		        for (WebElement Singledate : days) {
		  
					  if((s2.charAt(0)=='0')) {
						  String s3 = s2.replace("0", "");
					  if (s3.equals((Singledate).getText())) {	
				     		Singledate.click(); 
				             break;
				  }
				  }
				  else if (s2.equals((Singledate).getText())) {	
					  			  
						  if(Singledate.getAttribute("class").contains("p-disabled")) {					  
						  }
						  else {
						  Singledate.click(); 
						  break;
						  }						  	          
			        }
					 
			     }
		}
			
}
