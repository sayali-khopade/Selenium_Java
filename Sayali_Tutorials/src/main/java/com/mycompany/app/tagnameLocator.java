package com.mycompany.app;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagnameLocator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement userEmail = driver.findElement(By.id("email"));
		userEmail.sendKeys("ravinangre@gmail.com");
		WebElement Password = driver.findElement(By.id("pass"));
		Password.sendKeys("12345432");
		
		WebElement LoginBtn = driver.findElement(By.tagName("button"));
	//	LoginBtn.click();
		
		List<WebElement> links = driver.findElements(By.tagName("anchor"));
		System.out.println("Links on Facebook page "+links.size());
		
		List<WebElement> inputs = driver.findElements(By.tagName("input"));
		System.out.println("Input tags in facebook page "+inputs.size());
	}

}
