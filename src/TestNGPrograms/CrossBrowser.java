package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	public WebDriver driver;
	
	@BeforeClass
	@Parameters("browser")
	public void Browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
			  driver = new ChromeDriver();
			   }
		  else if(browser.equalsIgnoreCase("edge")){
			  System.setProperty("webdriver.edge.driver", "F:\\Selenium Jars\\msedgedriver.exe");
			  driver = new EdgeDriver();
		  }
	}
	
	
  @Test
  public void LoginKite() throws InterruptedException {

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		// implicit wait for selenium 4.1.2
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebElement Userid = driver.findElement(By.xpath("//input[@id='userid']")); 
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement LoginBtn = driver.findElement(By.tagName("button"));
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Utkarshaa");
		Userid.sendKeys("EE9851");
		Password.sendKeys("Shree@1210");
		LoginBtn.click();
			Thread.sleep(1000);
		WebElement Pin = driver.findElement(By.xpath("//input[@id='pin']"));
		WebElement ContBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		
		Pin.sendKeys("121093");
		ContBtn.click();
		Thread.sleep(2000);
		
		//WebElement SearchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search eg: infy bse')]"));
		//SearchBox.sendKeys("INFY");
	//	Thread.sleep(2000);
	//	WebElement SearchInfy = driver.findElement(By.xpath("//span[text()='INFY']//parent::span//following-sibling::span//span[text()='NSE ']"));
	//	SearchInfy.click();
  }
  
  @AfterMethod
  public void TearDown() {
	  driver.quit();
  }
}
