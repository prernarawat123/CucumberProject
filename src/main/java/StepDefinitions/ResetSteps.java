package StepDefinitions;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResetSteps {
	  WebDriver driver;			
  	Properties configProp = new Properties();

	    @Given("^Open the chrome and launch the application$")					
	    public void Open_the_chrome_and_launch_the_application() throws Throwable							
	    {		
	    	FileInputStream inputFile = new FileInputStream("C:\\Users\\prerna\\eclipse-workspace\\TestBDDWithExample\\src\\main\\java\\config.properties");
	    	configProp.load(inputFile);
	    	System.setProperty(configProp.getProperty("chromedriver"), configProp.getProperty("chromedriverpath"));
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);		
	       driver.get(configProp.getProperty("url"));					
	    }		
	   
	   @When("^User enters \"(.*)\" and \"(.*)\"$")					
	    public void enter_the_Username_and_Password(String username, String password) throws Throwable 							
	    {		
	       driver.findElement(By.name("uid")).sendKeys(username);							
	       driver.findElement(By.name("password")).sendKeys(password);							
	    }		

	    @Then("^Reset the credential$")					
	    public void Reset_the_credential() throws Throwable 							
	    {		
	       driver.findElement(By.name(configProp.getProperty("resetbuttonid"))).click();					
	    }		
}
