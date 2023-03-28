package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class MultiBrowserTest {
	public WebDriver driver;
  @Test
  public void login() throws InterruptedException {
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
	  UserName.sendKeys("ravi.nangare");
	  Password.sendKeys("Qwerty@123");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", loginBtn);
	  Thread.sleep(2000);
	  String currenturl = "https://demoqa.com/profile";
	  String ActualPageUrl = driver.getCurrentUrl();
	  SoftAssert sassert = new SoftAssert(); // Soft Assert
	  sassert.assertEquals(currenturl, ActualPageUrl);
	  System.out.println("User successfully logged in bookstore");
	  sassert.assertAll();
  }
  @Test
  public void logout() {
	  WebElement LogoutBtn = driver.findElement(By.xpath("//button[text()='Log out']"));
	  LogoutBtn.click();
  }
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String browser) {
	  if(browser.equalsIgnoreCase("firefox")) {
		  driver = new FirefoxDriver();
	  }
	  else if (browser.equalsIgnoreCase("chrome")) {
		  driver = new ChromeDriver();
	}
	  else if (browser.equalsIgnoreCase("edge")) {
		driver = new EdgeDriver();
	}
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/login");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
