package com.mycompany.app;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromProp {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Selenium_September_2022\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("testurl"));

		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys(prop.getProperty("username"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='pass']"));
		Password.sendKeys(prop.getProperty("password"));
		WebElement LoginBtn = driver.findElement(By.tagName("button"));
		LoginBtn.click();
	}

}
