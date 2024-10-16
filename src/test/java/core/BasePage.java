package core;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.cli.Main;

public class BasePage {
	
	
	public static WebDriver driver;
	public static void main(String args[]) throws Throwable {
	    try {
	        Main.main(new String[] { 
	    

	        "-g","com.sadakar.common",
	        "-g","\\src\\test\\java\\runner",
	        "-g","\\src\\test\\java\\runner\\TestRunner.java",
	                    
	        "classpath:features", 
	        
	        "-t","@exportExcel",
	        
	                
	        "-p", "pretty", 
	        "-p", "json:target/cucumber-reports/cucumber.json", 
	        "-p", "html:target/cucumber-reports/cucumberreport.html",
	        
	        "-m"
	    }
	    );
	} catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("Main method exception : " + e);
	}
	}

}


