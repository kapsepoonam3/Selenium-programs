package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	public WebDriver driver;
  @BeforeMethod
  public void Start() {
	  
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
  
  	@Test
  	public void AssertLogo() {
  		Reporter.log("Kite zerodha is used",true);//(true) will print log on console
  		WebElement Logo = driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
  		Assert.assertTrue(Logo.isDisplayed());
  		System.out.println("Assert Logo Pass");
  	}
  	
  	@Test
  	public void AssertHeading() {
  		
  		WebElement Heading = driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]"));
  		String ActualHeading = Heading.getText();
  		String ExpectedHeading = "Login to Kite";
  		Assert.assertEquals(ActualHeading, ExpectedHeading);
  		System.out.println("Assert Heading Pass");
  	}
  	
  	@Test
  	public void SoftassertHeading() {
  		
  		WebElement Heading = driver.findElement(By.xpath("//h2[contains(text(),'Login to Kite')]"));
  		String ActualHeading = Heading.getText();
  		String ExpectedHeading = "Login to Kite";
  		SoftAssert sassert = new SoftAssert();
  		sassert.assertEquals(ActualHeading, ExpectedHeading);
  		System.out.println("SoftAssert Heading Pass");
  		sassert.assertAll();
  	}
  	
  	@AfterMethod
  	public void Teardown() {
  		
  		driver.close();
  	}
}
