package Selenium_projects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String Parent = driver.getWindowHandle();
		WebElement company = driver.findElement(By.xpath("//div[text()='Companies']"));
		company.click();
		
		Set<String> child = driver.getWindowHandles();
		Iterator<String> i = child.iterator();
		
		while(i.hasNext()) {
			String child1 = i.next();
			if(!Parent.equalsIgnoreCase(child1));
			{
				driver.switchTo().window(child1);
				
			}
		}
		
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='skill']//input[@class='sugInp']")).sendKeys("Selenium Webdriver");
		//driver.quit();
		}

}
