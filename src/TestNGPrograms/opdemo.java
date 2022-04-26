package TestNGPrograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class opdemo {
  @Test
  @Parameters("message")
  public void Op(@Optional("Optional Parameters Selected")String message1) {
	  System.out.println(message1);
  }
}
