package stepDefinitions;

import org.openqa.selenium.WebDriver;

import commonFunctions.CommonFunctions;
import cucumber.api.java.en.When;

public class StepDefinitions 
{
	
	WebDriver driver;
	
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver = CommonFunctions.startBrowser("chrome");
	
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonFunctions.openApplication();
		
	 
	}

	@When("^Wait For Username$")
	public void wait_For_Username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonFunctions.waitForElement(driver, "id", "username", "10");
	    
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonFunctions.typeAction(driver, "id", "username", "admin");
	    
	}

	@When("^Wait For Password$")
	public void wait_For_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonFunctions.waitForElement(driver, "name", "password", "10");
	    
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonFunctions.typeAction(driver, "name", "password", "master");
	    
	}

	@When("^Wait For Login$")
	public void wait_For_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonFunctions.waitForElement(driver, "id", "logout", "10");
		
	    
	}

	@When("^Click On Login$")
	public void click_On_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonFunctions.clickAction(driver, "id", "logout");
	    
	}

	@When("^wait For Logout$")
	public void wait_For_Logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonFunctions.waitForElement(driver, "xpath", "//*[test()='ok']", "10");
	    
	}

	@When("^Click On Logout$")
	public void click_On_Logout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	
	}

	@When("^Wait For OK$")
	public void wait_For_OK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Click On OK$")
	public void click_On_OK() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {

	    
	}


}
