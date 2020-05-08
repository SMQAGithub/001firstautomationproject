package sf.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import sf.automation.utility.ConfigReader;

public class DriverInstance {
	
	static WebDriver driver = null;
	
	//Initiate Driver Instance
	public static void startDriverInstance(){
		if(ConfigReader.readProjectConfiguration("BrowserName").equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(ConfigReader.readProjectConfiguration("BrowserName").equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");	
			driver = new ChromeDriver();
		}
		
		else if(ConfigReader.readProjectConfiguration("BrowserName").equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "Driver/InternetExplorerDriver.exe");	
			driver = new InternetExplorerDriver();
		}
		
		else
		{
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			driver = new ChromeDriver();
			
			
		}
		
		driver.manage().window().maximize();
		driver.get(ConfigReader.readProjectConfiguration("ApplicationURL"));
		
	}
	
	//Returning Driver Instance
	public static WebDriver getDriverInstance(){
		if(driver!=null){
			return driver;
		}
		else
		{
			DriverInstance.startDriverInstance();
			return driver;
		}
	}
	
	
	// setting driver instance to null
	public static void setDriverInstanceToNull()
	{
		driver=null;
		
	
	
		}
	
	
	
	
	
	}
	


