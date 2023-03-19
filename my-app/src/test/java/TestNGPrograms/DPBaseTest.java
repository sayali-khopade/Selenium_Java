package TestNGPrograms;

import org.testng.annotations.DataProvider;

public class DPBaseTest {
	@DataProvider
	  public Object[][] bookStore() {
	    return new Object[][] {
	      new Object[] { "ravi.nangare", "Qwerty@123" },
	      new Object[] { "ravi.nangare1", "Qwerty@123" },
	      new Object[] { "ravi.nangre", "Qwerty@123" },
	    };
	  }
}
