package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	//	WebElement Email = driver.findElement(By.className("inputtext"));
		WebElement Email = driver.findElement(By.name("email"));
		Email.sendKeys("ravinangre@gmail.com");

	//	WebElement Password = driver.findElement(By.className("_9npi"));
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("1234567");
		
	//	WebElement LoginBtn = driver.findElement(By.className("_42ft"));
		WebElement LoginBtn = driver.findElement(By.name("login"));
		LoginBtn.click();
		
		
	}

}
