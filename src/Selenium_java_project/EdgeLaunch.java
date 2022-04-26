package Selenium_java_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "F:\\Selenium Jars\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();

	}

}
