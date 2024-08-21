package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DirectoryPageObjects {

	public DirectoryPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]/button/i")
	public static WebElement directoryDD;
	@FindBy(xpath = "//*[@class=\"oxd-text oxd-text--p orangehrm-directory-card-header --break-words\"]")
	public static List<WebElement> employeeNames;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")
	public static WebElement userbadge;
	@FindBy(xpath="//*[@id=\\\"app\\\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")
	public static WebElement logoutBtn;
}
