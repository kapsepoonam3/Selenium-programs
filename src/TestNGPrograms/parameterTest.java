package TestNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {
	@Test
	@Parameters({"val1","val2"})
	public void sum(int v1, int v2) {
		int finalsum = v1+v2;
		System.out.println(finalsum);
		int expectedsum = 29;
		Assert.assertEquals(finalsum, expectedsum);
  }
}
