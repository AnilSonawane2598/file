package Page_class_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registration_page_class {
	public static WebDriver driver;

	@SuppressWarnings("static-access")
	public registration_page_class(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='email']")
	WebElement id;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement pass;

	@FindBy(xpath = "//a[contains(text(),'Create new account')]")
	WebElement newaccount;

	public void id(String user) {
		id.sendKeys(user);
	}

	public void pass(String pas) {
		pass.sendKeys(pas);
	}

	public void nac() {
		newaccount.click();
	}
	

}
