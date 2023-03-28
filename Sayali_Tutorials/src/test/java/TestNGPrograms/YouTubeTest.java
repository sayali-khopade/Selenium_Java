package TestNGPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YouTubeTest {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement Search = driver.findElement(By.xpath("//input[@id='search']"));
	  WebElement SearchBox = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
	  
	  Search.sendKeys("Taal");
	  SearchBox.click();
	  
	  
	  driver.get("https://www.google.com/");
	  WebElement SearchBox1 = driver.findElement(By.xpath("//input[@title='Search']"));
	  SearchBox1.sendKeys("Automation Testing");
	  WebElement GoogleSearch = driver.findElement(By.xpath("(//input[@value='Google Search' and @class='gNO89b'])[2]"));
	  
	  Thread.sleep(2000);
	 // WebElement SelectResult = driver.findElement(By.xpath("(//ul[@role='listbox']//li)[3]"));
	 // SelectResult.click();
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click()", GoogleSearch);
	 
	 driver.get("https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise");
	 WebElement ReleaseDate = driver.findElement(By.xpath("//tr//th//div[text()='Release date']//parent::th//following-sibling::td//li"));
	 System.out.println(ReleaseDate.getText());
  }
}
