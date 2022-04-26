package Selenium_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.xpath("//input[@id='userid']"));
		username.sendKeys("XA0634");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Sarika699!");
		
		WebElement login=driver.findElement(By.xpath("//button[text()='Login ']"));
		login.click();
		Thread.sleep(5000);
		
		WebElement pin = driver.findElement(By.xpath("//input[@type='password']"));
		pin.sendKeys("691991");
		
		WebElement continu=driver.findElement(By.xpath("//button[text()='Continue ']"));
		continu.click();
		Thread.sleep(5000);
		
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("INFY");
		Thread.sleep(5000);
		
		WebElement nse=driver.findElement(By.xpath("//span[text()='INFY']//parent::span//following-sibling::span//span[text()='NSE ']"));
		nse.click();
		Thread.sleep(5000);
		
		
		
		
	}

}
