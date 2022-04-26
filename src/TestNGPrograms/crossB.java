package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossB {
  @Test
  @Parameters("browser")
  public void Browser(String browser) {
	  
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.google.com/");
		  
	  }
	  else if(browser.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "F:\\Selenium Jars\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.google.com/");
		  
	  }
  }
}
