package Selenium_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Absolute xpath
		/*WebElement Email=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
		WebElement Pass=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input"));
		WebElement Login=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));*/
		
		//Relative xpath basic
		WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Pass=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		
		//Relative xpath with parent child
		//WebElement ForgotPass=driver.findElement(By.xpath("//div[@class='_6ltj']//a"));
		
		//Relative xpath with contains
		//WebElement CreateNewAcc=driver.findElement(By.xpath("//a[contains(@id,'u_0_2')]"));
		
		//Relative xpath (contains with text)
		WebElement Login=driver.findElement(By.xpath("//button[contains(text(),'Log')]"));
		
		//Relative xpath with text
		WebElement CreateNewAcc=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		
		Email.sendKeys("poonamnj88@gmail.com");
		Pass.sendKeys("12345");
		//Login.click();
		//ForgotPass.click();
		CreateNewAcc.click();
	}

}
