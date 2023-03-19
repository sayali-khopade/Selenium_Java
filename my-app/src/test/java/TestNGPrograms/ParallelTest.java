package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class ParallelTest {
  @Test
  public void chromeTest() throws InterruptedException {
	  System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  UserName.sendKeys("ravi.nangare");
	  Password.sendKeys("Qwerty@123");
	  js.executeScript("arguments[0].click()", loginBtn);
	  Thread.sleep(2000);
  }
  @Test
  public void firefoxTest() throws InterruptedException {
	  System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/login");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
	  UserName.sendKeys("ravi.nangare");
	  Password.sendKeys("Qwerty@123");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", loginBtn);
	  Thread.sleep(2000);
  }
  @Test
  public void EdgeTest() throws InterruptedException {
	  System.out.println("The thread ID for Edge is "+ Thread.currentThread().getId());
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/login");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
	  UserName.sendKeys("ravi.nangare");
	  Password.sendKeys("Qwerty@123");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", loginBtn);
	  Thread.sleep(2000); 
  }
}
