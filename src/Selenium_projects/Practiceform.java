package Selenium_projects;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practiceform {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://demoqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement add = driver.findElement(By.xpath("//img[@title='Ad.Plus Advertising']"));
		add.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Poonam");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("kapsepoonam3@gmail.com");
		
		WebElement gender = driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
		gender.click();
		
		WebElement hobby = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-2']"));
		hobby.click();
		
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		WebElement Month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select month = new Select(Month);
		month.selectByVisibleText("July");
		
		WebElement Year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select year = new Select(Year);
		year.selectByValue("1988");
		
		WebElement Day = driver.findElement(By.xpath("//div[text()='19']"));
		Day.click();
		
		WebElement sub = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		//sub.click();
		//Thread.sleep(2000);
		sub.sendKeys("E");
		driver.findElement(By.xpath("//*[text()='English']")).click();
		
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'Toolsqa.jpg')]"));
		System.out.println(logo.isDisplayed());
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\admin\\eclipse-workspace\\Selenium\\"+Timestamp()+".jpeg"));
		
		Actions action = new Actions(driver);
		WebElement pic = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		action.moveToElement(pic).click().perform();
		pic.sendKeys("F:\\2.jpg");
		
		
		WebElement address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		//action.moveToElement(address).perform();
		address.sendKeys("Pune");
				
		/*driver.get("https://demoqa.com/select-menu");
		driver.findElement(By.xpath("//div[@id='withOptGroup']//div[@class=' css-yk16xz-control']")).click();
		driver.findElement(By.xpath("//div[text()='Group 2, option 1']")).click();
		
		driver.get("https://demoqa.com/dynamic-properties");
		WebElement color = driver.findElement(By.xpath("//button[@id='colorChange']"));
		System.out.println(color.getCssValue("color"));
		Thread.sleep(5000);
		System.out.println(color.getCssValue("color"));*/
		
		driver.findElement(By.xpath("//div[text()='Select State']")).click();
		driver.findElement(By.xpath("//div[text()='Haryana']")).click();
		
		driver.findElement(By.xpath("//div[text()='Select City']")).click();
		driver.findElement(By.xpath("//div[text()='Panipat']")).click();
		
		WebElement submit = driver.findElement(By.xpath("//button[text()='Submit']"));
		action.moveToElement(submit).click().perform();
		System.out.println("Submitted successfully");
	}
	public static String Timestamp() {
		return new SimpleDateFormat("yyyy-dd-MM HH-mm-ss").format(new Date());
				
	}

}

