package Constants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Constants 
{
	public static WebDriver driver;
	public static void Launchapp(String url)
	{
		System.setProperty("webdriver.gecko.driver", "F:\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
	}
	  public static void closeapp()
	  {
		  driver.close();
	  }

}
