package Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class kite {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username=driver.findElement(By.xpath("//input[@id='userid']"));
		username.sendKeys("XA0634");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Sarika699!");
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Login ']"));
		login.click();
		//Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pin']"))).sendKeys("691991");
				
		//WebElement pin = driver.findElement(By.xpath("//input[@id='pin']"));
		//pin.sendKeys("691991");
		
		WebElement continu=driver.findElement(By.xpath("//button[text()='Continue ']"));
		continu.click();
		//Thread.sleep(1000);
		
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("INFY");
		//Thread.sleep(1000);
		
		WebElement nse=driver.findElement(By.xpath("//span[text()='INFY']//parent::span//following-sibling::span//span[text()='NSE ']"));
		nse.click();
		
		search.clear();
		search.sendKeys("cipla");
		
		//WebElement nse = 
		
	}

}
