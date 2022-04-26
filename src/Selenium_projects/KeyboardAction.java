package Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement add = driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']"));
		add.click();
		
		WebElement fullname = driver.findElement(By.xpath("//input[@id='userName']"));
		fullname.sendKeys("Poonam Kapse");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB);
		action.sendKeys("kapsepoonam3@gmail.com");
		action.build().perform();
		
		action.sendKeys(Keys.TAB);
		action.sendKeys("Pune");
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.sendKeys(Keys.TAB).perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
		action.sendKeys(Keys.TAB).perform();
		action.click(submit).perform();
		//action.build().perform();
				
	}

}