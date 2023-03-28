package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(ListenerTestNG.class)
public class TestNG {
	public WebDriver driver;
	@Test
	public void LaunchBrowser() {
		driver = new FirefoxDriver();
	}
	@Test(priority = 3,dependsOnMethods = "LaunchBrowser")  //Success Test
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test(priority = 1,dependsOnMethods = "LaunchBrowser") //Failed Test
	public void OpenBrowser() {
	        
	        driver.get("https://demoqa.com");
	        String expectedTitle = "DEMOQA";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle, "Titles of the website do not match");
  }
	@Test(priority = 2,timeOut = 7000, dependsOnMethods = "LaunchBrowser")
	public void Login() throws InterruptedException {
		  driver.get("https://demoqa.com/login");
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
		  System.out.println("User not successfully logged in bookstore");
		  sassert.assertAll();
	}
	private int i = 2;

	@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
	public void AccountTest() {
			if(i < 2) {
				Assert.assertEquals(i , i);
		i++;
			}
	}
	
	@Test  // Skip Test
	public void SkipTest() {
		throw new SkipException("Skipping The Test Method ");
	}
	@Test
	public void Test2()
	{
		Assert.assertEquals(false, true);
	}
}
