package Selenium_projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		/*WebElement userid=driver.findElement(By.name("email"));
		userid.sendKeys("poonamnj88@gmail.com");
		
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("12345");
		
		//WebElement LoginBtn=driver.findElement(By.tagName("button"));
		//LoginBtn.click();
		
		WebElement Login=driver.findElement(By.linkText("Forgotten password?"));
		Login.click();*/
		
		WebElement userid= driver.findElement(By.cssSelector("input#email"));
		userid.sendKeys("poonamnj88@gmail.com");
		
		WebElement password=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy._9npi"));
		password.sendKeys("pari5poo@fb");
		
		WebElement Login =driver.findElement(By.cssSelector("button[type='submit']"));
		Login.click();
	}

}
