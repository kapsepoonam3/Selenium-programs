package Selenium_java_project;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;//type cast
		js.executeScript("window.location='https://kite.zerodha.com'");
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		driver.close();

	}

}
