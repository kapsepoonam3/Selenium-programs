package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependancyDemo {
		public WebDriver driver;
	
		@Test
		public void OpenBrowser() {
			System.out.println("User opens the Chrome browser");
			System.setProperty("webdriver.chrome.driver", "D:\\selenium Jars\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
		
		@Test(dependsOnMethods = "OpenBrowser")
		public void LoginKite() {
			System.out.println("User login into zerodha application");
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
			Userid.sendKeys("XA0634");
			Password.sendKeys("Sarika699!");
			LoginBtn.click();
				//Thread.sleep(1000);
			WebElement Pin = driver.findElement(By.xpath("//input[@id='pin']"));
			WebElement ContBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
			
			Pin.sendKeys("691991");
			ContBtn.click();
		}
		@Test(dependsOnMethods = "LoginKite")
		public void Dashboard() {
			System.out.println("user check that he is on dashboard page");
			WebElement SearchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search eg: infy bse')]"));
			SearchBox.sendKeys("INFY");
		//	Thread.sleep(2000);
			WebElement SearchInfy = driver.findElement(By.xpath("//span[text()='INFY']//parent::span//following-sibling::span//span[text()='NSE ']"));
			SearchInfy.click();
		}
		@Test(dependsOnMethods = "Dashboard")
		public void Logout() throws InterruptedException
		{
			System.out.println("user log out from application");
			WebElement UserId = driver.findElement(By.xpath("//span[text()='XA0634']"));
			UserId.click();
			Thread.sleep(1000);
			WebElement Logout = driver.findElement(By.xpath("//a[text()=' Logout']"));
			Logout.click();
		}
		@Test(dependsOnMethods = "Logout")
		public void TearDown()
		{
			System.out.println("user close the browser");
			driver.close();
		}
	}