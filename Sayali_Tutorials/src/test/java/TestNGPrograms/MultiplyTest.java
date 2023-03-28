package TestNGPrograms;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplyTest {
  @Test
  @Parameters({"val1","val2"})
  public void mul(int v1, int v2) {
	  int prod = v1 * v2;
	  System.out.println("Final prod is "+prod);
  }
}
