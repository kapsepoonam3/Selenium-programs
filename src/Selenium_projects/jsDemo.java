package Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class jsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='poonamnj88@gmail.com';");
		js.executeScript("document.getElementById('pass').value='233455';");
		
		//WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		//js.executeScript("arguments[0].click();", login);
		
		//WebElement term = driver.findElement(By.xpath("//a[text()='Terms']"));
		//js.executeScript("arguments[0].scrollIntoView(true);", term);
		js.executeScript("window.scrollBy(0,500)");

	}

}
