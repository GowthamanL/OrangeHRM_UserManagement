package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {

	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	public static WebElement userName;
	@FindBy(name="password")
	public static WebElement passWord;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public static WebElement loginBtn;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	public static WebElement dashb;

}
