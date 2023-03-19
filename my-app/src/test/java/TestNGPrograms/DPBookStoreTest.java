package TestNGPrograms;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class DPBookStoreTest {
	public WebDriver driver;
  @Test(dataProvider = "bookStore")
  public void login(String username, String password) throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demoqa.com/login");
	  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
	  UserName.sendKeys(username);
	  Password.sendKeys(password);
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()", loginBtn);
	  Thread.sleep(2000);
	  String currenturl = "https://demoqa.com/profile";
	  String ActualPageUrl = driver.getCurrentUrl();
	  Assert.assertEquals(currenturl, ActualPageUrl);
	  System.out.println("User successfully logged in bookstore");
  }

  @DataProvider
  public Object[][] bookStore() {
    return new Object[][] {
      new Object[] { "ravi.nangare", "Qwerty@123" },
      new Object[] { "ravi.nangare1", "Qwerty@123" },
      new Object[] { "ravi.nangre", "Qwerty@123" },
    };
  }
}
