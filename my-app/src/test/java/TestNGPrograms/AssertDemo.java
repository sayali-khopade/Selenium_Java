package TestNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	public WebDriver driver;
@Test
public void assertdemo1() {
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String fbtitle = "facebook – log in or sign up";
	String FBActualTitle = driver.getTitle();
	Assert.assertEquals(FBActualTitle, fbtitle,"Assertion Failed due to first letter of title");
	System.out.println("Test Failed");
}
@Test
public void softAssertDemo() throws InterruptedException {
	  driver.get("https://demoqa.com/login");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
	  UserName.sendKeys("ravi.nangare");
	  Password.sendKeys("Qwert@123");
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
}
