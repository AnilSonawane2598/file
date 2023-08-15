package Base_class_package;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Read_config_package.read_config_class;

public class base_class {
	public static WebDriver driver;
	public static Logger logger;

	read_config_class rc = new read_config_class();
	public String username = rc.getusername();
	public String password = rc.getpassword();

	@SuppressWarnings({ "deprecation", "static-access" })
	@BeforeMethod
	@Parameters("browser")
	public void openbrowser(String browser) {
		if (browser.equals("chrome")) {
			System.setProperty("WebDriver.chrome.driver", rc.getchromedriver());
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			System.setProperty("WebDriver.chrome.driver", rc.getedgedriver());
			driver = new EdgeDriver();
		}

		PropertyConfigurator.configure(
				"C:\\Users\\DELL\\eclipse-workspace\\Maven_new_project_ID_0001\\src\\test\\resources\\config_and_log4_file\\log4j.properties");
		logger = logger.getLogger("open page");
		logger.info("start");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(rc.geturl());

	}

	@AfterMethod
	public void closebrowser() throws InterruptedException {
		logger.info("finish");
		driver.quit();
		Thread.sleep(5000);

	}

}
