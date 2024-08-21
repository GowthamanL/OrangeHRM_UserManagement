package stepdefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.DashboardPageObjects;
import pageobjects.DirectoryPageObjects;
import pageobjects.LoginPageObjects;
import utility.Hooks;

public class StepDef {

	public WebDriver driver;
	
	
	  public StepDef() {
	        this.driver = Hooks.driver; // Get the driver instance from Hooks
	        PageFactory.initElements(driver,LoginPageObjects.class);
	        PageFactory.initElements(driver, DashboardPageObjects.class);
	        PageFactory.initElements(driver,DirectoryPageObjects.class);
	    }

	@Given("login Website")
	public void login_website() {
		
		LoginPageObjects.userName.sendKeys("Admin");
		LoginPageObjects.passWord.sendKeys("admin123");
		LoginPageObjects.loginBtn.click();
	}
	@Given("click the the directory button")
	public void click_the_the_directory_button() {
		
		DashboardPageObjects.directoryBtn.click();
	}
	@Then("print all employee names")
	public void print_all_employee_names() {
		
		for (WebElement name: DirectoryPageObjects.employeeNames) {
			   String nameAsString=name.getText();
	            System.out.println(nameAsString);
		}
	}
	@Then("logout")
	public void logout() {

		DirectoryPageObjects.userbadge.click();
		DirectoryPageObjects.logoutBtn.click();
		
	}

}
