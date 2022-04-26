package Selenium_java_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Jars\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		/*driver.get("https://www.google.com");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);*/
		JavascriptExecutor js=(JavascriptExecutor)driver;//type cast
		js.executeScript("window.location='https://kite.zerodha.com'");
				
		driver.navigate().refresh();
		//driver.quit();
		WebElement userid=driver.findElement(By.id("userid"));
		userid.sendKeys("XA0634");
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("123458");
		
		//WebElement LoginBtn=driver.findElement(By.tagName("button"));
		WebElement LoginBtn=driver.findElement(By.className("button-orange"));
		LoginBtn.click();
		
		List <WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		driver.navigate().to("https://www.facebook.com/");
		List <WebElement> Link=driver.findElements(By.tagName("a"));
		System.out.println(Link.size());
	}

}
