package Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().sendKeys("Hi");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('Hello Welcome')");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

	}

}
