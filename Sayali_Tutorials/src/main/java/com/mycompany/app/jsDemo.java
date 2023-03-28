package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.location='https://www.google.com'");
		
		js.executeScript("alert('Welcome to Google')");
		
		driver.switchTo().alert().accept();
		
		WebElement SearchTextBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		
	//	SearchTextBox.sendKeys("Indian Cricket Team");
		
		js.executeScript("arguments[0].value='Indian Cricket Team'", SearchTextBox);
		
		WebElement GoogleSearchBtn = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']"));
		
		js.executeScript("arguments[0].click()", GoogleSearchBtn);
		
	//	System.out.println(driver.getTitle());
	//	System.out.println(driver.getCurrentUrl());
		
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		String title = js.executeScript("return document.title;").toString();
		System.out.println(title);
		
		String domain = js.executeScript("return document.domain;").toString();
		System.out.println(domain);
		
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(2000);
		
		WebElement HelpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
	
		js.executeScript("arguments[0].scrollIntoView(true)", HelpBtn);
	}

}
