package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(TestNGPrograms.ListenersTestNG.class)
public class BrowserP {
  @Test
  @Parameters("browser")
  public void Browser(String browser1) {
	  
	  if(browser1.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com");
	  }
	  else if(browser1.equalsIgnoreCase("firefox")){
		  System.setProperty("webdriver.gecko.driver", "F:\\Selenium Jars\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.google.com");
	  }
  }
}
