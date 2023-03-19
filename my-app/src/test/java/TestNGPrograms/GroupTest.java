package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	public WebDriver driver;
  @Test(priority = 1, groups = {"sanity","regression"})
  public void launchBrowser() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
  }
  @Test(priority = 2,groups = {"sanity","regression"})
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
	  System.out.println("Login Test Successfull");
  }
  @Test(priority = 3,groups = "regression")
  public void searchBook() {
	  WebElement SearchBox = driver.findElement(By.xpath("//input[@id='searchBox']"));
	  SearchBox.sendKeys("Learning");
	  WebElement LearningBook = driver.findElement(By.xpath("//a[text()='Learning JavaScript Design Patterns']"));
	  Assert.assertTrue(LearningBook.isDisplayed());
	  System.out.println("Search Functionality is working as expected");
  }
  @Test(priority = 4,groups = {"sanity","regression"})
  public void logout() {
	  WebElement LogoutBtn = driver.findElement(By.xpath("//button[text()='Log out']"));
	  LogoutBtn.click();
	  System.out.println("Logout Test");
	  driver.close();
  }
}
