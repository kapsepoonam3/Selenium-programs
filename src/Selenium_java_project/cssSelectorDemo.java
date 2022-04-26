package Selenium_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		WebElement firstname=driver.findElement(By.cssSelector("input#firstName.mr-sm-2.form-control"));
		firstname.sendKeys("Poonam");
		
		WebElement email=driver.findElement(By.cssSelector("input#userEmail"));
		email.sendKeys("poonamnj88@gmail.com");
		
		WebElement male=driver.findElement(By.cssSelector("label[for='gender-radio-1'].custom-control-label"));
		male.click();
		
		WebElement mobile=driver.findElement(By.cssSelector("div.col-md-9.col-sm-12>input[id^='userN']"));
		mobile.sendKeys("6756765432");
		
		//WebElement DOB=driver.findElement(By.cssSelector("input[id$='thInput']"));
		//DOB.click();
		
		WebElement Address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		Address.sendKeys("Pune");
		
		WebElement Hobbies=driver.findElement(By.xpath("//label[@class='custom-control-label'][text()='Sports']"));
		Hobbies.click();
		
		WebElement Hobbie=driver.findElement(By.xpath("//label[@class='custom-control-label'][text()='Reading']"));
		Hobbie.click();
		
		
	}

}
