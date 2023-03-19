package TestNGPrograms;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelDemo {
	public WebDriver driver;
	@Test(threadPoolSize = 2,invocationCount = 2,timeOut = 10000,expectedExceptions = TimeoutException.class)
	public void ParallelTest() {
		System.out.println("The thread ID for Parallel Test is "+ Thread.currentThread().getId());
	    driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
}
