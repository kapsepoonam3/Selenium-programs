package TestNGPrograms;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DataPKite {
  @Test(dataProvider = "dp")
  public void LoginKite(String userId, String Password, String pin) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Userid = driver.findElement(By.xpath("//input[@id='userid']")); 
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement LoginBtn = driver.findElement(By.tagName("button"));
		Userid.sendKeys(userId);
		password.sendKeys(Password);
		LoginBtn.click();
		Thread.sleep(1000);
		WebElement Pin = driver.findElement(By.xpath("//input[@id='pin']"));
		WebElement ContBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		Pin.sendKeys(pin);
		ContBtn.click();
		Thread.sleep(2000);
		String ExpectedTitle = "Dashboard / Kite";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	{"FG5677","23455","3456"},
    	{"XA0634", "Sarika699!", "691991"}
    };
  }
}
