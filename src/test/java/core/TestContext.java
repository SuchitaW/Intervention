package core;


import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestContext {
    WebDriver driver;
    WebDriverWait wait;
    Scenario scn;

    public Scenario getScenario() {
        return scn;
    }

    public void setScenario(Scenario scn) {
        this.scn = scn;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebDriverWait getWebDriverWait() {
        return wait;
    }

    public void setWebDriverWait(WebDriverWait wait) {
        this.wait = wait;
    }
    
    
}
