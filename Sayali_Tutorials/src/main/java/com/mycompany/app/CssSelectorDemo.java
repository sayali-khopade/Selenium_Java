package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CssSelectorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
//		WebElement userEmail = driver.findElement(By.cssSelector("input#email"));
		
// Starts with
		
		WebElement userEmail = driver.findElement(By.cssSelector("div._6lux>input"));
		
		
		
	//	WebElement userEmail = driver.findElement(By.cssSelector("input.inputtext._55r1._6luy#email"));		
		userEmail.sendKeys("ravinangre@gmail.com");
		
	//	WebElement Password = driver.findElement(By.cssSelector("input#pass[name='pass'].inputtext._55r1._6luy._9npi"));
		WebElement Password = driver.findElement(By.cssSelector("div._6lux>div>input"));
		
		Password.sendKeys("123454321");
		
		WebElement LoginBtn = driver.findElement(By.cssSelector("button[name='login']"));
		LoginBtn.click();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/reg/");
		
//		driver.findElement(By.cssSelector("select#day>option:nth-of-type(30)")).click();
//		driver.findElement(By.cssSelector("select#month>option:nth-of-type(3)")).click();
//		driver.findElement(By.cssSelector("select#year>option:nth-of-type(24)")).click();
//		
		
		WebElement FirstName = driver.findElement(By.cssSelector("input[name^='fir']"));
		FirstName.sendKeys("ravi");
		
		WebElement Mobile = driver.findElement(By.cssSelector("input[name$='email__']"));
		Mobile.sendKeys("9423111564");
		
		WebElement password = driver.findElement(By.cssSelector("input[name*='g_pa']"));
		password.sendKeys("123432134");
		
		Select day =new  Select(driver.findElement(By.id("day")));
		day.selectByIndex(29);
		day.selectByValue("30");
		day.selectByVisibleText("22");
	}

}
