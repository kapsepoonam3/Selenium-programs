package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationDemo {
  @Test
  public void f() {
	  System.out.println("First Test");
  }
  @Test
  public void s() {
	  System.out.println("Second Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Execute Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Execute After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Execute Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Execute After Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Execute Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Execute After Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Execute Before Suit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Execute After Suit");
  }

}
