package stepDefs;



import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.FindBy;
import core.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;



public class StepDefs_Hooks {
	
		private static final Logger logger = LogManager.getLogger(Thread.getAllStackTraces().getClass().getName());
		WebDriver driver;
		TestContext testContext;
		Scenario scn;
		StepDefs_Hooks stepDefs_Hooks;
		static int implicitWait_timeout_in_sec = 30;
		static int pageLoad_timeout_in_sec = 30;
		static int setScript_timeout_in_sec = 30;
		String base_url = "https://test-bidding.samirgems.diamonds/login";
		@FindBy(xpath = "//button[normalize-space()='I agree']")
		WebElement agree;
		
	//============== Declare object reference of pageObjects classes =============================//
		
		public StepDefs_Hooks(TestContext testContext) {
			this.testContext = testContext;
		
		}

		@Before
		public void setup(Scenario scn) throws Exception {
		
			this.scn = scn;
			String browserName = getBrowserName();
		    driver = getWebDriverForBrowser(browserName);
			driver.manage().timeouts().implicitlyWait(implicitWait_timeout_in_sec, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(pageLoad_timeout_in_sec, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(setScript_timeout_in_sec, TimeUnit.SECONDS);
			testContext.setDriver(driver);
			testContext.setScenario(scn);
			scn.log("Browser invoked"); // to log info in reports
			
			
		}

		@After(order = 1)
		public void cleanUp(Scenario scenario) {

	      //  testContext.getDriver().quit();
	        scn.log("Browser closed");
	        logger.info("Browser closed");
	    }
		
		@After(order = 2)
		public Scenario takeScreenShot(Scenario s) {
			if (s.isFailed()) {
				
				//TestRunner.setTestFailed(true);
				TakesScreenshot scrnShot = (TakesScreenshot) testContext.getDriver();
				byte[] data = scrnShot.getScreenshotAs(OutputType.BYTES);
				scn.log("Step is failed");
				scn.attach(data, "image/png", "Failed Step Name: " + s.getName());
				
				System.out.println(s.getName());
			} else {
				scn.log("Test case is passed, no screen shot captured");
			}
			return s;
				
		}
		
		public static String getBrowserName() {
			String browserDefault = "chrome"; // Set by default
			String browserSentFromCmd = System.getProperty("browser");

			if (browserSentFromCmd == null) {
				return browserDefault;
			} else {
				return browserSentFromCmd;
			}
		}
		

	public WebDriver getWebDriverForBrowser(String browser) throws Exception {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("Chrome Browser invoked");
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.info("Firefox Browser invoked");
			break;
		case "opera":
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			logger.info("Opera Browser invoked");
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.info("Opera Browser invoked");
			break;
		case "headless":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			driver = new ChromeDriver(options);
			logger.info("Headless Chrome Browser invoked");
			break;
		default:
			logger.fatal("No such browser is implemented.Browser name sent: " + browser);
			throw new Exception("No such browser is implemented.Browser name sent: " + browser);
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		logger.info("Driver maximized and implicit time out set to 20 seconds");
		return driver;
	}}


