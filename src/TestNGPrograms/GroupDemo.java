package TestNGPrograms;

import org.testng.annotations.Test;

public class GroupDemo {
  @Test(groups = "Two Wheeler")
  public void TVS() {
	  System.out.println("TVS JUpiter");
  }
  
  @Test(groups = "Two Wheeler")
  public void Honda() {
	  System.out.println("Honda Activa");
  }
  
  @Test(groups = "Four Wheeler")
  public void Suzuki() {
	  System.out.println("Maruti Suzuki");
  }
  
  @Test(enabled = false, groups = "Four Wheeler")
  public void Tata() {
	  System.out.println("Tata Harrier");
  }
  
}
