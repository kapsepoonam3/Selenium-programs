package Selenium_projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement add = driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']"));
		add.click();
		
		WebElement DoubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement Click = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions action = new Actions(driver);
		action.doubleClick(DoubleClick).perform();
		action.contextClick(RightClick).perform();
		action.click(Click).perform();
		
		driver.get("https://demoqa.com/droppable");
		WebElement Drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		action.dragAndDrop(Drag, Drop).perform();
		
		
	}

}
