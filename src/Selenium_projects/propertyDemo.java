package Selenium_projects;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class propertyDemo {

	@Test
	//public static void main(String[] args) throws IOException {
		public void PropertyD() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Selenium\\src\\Selenium_projects\\data.properties");
		prop.load(fis);
		
		System.setProperty(prop.getProperty("chrome"), prop.getProperty("driverpath"));
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username=driver.findElement(By.xpath("//input[@id='userid']"));
		username.sendKeys(prop.getProperty("username"));
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(prop.getProperty("password"));
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Login ']"));
		login.click();
		//Thread.sleep(1000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='pin']"))).sendKeys(prop.getProperty("pin"));
				
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
		
	}

}
