package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupTest1 {
	public WebDriver driver;
	  @Test(priority = 1, groups = {"sanity","regression"})
	  public void launchBrowser() {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
	  }
	  @Test(priority = 2,groups = {"regression"})
	  public void login() throws InterruptedException {
		  driver.get("https://www.facebook.com");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement loginBtn = driver.findElement(By.xpath("//button[text()='Log in']"));
		  UserName.sendKeys("ravi.nangare");
		  Password.sendKeys("Qwerty@123");
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()", loginBtn);
		  Thread.sleep(2000);
		  System.out.println("Login Test Un-Successfull");
	  }
	
	  @Test(priority = 3,groups = {"sanity","regression"})
	  public void closeBrowser() {
		  System.out.println("Logout Test");
		  driver.close();
	  }
}
