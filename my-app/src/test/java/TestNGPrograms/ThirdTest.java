package TestNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdTest {
	public WebDriver driver;
@Test
public void first() {
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
}
}
