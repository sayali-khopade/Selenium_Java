package TestNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class AnnotationTest {
	public WebDriver driver;
  @Test(priority = 1)
  public void login() throws InterruptedException {
	  driver.get("https://demoqa.com/login");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
	  UserName.sendKeys("ravi.nangare");
	  Password.sendKeys("Qwerty@123");
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", loginBtn);
	  Thread.sleep(2000);
	  System.out.println("Login Test");
  }
  @Test(priority = 2)
  public void Home() {
	  String currenturl = "https://demoqa.com/profile";
	  String ActualPageUrl = driver.getCurrentUrl();
	  Assert.assertEquals(currenturl, ActualPageUrl);
	  WebElement currentuserid = driver.findElement(By.xpath("//label[text()='ravi.nangare']"));
	  Assert.assertEquals(currentuserid.isDisplayed(), true);
	  System.out.println("Home Test");
  }
  @Test(priority = 3)
  public void logout() {
	  WebElement LogoutBtn = driver.findElement(By.xpath("//button[text()='Log out']"));
	  LogoutBtn.click();
	  System.out.println("Logout Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Execute before every Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Execute After Every Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Runs before execute all tests");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Runs After execute all tests");
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("TestNG runs before the execution of all the test methods that are inside that folder");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("TestNG runs after the execution of all the test methods that are inside that folder");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("TestNG will run before the first method invokes of the current class.");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("TestNG will execute after all the test methods of the current class execute.");
  }
}
