package sf.automation.utility;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ConfigReader {

	public static String readProjectConfiguration(String keyName){
		String value=null;
		try
		{
		FileReader file = new FileReader(new File("ConfigFiles/ProjectConfiguration.properties"));
		Properties readproperty = new Properties();
		readproperty.load(file);
		return readproperty.getProperty(keyName).trim();
		}
		catch(Exception exception){
			exception.printStackTrace();
			throw (new RuntimeException("ERROR: key with name "+ keyName + " does not exist"));
		}
		
		
	}
	
	public static String readElementLocators(String keyName){
		String value=null;
		try
		{
		FileReader file = new FileReader(new File("ElementLocators/Locators.properties"));
		Properties readproperty = new Properties();
		readproperty.load(file);
		return readproperty.getProperty(keyName).trim();
		}
		catch(Exception exception){
			exception.printStackTrace();
			throw (new RuntimeException("ERROR: Locator with name "+ keyName + " does not exist"));
		}
	
	}
	
}
