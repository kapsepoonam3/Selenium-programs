package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class KiteDemo {
	public WebDriver driver;
	public Actions action;
	
  @Test
  public void mouseClickActions() {
	    driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement add = driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']"));
		add.click();
		
		WebElement DoubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement Click = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		action = new Actions(driver);
		action.doubleClick(DoubleClick).perform();
		action.contextClick(RightClick).perform();
		action.click(Click).perform();
  }
  @Test
  public void dragAndDrop() {
  driver.get("https://demoqa.com/droppable");
	WebElement Drag = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));
	action = new Actions(driver);
	action.dragAndDrop(Drag, Drop).perform();
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
	  driver = new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
