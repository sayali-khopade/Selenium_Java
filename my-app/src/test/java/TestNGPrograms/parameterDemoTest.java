package TestNGPrograms;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterDemoTest {
@Test
@Parameters({"val1","val2"})
public void sum(@Optional("10")Integer v1,@Optional("20") Integer v2) {
	int FinalSum = v1 + v2 ;
	System.out.println(FinalSum);
}

}
