package Selenium_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		
		WebElement search=driver.findElement(By.cssSelector("input#search"));
		search.sendKeys("Mr.bean");
	}

}
